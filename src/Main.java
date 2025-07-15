import model.Order;
import model.OrderStatus;
import services.OrderManager;

public class Main {
    public static void main(String[] args) {
//        Objects
        OrderManager orderManager = new OrderManager();

        Order order1 = new Order("Iphone 11", 389.9,2, OrderStatus.NEW);
        Order order2 = new Order("Air MackBook M1", 798.5,5, OrderStatus.SHIPPED);
        Order order3 = new Order("SBD Belt", 149.9,1, OrderStatus.DELIVERED);

//        Add objects to array
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);

//        Output
        orderManager.printAllOrders();
        System.out.println("------------");
        orderManager.printFinalOrders();
        System.out.println("------------");
        System.out.println("Total success orders price is: " + orderManager.getTotalPrice());
    }
}
