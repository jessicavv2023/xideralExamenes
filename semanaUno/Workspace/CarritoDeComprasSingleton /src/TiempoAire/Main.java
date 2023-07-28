//Define el paquete al que pertenece la clase main 
package TiempoAire;

public class Main {
    public static void main(String[] args) {
        TimeAirOrder timeAirOrder = TimeAirOrder.getInstance();

        timeAirOrder.addOrder(50);
        timeAirOrder.addOrder(100);
        timeAirOrder.showOrders();
    }
}
