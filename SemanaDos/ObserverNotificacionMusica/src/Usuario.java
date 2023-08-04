
public class Usuario {
    String nombre;

    //Constructor 
	public Usuario(String nombre) {
		
		this.nombre = nombre;
	}

	//Get y Set 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Metodo 
	public void actualizar(String nuevaCancion) {
        System.out.println(nombre + ": Spotify \"" + nuevaCancion + "\".");
    }

}
