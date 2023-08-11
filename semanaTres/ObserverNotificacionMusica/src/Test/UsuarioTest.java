package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTest {
	//Coverage muestra las lineas de codigo que se ejecutan
	//verde es aprobado 
	//rojo marca un error 
	
	
	@Test
	public void testGetNombre() {
   Usuario usuario = new Usuario();
   final usuario resultado = usuario.agregarUsuario();
	
	
		Usuario usuario= new Usuario("John");
		assertEquals("John", usuario.getNombre());
	}

}
