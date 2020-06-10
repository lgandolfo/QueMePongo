package Guardarropa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import Atuendo.*;
import Prenda.*;

public class Guardarropa {



    private Set<Prenda> prendas = new HashSet<Prenda>();
    private List<Propuesta> propuestas = new ArrayList<>();
    private List<Propuesta> propuestasAceptadas = new ArrayList<>();


    public void propuestaAgregar(Prenda prenda){
        propuestas.add(new AgregarPrenda(prenda));
    }

    public void propuestaQuitar(Prenda prenda){
        propuestas.add(new QuitarPrenda(prenda));
    }

    public void aplicarPropuesta(Propuesta propuesta){
        propuesta.aplicar(this);
        propuestas.remove(propuesta);
        propuestasAceptadas.add(propuesta);
    }

    public void deshacerPropuesta(Propuesta propuesta){
        propuesta.deshacer(this);
        propuestasAceptadas.remove(propuesta);
    }

    public void quitarPrenda(Prenda prenda){
        prendas.remove(prenda);
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public List<Propuesta> getPropuestas() {
        return propuestas;
    }

    public void setPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public Set<Atuendo> crearAtuendos(){
        return GeneradorDeAtuendos.getSingletonInstance().generarAtuendosValidos(this.prendas);
    }

    public Atuendo obtenerUnAtuendo(){
        return (Atuendo) crearAtuendos().stream().toArray()[0];
    }


}
