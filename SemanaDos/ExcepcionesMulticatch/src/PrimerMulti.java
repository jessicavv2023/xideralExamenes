
public class PrimerMulti {

	public static void main(String[] args) {
		
		//ArithmeticException excepción se lanza cuando ocurre una 
		//operación aritmética inválida, dividir por 0
		//NullPointerException excepción se lanza cuando se intenta 
		//acceder a un objeto que es null, no ha sido inicializado o está vacio
		
		 try {
	            int resultado = dividir(10, 0);
	        } catch (ArithmeticException | NullPointerException ex) {
	            System.out.println("Ocurrió un error: " + ex.getMessage());
	        }
	    }

	    public static int dividir(int numerador, int denominador) {
	        return numerador / denominador;
	    }

	}

	


