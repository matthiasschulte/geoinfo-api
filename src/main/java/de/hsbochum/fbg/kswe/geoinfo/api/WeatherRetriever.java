package de.hsbochum.fbg.kswe.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public interface WeatherRetriever {
    
    Weather retrieve(City city);
    
}
