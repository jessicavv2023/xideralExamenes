
public class ValidacionBasico implements UsuarioValidacion {
	
	//Esta clase/interface la implemnta UsuaiorValidacion
	@Override
	public boolean validacionDatosUsuario(String nombre, String correo, int edad) {
 
		//Se validan  los datos
		// si el nombre no es nulo o esta vacio es correcto 
        return nombre != null && !nombre.isEmpty() &&
               correo != null && correo.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+") &&
               edad >= 18 && edad <= 120;
    }

	
	  
} 
