import java.util.ArrayList;
import java.util.List;

public class PlataformaMusical {
	 
	//variables
	private List<Usuario> usuarios;
    private String nuevaCancion;

    //Constructor 
    public PlataformaMusical() {
        this.usuarios = new ArrayList<>();
    }
    //Metodos 
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void subirNuevaCancion(String cancion) {
        this.nuevaCancion = cancion;
        notificarUsuarios();
    }

    private void notificarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.actualizar(nuevaCancion);
        }
        
    }
}
