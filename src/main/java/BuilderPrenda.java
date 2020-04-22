import java.util.ArrayList;

public class BuilderPrenda {

    private Borrador borrador = new Borrador();

    public void setTipoPrenda(TipoPrenda tipoPrenda){
        //uno de los tipos creados en el factory
        borrador.setTipoPrenda(tipoPrenda);
    }

    public void setTela(Tela tela) throws CreadorPrendaException{
        //verificar que la tela corresponda a las disponibles en el tipos
        if(!borrador.getTipoPrenda().telasDisponibles().contains(tela)){
            throw new CreadorPrendaException("La tela elegida no puede usarse en este tipo de prenda");
        }
        borrador.setTela(tela);
    }

    public void setColorPrimario(Color colorPrimario){

       borrador.setColorPrimario(colorPrimario);
    }

    public void setColorSecundario(Color colorSecundario) {
        borrador.setColorPrimario(colorSecundario);
    }

    public void setTrama(Trama trama){
        //si no me dicen trama es liso
        borrador.setTrama(trama);
    }


    public TipoPrenda getTipoPrenda() {
        return borrador.getTipoPrenda();
    }

    public Tela getTela() {
        return borrador.getTela();
    }

    public Color getColorPrimario() {
        return borrador.getColorPrimario();
    }

    public Color getColorSecundario() {
        return borrador.getColorSecundario();
    }

    public Trama getTrama() {
        return borrador.getTrama();
    }

    public Prenda crearPrenda() throws CreadorPrendaException{
        //creo la prenda con todos los parametros que me dieron
            Prenda nueva = new Prenda(this);
            return nueva;
    }


}
