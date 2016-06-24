
package de.hsbochum.fbg.kswe.geoinfo.api;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class WeatherRetrieverImplTest {
    
    @Test
    public void testRetrieval() throws UnsupportedCountryException, IOException {
        WeatherRetrieverImpl retriever = new WeatherRetrieverImpl();
        
        Weather weather = retriever.retrieve(new City("Bochum", "Germany"));
        float temp = weather.getTemp();
        
        //check and assert a range that is suitable for °C
    }

}
