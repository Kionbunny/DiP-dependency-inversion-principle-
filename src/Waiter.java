public class Waiter  { // (High level Module )
    private  IChef chef;

    public Waiter(IChef chef) {  // chef is injected to Waiter via Constructor injection
        this.chef = chef;
    }

    public void takeOrder() {
        System.out.println("Waiter: Taking order...");
        chef.cookDish(); // Delegates(hand - over the task)  cooking to the chef
    }
}
//This is the high-level module.
//It depends on the abstraction IChef, not on any specific chef type.
// At runtime, it receives a chef object (IndianChef or ItalianChef) through constructor injection.
//It delegates the cooking task to the specific chef via the interface.

