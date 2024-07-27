public class OrderFood extends Order {

    public OrderFood(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing food");
    }

    @Override
    public boolean verifyAvailability(int quantity){
        final int AVAILABLE_FOOD = 4;
        return quantity <= AVAILABLE_FOOD;
    }

    @Override
    public double calculatePrice(int quantity){
        final double PRICE_FOOD = 5.50;
        return PRICE_FOOD * quantity;
    }

    @Override
    public void deliverOrder(int quantity, double totalPrice){
        System.out.println("Delivering Food Order - Quantity: " + quantity + ", Total Price: " + totalPrice);
    }
}
