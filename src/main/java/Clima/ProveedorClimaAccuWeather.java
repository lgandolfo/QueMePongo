package Clima;

import Usuario.Observer;
import Usuario.RepositorioUsuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProveedorClimaAccuWeather implements ProveedorClima {

    private AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI();



    @Override
    public double obtenerTemperatura(String ciudad){

        HashMap<String,Object> datos = (HashMap<String, Object>) accuWeatherAPI.getWeather(ciudad).get(0).get("Temperature");
        int temperatura = (int) datos.get("Value");
        return (temperatura-32)*5/9;

    }

    public List<String> obtenerAlertas(String ciudad){
        List<String> alertas = accuWeatherAPI.getAlertas(ciudad).get(ciudad);
        RepositorioUsuarios.getInstance().getUsuariosActivos().forEach(usuario -> usuario.seActualizaronAlertas(alertas));
        return alertas;

    }


}
