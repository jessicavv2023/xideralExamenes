package Test;

public class Usuario {
   
	String nombre;
	
	//constructor
	 public Usuario(String nombre) {
		 this.nombre=nombre;
	 }
	 
	 //get y sett
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
