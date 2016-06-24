
package de.hsbochum.fbg.kswe.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class UnsupportedCountryException extends Exception {

    public UnsupportedCountryException(String message) {
        super(message);
    }

    public UnsupportedCountryException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
