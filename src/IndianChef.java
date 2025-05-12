public class IndianChef implements IChef{
// these are the low level modules that implement the Interface (IChef)
    // and they depend on abstraction chef not on specific chef (Indian , Italian etc )
    @Override
    public void cookDish() {
        System.out.println("Cooking Indian Dish: Butter Chicken");
       // System.out.println("I cook Indian food ");
    }
}
