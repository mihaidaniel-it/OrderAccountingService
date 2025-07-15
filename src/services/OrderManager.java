package services;

import model.Order;
import model.OrderStatus;

public class OrderManager {
//    Fields
    private Order[] orders = new Order[10];
    private int orderCount = 0;

//    Methods
    public void addOrder(Order order) {
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
            System.out.println(order.productName() + " was added to your order");
        } else {
            System.out.println("Sorry, we don't have places for parcels");
        }
    }

    public void printAllOrders() {
        double allOrdersTotalPrice = 0;

        for (int i = 0; i < orderCount; i++) {
            allOrdersTotalPrice += orders[i].orderTotalPrice();

            System.out.println("############");
            System.out.println("ID: " + i);
            System.out.println("Product name: " + orders[i].productName());
            System.out.println("Product price per unit: " + orders[i].pricePerUnit());
            System.out.println("Product quantity: " + orders[i].quantity());
            System.out.println("Order status: " + orders[i].status());
            System.out.println("Total price: " + orders[i].orderTotalPrice());
        }

        System.out.println("    ");
        System.out.println("Price of all orders is " + allOrdersTotalPrice + "$");
    }

    public void printFinalOrders() {
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].status() == OrderStatus.DELIVERED || orders[i].status() == OrderStatus.CANCELLED) {
                System.out.println("############");
                System.out.println("ID: " + i);
                System.out.println("Product name: " + orders[i].productName());
                System.out.println("Product price per unit: " + orders[i].pricePerUnit());
                System.out.println("Product quantity: " + orders[i].quantity());
                System.out.println("Order status: " + orders[i].status());
                System.out.println("Total price: " + orders[i].orderTotalPrice());
            }
        }
    }

    public double getTotalPrice() {
        double allOrdersTotalPrice = 0;

        for (int i = 0; i < orderCount; i++) {
            if (orders[i].status() != OrderStatus.CANCELLED) {
                allOrdersTotalPrice += orders[i].orderTotalPrice();
            }
        }

        return allOrdersTotalPrice;
    }
}
