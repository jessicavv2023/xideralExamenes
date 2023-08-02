
public class UsuariosRegistro {
	 private final UsuarioValidacion validacion;

	    public UsuariosRegistro(UsuarioValidacion validacion) {
	        this.validacion = validacion;
	    }

	    public void registrarUsuario(String nombre, String correo, int edad) {
	        // Inyección de dependencias
	        if (validacion.validacionDatosUsuairo(nombre, correo, edad)) {
	            System.out.println("Usuario registrado exitosamente.");
	        } else {
	            System.out.println("Datos de usuario inválidos. Registro fallido.");
	        }
	    }

	    public static void main(String[] args) {
	        UsuarioValidacion validator = new ValidacionBasico(); 
	        UsuariosRegistro registro = new UsuariosRegistro(validator);

	       
	        registro.registrarUsuario("Juan Pérez", "juan@example.com", 25);
	        registro.registrarUsuario("Juan Pérez", "juanxample.com", 25);
	    }
	}


