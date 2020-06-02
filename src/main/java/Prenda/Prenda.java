package Prenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import Usuario.*;

public class Prenda extends Borrador {

    public Prenda(Borrador builder) throws CreadorPrendaException {
        validarAtributos(new ArrayList<>(Arrays.asList(builder.getTipoPrenda(),builder.getTela(),builder.getColorPrimario(),builder.getTrama())));
        this.tipoPrenda = builder.getTipoPrenda();
        this.tela = builder.getTela();
        this.colorPrimario = builder.getColorPrimario();
        this.colorSecundario = builder.getColorSecundario();
        this.trama = builder.getTrama();
    }


    public Categoria categoria(){
        return tipoPrenda.categoria();
    }

    public TipoPrenda tipoPrenda(){
        return tipoPrenda;
    }

    public void validarAtributos(ArrayList<Object> atributos)throws CreadorPrendaException {
        if(atributos.stream().anyMatch(Objects::isNull)){
            throw new CreadorPrendaException("Los faltan atributos para crear la prenda");
        }
    }



}
