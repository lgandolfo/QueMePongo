import Clima.ProveedorClima;
import Clima.ProveedorClimaAccuWeather;
import org.junit.Assert;
import org.junit.Test;

public class ProveedorClimaTest {

    ProveedorClima accuWeatherAPI = new ProveedorClimaAccuWeather();

    @Test
    public void obtieneLaTemperaturaCorrecta(){
        Assert.assertEquals(13.8,accuWeatherAPI.obtenerTemperatura("Buenos Aires, Argentina"),1);
    }

}
