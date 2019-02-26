/**
 * 
 */
package domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @author User
 *
 */

@RestController
public class MortgageRatesListController {
	
	final String RATES_FILE_NAME = "src/main/java/domain/resources/mortgageRates.json";
	
	@RequestMapping(value = "/api/interest-rates", method = RequestMethod.GET)
	public Iterator<Object[]> readRatesFromJson() throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(RATES_FILE_NAME)))) {
            String json = "";
            String line = reader.readLine();
            while(line != null) {
                json += line;
                line = reader.readLine();
            }
            Gson gson = new Gson();
            List<MortgageRate> mortgageRates = gson.fromJson(json, new TypeToken<List<MortgageRate>>(){}.getType()); 
            return mortgageRates.stream().map((g) -> new Object[] {g}).collect(Collectors.toList()).iterator();
        }
    }
	
}
