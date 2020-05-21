import org.junit.Assert;
import org.junit.Test;

public class ProveedorClimaTest {

    AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();

    @Test
    public void obtieneLaTemperaturaCorrecta(){
        Assert.assertEquals(13.8,accuWeatherAPI.obtenerTemperatura("Buenos Aires, Argentina"),1);
    }

}
