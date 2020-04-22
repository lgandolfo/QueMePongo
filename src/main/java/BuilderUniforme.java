public class BuilderUniforme {

    private Prenda prendaSuperior = null;
    private Prenda prendaInferior = null;
    private Prenda prendaCalzado = null;
    private Prenda prendaAccesorio = null;


    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public Prenda getPrendaCalzado() {
        return prendaCalzado;
    }

    public Prenda getPrendaAccesorio() {
        return prendaAccesorio;
    }

    public void setPrendaSuperior(Prenda prendaSuperior) throws CreadorUniformeException {
        validarPrenda(prendaSuperior,Categoria.superior);
        this.prendaSuperior = prendaSuperior;
    }

    public void setPrendaInferior(Prenda prendaInferior) throws CreadorUniformeException{
        validarPrenda(prendaSuperior,Categoria.inferior);
        this.prendaInferior = prendaInferior;
    }

    public void setPrendaCalzado(Prenda prendaCalzado) throws CreadorUniformeException{
        validarPrenda(prendaSuperior,Categoria.calzado);
        this.prendaCalzado = prendaCalzado;
    }

    public void setPrendaAccesorio(Prenda prendaAccesorio)throws CreadorUniformeException {
        validarPrenda(prendaSuperior,Categoria.accesorio);
        this.prendaAccesorio = prendaAccesorio;
    }


    public Uniforme crearUniforme(){
        Uniforme uniforme = new Uniforme(this);
        return uniforme;
    }

    private void validarPrenda(Prenda prenda, Categoria categoria) throws CreadorUniformeException {
        if (prenda.categoria() != categoria){
            throw new CreadorUniformeException("La categoria de la es" + prenda.categoria().toString() + "y la categoria solicitada es " + categoria.toString());
        }
    }

}
