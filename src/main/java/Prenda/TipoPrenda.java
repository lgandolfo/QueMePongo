package Prenda;

import java.util.ArrayList;

public class TipoPrenda {

    private Categoria categoria;
    private int coeficienteAbrigo;
    private ArrayList<Tela> telasDisponibles;

    public TipoPrenda(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria categoria(){
        return categoria;
    }

    public void agregarTelasDisponibles(ArrayList<Tela> telas){
        this.telasDisponibles = telas;
    }

    public void setCoeficienteAbrigo(int coeficienteAbrigo){
        this.coeficienteAbrigo = coeficienteAbrigo;
    }

    public ArrayList<Tela> telasDisponibles(){
        return telasDisponibles;
    }
}
