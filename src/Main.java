import model.Order;
import model.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Iphone 11", 489.50, 1, OrderStatus.DELIVERED);

        System.out.println(OrderStatus.isFinal(order));
    }
}
