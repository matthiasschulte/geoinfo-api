package de.hsbochum.fbg.kswe.matthesrieke.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public interface WeatherRetriever {
    
    Weather retrieveWeather(City city);
    
    Weather retrieveForecast(City city);
    
}
