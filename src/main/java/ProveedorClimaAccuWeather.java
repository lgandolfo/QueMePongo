import java.util.HashMap;

public class ProveedorClimaAccuWeather implements ProveedorClima {


    @Override
    public double obtenerTemperatura(String ciudad){
        AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
        HashMap<String,Object> datos = (HashMap<String, Object>) accuWeatherAPI.getWeather(ciudad).get(0).get("Temperature");
        int temperatura = (int) datos.get("Value");
        return (temperatura-32)*5/9;

    }
}
