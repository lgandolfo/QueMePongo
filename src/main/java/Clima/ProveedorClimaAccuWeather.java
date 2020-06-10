package Clima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProveedorClimaAccuWeather implements ProveedorClima {

    private AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();
    private List<ObserverClima> observerClimas = new ArrayList<ObserverClima>();


    @Override
    public double obtenerTemperatura(String ciudad){

        HashMap<String,Object> datos = (HashMap<String, Object>) accuWeatherAPI.getWeather(ciudad).get(0).get("Temperature");
        int temperatura = (int) datos.get("Value");
        return (temperatura-32)*5/9;

    }

    public List<String> obtenerAlertas(String ciudad){
        return accuWeatherAPI.getAlertas(ciudad).get(ciudad);
    }

    public void setObserverClimas(ObserverClima observerClima){
        observerClimas.add(observerClima);
    }
}
