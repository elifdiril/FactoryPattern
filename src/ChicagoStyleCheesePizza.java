/**
 * @author Elif
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style...";
        dough = "Extra Thick..";
        sauce = "Plum Tomate Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut (){
        System.out.println("Cutting the pizza into square slices");
    }
}
