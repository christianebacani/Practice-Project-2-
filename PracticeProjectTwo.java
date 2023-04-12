// Practice Project (2)
// Created by Christiane A. Bacani
import java.util.Scanner;
public class PracticeProjectTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {39,49,25,59,70,20,25};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Welcome to our Food Cart!\n");
        System.out.print("Press enter to start buying : ");
        String pressEnter = input.nextLine();
        
        while(sell){
            
        System.out.print("\tAVAILABLE FOODS\n");
        System.out.print("FOOD\t\t\tPRICE\n");
        System.out.print("BUY 1 TAKE 1\n");
        System.out.print("1.) Regular Burger\tP 39\n");
        System.out.print("2.) Cheese Burger\tP 49\n");
        System.out.print("OTHER FOODS\n");
        System.out.print("3.)Siomai        \tP 25\n");
        System.out.print("4.) Shawarma     \tP 59\n");
        System.out.print("5.) Shawarma Rice\tP 70\n");
        System.out.print("6.) Cheese Waffle\tP 20\n");
        System.out.print("7.) Hotdog Waffle\tP 25\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1] * quantity;
        
        System.out.print("Do you want to buy more ? (y/n) : ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            sell = false;
            System.out.print("The total price is P " + total + "\n");
            
            System.out.print("Enter payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            
            System.out.print("\n\nTHANK YOU,PLEASE COME AGAIN!");
        }        
        
        }
        
    }
}
