package Usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {

    private List<Usuario> usuariosActivos = new ArrayList<Usuario>();
    private static RepositorioUsuarios repositorioUsuarios;

    public static RepositorioUsuarios getInstance(){
        if(repositorioUsuarios==null){
            return new RepositorioUsuarios();
        }
        return repositorioUsuarios;
    }

     public void ejecutarSugerencias(){
        usuariosActivos.forEach(Usuario::obtenerSugerencias);
     }

     public void setUsuariosActivos(Usuario usuario){
        usuariosActivos.add(usuario);
     }

    public List<Usuario> getUsuariosActivos(){
        return usuariosActivos;
    }

}
