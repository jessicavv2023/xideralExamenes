
public class Main {

	public static void main(String[] args) {
		
		
		PlataformaMusical plataforma = new PlataformaMusical();

        // Crear usuarios
        Usuario usuario1 = new Usuario("Jessica");
        Usuario usuario2 = new Usuario("Laura");
        Usuario usuario3 = new Usuario("Cecilia");
        Usuario usuario4 = new Usuario("Paty");
        // Agregar usuarios a la plataforma
        plataforma.agregarUsuario(usuario1);
        plataforma.agregarUsuario(usuario2);
        plataforma.agregarUsuario(usuario3);
        plataforma.agregarUsuario(usuario4);
        
        
        // Simular agregar una  nueva canción
        
        plataforma.subirNuevaCancion("Escucha la nueva canción de Taylor Swift");

        System.out.println("*---------------------------------------------------------*");
        plataforma.eliminarUsuario(usuario3);
        plataforma.subirNuevaCancion("Incluye Speak Now ");
       
	}

}
