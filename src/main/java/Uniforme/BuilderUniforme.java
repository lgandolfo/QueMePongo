package Uniforme;

import Prenda.Prenda;
import Usuario.*;
import Uniforme.Uniforme;

public abstract class BuilderUniforme {

    protected Prenda prendaSuperior = null;
    protected Prenda prendaInferior = null;
    protected Prenda prendaCalzado = null;

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public Prenda getPrendaCalzado() {
        return prendaCalzado;
    }


    public Uniforme crearUniforme() throws CreadorPrendaException {
        this.crearPrendaSuperior();
        this.crearPrendaInferior();
        this.crearPrendaCalzado();
        Uniforme uniforme = new Uniforme(this);
        return uniforme;
    }

    protected abstract void crearPrendaSuperior() throws CreadorPrendaException;
    protected abstract void crearPrendaInferior() throws CreadorPrendaException;
    protected abstract void crearPrendaCalzado() throws CreadorPrendaException;

}
