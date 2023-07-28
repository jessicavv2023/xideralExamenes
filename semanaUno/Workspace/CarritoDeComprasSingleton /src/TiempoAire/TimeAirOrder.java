// Define el paquete al que pertenece la clase 
package TiempoAire;

//Importa la clases del paquete de java.util
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeAirOrder {
	//Tiene un has a (tiene una) la clase TimeAirOrder tiene una lista de orderData
	
	
	//Atributos privados para alomacenar la unica instancia de la clase 
	
	//Variable estática y privada llamada instance del tipo TimeAirOrder
	//almacena la instancia 
    private static TimeAirOrder instance;
    //Almacena objetos de la clase orderData
    private List<OrderData> orderData;
    //Declara un mapa, almacena precios de las recargas de timepo aire 
    private Map<Integer, String> pricePlans;
     
    //Constructor privado 
    private TimeAirOrder() {
    	//Atributos privado para la unica instancia de la clase, se inicializa 
        orderData = new ArrayList<>();
        //Para almacenar clave-valor y permite un acceso a los valores a través de sus claves
        pricePlans = new HashMap<>();
        //Inizializacion de los atributos orderData y pricePLans
        //Definicion los tipos de precios es la claves  y sus beneficios sonb los valores 
        pricePlans.put(50, "Redes ilimitadas + 100 GB ");
        pricePlans.put(100, "Redes ilimitadas + 250 GB ");
        pricePlans.put(200, "Redes ilimitadas + 350 GB ");
        pricePlans.put(300, "Redes ilimitadas + 450 GB ");
        pricePlans.put(500, "Redes ilimitadas + 650 GB ");
    }

    //Metodo estatico publico para obtener la instancia de la clase 
    public static TimeAirOrder getInstance() {
        if (instance == null) {
            instance = new TimeAirOrder();
        }
        return instance;
    }
  
    //Metodo para agregar adetalle las recargas 
    public void addOrder(int price) {
        if (pricePlans.containsKey(price)) {
            String benefit = pricePlans.get(price);
            orderData.add(new OrderData(price, benefit));
            System.out.println("Recarga de $" + price + " realizada. Beneficio: " + benefit);
        } else {
            System.out.println("Monto de recarga no válido. No se realizó la recarga.");
        }
    }

  //Metodo para agregar cuantas recargas se realizaron 
    public void showOrders() {
        System.out.println("Orden de tiempo aire:");
        // contador de ordenes de recarga 
        for (int i = 0; i < orderData.size(); i++) {
        	//obtiene el elemento en la posicion de i de la lista ordenData 
        	//cada elemento deista es una clase privada   
            OrderData order = orderData.get(i);
            System.out.println((i + 1) + ". Monto: $" + order.getAmount() );
        }
    }

    
    private class OrderData {
    	//Atributos
        private int price;
        private String benefit;

        //constructor  es un metodo 
        public OrderData(int price, String benefit) {
            this.price = price;
            //parameto     atributo
            this.benefit = benefit;
        }

        public int getAmount() {
            return price;
        }

        public String getBenefit() {
            return benefit;
        }
    }
}
