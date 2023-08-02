
public class ValidacionBasico implements UsuarioValidacion {
	
	@Override
	public boolean validacionDatosUsuairo(String nombre, String correo, int edad) {
 
        return nombre != null && !nombre.isEmpty() &&
               correo != null && correo.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+") &&
               edad >= 18 && edad <= 120;
    }

	
	
}
