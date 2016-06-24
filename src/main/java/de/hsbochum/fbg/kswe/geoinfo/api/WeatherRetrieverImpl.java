
package de.hsbochum.fbg.kswe.geoinfo.api;

import java.io.IOException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class WeatherRetrieverImpl {
    
    private static final String API_KEY = "d5396baed14be1f2cf0bba5739f33b21";
    private final OpenWeatherMap owm;
    
    public WeatherRetrieverImpl() {
        owm = new OpenWeatherMap(API_KEY);
    }
    
    public Weather retrieve(City city) throws UnsupportedCountryException, IOException {
        if (!"germany".equalsIgnoreCase(city.getCountry())) {
            throw new UnsupportedCountryException("Country not supported!");
        }
        
        Weather weather = new Weather(city);
        CurrentWeather cwd = owm.currentWeatherByCityName(city.getCity(), city.getCountry());
        weather.setTemp(cwd.getMainInstance().getTemperature());
        return weather;
    }
    
}
