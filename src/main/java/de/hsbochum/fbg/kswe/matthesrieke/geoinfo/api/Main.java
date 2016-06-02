
package de.hsbochum.fbg.kswe.matthesrieke.geoinfo.api;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        WeatherRetrieverImpl retriever = new WeatherRetrieverImpl();

        LOG.info(retriever);        
        try {
            Weather weather = retriever.retrieveWeather(new City("Bochum", "Germany"));
            LOG.info(weather);
        }
        catch (UnsupportedCountryException | IOException e) {
            LOG.error("This country is not supported", e);
        }
        
        try {
            Weather weather = retriever.retrieveWeather(new City("Sydney", "Australia"));
            LOG.info(weather);
        }
        catch (UnsupportedCountryException | IOException e) {
            LOG.error("This country is not supported", e);
        }
    }
    
}
