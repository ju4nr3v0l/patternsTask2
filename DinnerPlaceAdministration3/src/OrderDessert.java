public class OrderDessert extends Order {

    public OrderDessert(int quantity) {
        this.quantity = quantity;
    }

    @Override
    void prepare() { System.out.println("Preparing dessert"); }

    @Override
    public boolean verifyAvailability(int quantity){
        final int AVAILABLE_DESSERTS = 2;
        return quantity <= AVAILABLE_DESSERTS;
    }

    @Override
    public double calculatePrice(int quantity){
        final double PRICE_DESSERT = 3.00;
        return PRICE_DESSERT * quantity;
    }

    @Override
    public void deliverOrder(int quantity, double totalPrice){
        System.out.println("Delivering Dessert Order - Quantity: " + quantity + ", Total Price: " + totalPrice);
    }
}
