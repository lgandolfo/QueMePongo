package Uniforme;

import Prenda.*;
import Usuario.*;


public class BuilderUniformeSanJuan extends BuilderUniforme {
    @Override
    protected void crearPrendaSuperior() throws CreadorPrendaException {
    Prenda superior = new Borrador().
            setTipoPrenda(new TipoPrendaFactory().chomba()).
            setTela(Tela.pique).
            setColorPrimario(Color.verde).
            setTrama(Trama.lisa).
            crearPrenda();
    this.prendaSuperior = superior;

    }

    @Override
    protected void crearPrendaInferior() throws CreadorPrendaException {
        Prenda inferior = new Borrador().
                setTipoPrenda(new TipoPrendaFactory().pantalon()).
                setTela(Tela.acetato).
                setColorPrimario(Color.negro).
                setTrama(Trama.lisa).
                crearPrenda();
        this.prendaInferior = inferior;

    }

    @Override
    protected void crearPrendaCalzado() throws CreadorPrendaException {
        Prenda calzado = new Borrador().
                setTipoPrenda(new TipoPrendaFactory().zapatos()).
                setTela(Tela.cuero).
                setColorPrimario(Color.negro).
                setTrama(Trama.lisa).
                crearPrenda();
        this.prendaCalzado = calzado;

    }
}
