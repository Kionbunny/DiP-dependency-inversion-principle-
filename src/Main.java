import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);// creating a new scanner obj to take the input
        // the chef variable is used hold the new instance of the object
        // based on the input or user choice
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Choose the type of dish you want:");
        System.out.println("1. Indian Dish");
        System.out.println("2. Italian Dish");
        System.out.println("3. Mexican Dish");
        System.out.print("Enter your choice : ");
        int option = sc.nextInt(); // take choice as input from the user
         IChef chef = null;
         switch(option)  {//Takes user input and selects which chef to use.
             case 1 :
                 chef = new IndianChef();//a new instance(chef obj) is created based on the user I/p
                 break;
             case 2:
                 chef = new ItalianChef();
                 break;
             case 3:
                 chef = new MexicanChef();
                 break;
             default :
                 System.out.println("Invalid choice ");
                 sc.close();
                 return;
         }
         Waiter wt = new Waiter(chef);// Passes the chef to the Waiter constructor.
          wt.takeOrder();// call the takeOrder method () in the Waiter class
        // which in-turn calls the cookDish() method from Waiter once Order received

    }
}