public class OrderBeverage extends Order {

    public OrderBeverage(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void prepare() { System.out.println("Preparing beverage"); }

    @Override
    public boolean verifyAvailability(int quantity){
        final int AVAILABLE_BEVERAGES = 10;
        return quantity <= AVAILABLE_BEVERAGES;
    }

    @Override
    public double calculatePrice(int quantity){
        final double PRICE_BEVERAGE = 2.25;
        return PRICE_BEVERAGE * quantity;
    }

    @Override
    public void deliverOrder(int quantity, double totalPrice){
        System.out.println("Delivering Beverage Order - Quantity: " + quantity + ", Total Price: " + totalPrice);
    }
}
