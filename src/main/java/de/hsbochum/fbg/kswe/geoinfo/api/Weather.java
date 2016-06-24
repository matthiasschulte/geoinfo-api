
package de.hsbochum.fbg.kswe.geoinfo.api;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Weather {
    
    private float temp;
    private float windSpeed;
    private float rain;
    private final City city;

    public Weather(City city) {
        this.city = city;
    }
    
    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public float getRain() {
        return rain;
    }

    public float getTemp() {
        return temp;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public City getCity() {
        return city;
    }
    
}
