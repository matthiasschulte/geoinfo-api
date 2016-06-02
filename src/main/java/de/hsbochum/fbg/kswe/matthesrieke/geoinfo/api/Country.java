
package de.hsbochum.fbg.kswe.matthesrieke.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Country {

    private final String name;
    private final String continent;

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
    
    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }
    
}
