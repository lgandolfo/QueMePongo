import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Prenda {

    private Color colorPrimario;
    private Color colorSecundario;
    private Tela tela;
    private TipoPrenda tipoPrenda;


    public Prenda(TipoPrenda tipoPrenda, Tela tela,Color colorPrimario, Color colorSecundario)throws Exception{
        validarAtributos(new ArrayList<>(Arrays.asList(tipoPrenda,tela,colorPrimario,colorSecundario)));
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Prenda(TipoPrenda tipoPrenda, Tela tela, Color colorPrimario)throws Exception {
        validarAtributos(new ArrayList<>(Arrays.asList(tipoPrenda,tela,colorPrimario)));
        this.tipoPrenda = tipoPrenda;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = null;
    }

    public Categoria categoria(){
        return tipoPrenda.categoria();
    }

    public void validarAtributos(ArrayList<Object> atributos)throws CreadorPrendaException{
        if(atributos.stream().anyMatch(Objects::isNull)){
            throw new CreadorPrendaException("Los faltan atributos para crear la prenda");
        }
    }

}
