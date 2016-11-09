package ociv.holiday.client.HolidayClient;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ociv.holiday.client.HolidayClient.entity.Holiday;

/**
 * Hello world!
 *
 */
public class App 
{    
    private static final Logger log = LoggerFactory.getLogger(App.class);
    
    public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException {
        
        URL url = new URL("http://www.kayaposoft.com/enrico/json/v1.0/?action=getPublicHolidaysForDateRange&fromDate=04-07-2012&toDate=04-07-2014&country=usa&region=District+Of+Columbia");
        Collection<Holiday> readValues = new ObjectMapper().readValue(url, new TypeReference<Collection<Holiday>>() { });
        
        log.info(readValues.toString());
    }
}
