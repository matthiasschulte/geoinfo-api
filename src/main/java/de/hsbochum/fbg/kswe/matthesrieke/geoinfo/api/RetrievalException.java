
package de.hsbochum.fbg.kswe.matthesrieke.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class RetrievalException extends Exception {

    public RetrievalException(String message) {
        super(message);
    }

    public RetrievalException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
