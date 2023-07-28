//Define el paquete al que pertenece la clase main 
package TiempoAire;

public class Main {
    public static void main(String[] args) {
    	//se crea la intancia mediante el metodo .getInstance
    	//solo se permite una unica instancia de esta clase
        TimeAirOrder timeAirOrder = TimeAirOrder.getInstance();

        // Se agrefan las ordenes 
        timeAirOrder.addOrder(50);
        timeAirOrder.addOrder(100);
        
        //Muestra las ordenes almacendas 
        timeAirOrder.showOrders();
    }
}
