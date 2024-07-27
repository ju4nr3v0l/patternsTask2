import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        Order order = null;
        System.out.println("What do you want to order?\n" +
                "1. Food\n" +
                "2. Beverage\n" +
                "3. Dessert");
        int selection = Integer.parseInt(bReader.readLine());

        System.out.println("Please write the quantity that you want to order: ");
        int quantity = Integer.parseInt(bReader.readLine());

        if(selection == 1){
            order = new OrderFood(quantity);
        }else if(selection == 2){
            order = new OrderBeverage(quantity);
        }else if(selection == 3){
            order = new OrderDessert(quantity);
        }
        boolean status = order.takeOrder();

        if(status){
            System.out.println("Thank you for your order!");
        }else{
            System.out.println("Sorry, that is not a valid order");
        }

    }
}