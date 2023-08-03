
public class UsuariosRegistro {
	//interfaz de UsuarioValidacion
	 private final UsuarioValidacion validacion;

	    //Constructor
	    //Inyeccion de dependecias ya que UsuarioRegistro depende de la implementacion de UsuairoValidacion
	    public UsuariosRegistro(UsuarioValidacion validacion) {
	        this.validacion = validacion;
	    }

	    //Metodo
	    
	    public void registrarUsuario(String nombre, String correo, int edad) {
	        // Inyección de dependencias a traves de validacionDatosUsuario
	    	//Se llama al metodo validacionDatosUsuario
	        if (validacion.validacionDatosUsuario(nombre, correo, edad)) {
	            System.out.println("Usuario registrado exitosamente.");
	        } else {
	            System.out.println("Datos de usuario inválidos. El registro fallido.");
	        }
	    }

	    //Instancia  de validacionBasico llamada validacion
	    public static void main(String[] args) {
	    	//La clase ValidacionBasico es la implementacion de la interfaz UsuarioValidacion
	        UsuarioValidacion validacion = new ValidacionBasico(); 
	        //Se crea una intancia de USuarioRegistro y le paso la instancia de validacion como argumento del 
	        //constructor, inbyeccion de dependencias
	        UsuariosRegistro registro = new UsuariosRegistro(validacion);

	       //Se llama al metodod registrarUsuario
	        registro.registrarUsuario("Julia", "julia@example.com", 25);
	        registro.registrarUsuario("Juan", "juanxample.com", 55);
	    }
	}


