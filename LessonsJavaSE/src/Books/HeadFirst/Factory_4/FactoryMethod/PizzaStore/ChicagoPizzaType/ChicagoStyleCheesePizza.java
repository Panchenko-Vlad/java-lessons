package Books.HeadFirst.Factory_4.FactoryMethod.PizzaStore.ChicagoPizzaType;

import Books.HeadFirst.Factory_4.FactoryMethod.PizzaStore.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
