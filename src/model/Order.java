package model;

public record Order(
        String productName,
        Double pricePerUnit,
        Integer quantity,
        OrderStatus status) {
//    Methods
    public double orderTotalPrice() {
        Double totalPrice = this.pricePerUnit * this.quantity;
        double primitiveTotalPrice = totalPrice;
        return primitiveTotalPrice;
    }
}
