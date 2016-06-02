
package de.hsbochum.fbg.kswe.matthesrieke.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class City {
    
    private final String city;
    private final Country country;

    public City(String city, Country country) {
        this.city = city;
        this.country = country;
    }
    
    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

}
