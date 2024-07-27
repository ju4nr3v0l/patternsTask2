public abstract class Order {

    int quantity;

    Order(){}

    boolean takeOrder(){
        System.out.println("Order was taken");
        if(verifyAvailability(this.quantity)){
            prepare();
            double totalPrice = calculatePrice(this.quantity);
            deliverOrder(this.quantity, totalPrice);
            return true;
        }
        return false;
    }

    abstract void prepare();
    abstract boolean verifyAvailability(int quantity);
    abstract double calculatePrice(int quantity);
    abstract void deliverOrder(int quantity, double totalPrice);


}