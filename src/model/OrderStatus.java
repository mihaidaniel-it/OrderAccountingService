package model;

public enum OrderStatus {
//    Fields
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

//    Methods
    public static boolean isFinal(Order order) {
        if (order.status() == SHIPPED || order.status() == DELIVERED) {
            return true;
        }

        return false;
    }
}
