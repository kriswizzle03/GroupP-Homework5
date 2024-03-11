/**
 * 
 */
package edu.mu.pizzaTypes;

import java.util.List;

import edu.mu.Cooking.ICookingStrategy;
import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.Toppings;

/**
 * 
 */
public class HawaiianPizza extends AbstractPizza{

	/**
	 * @param toppingList
	 * @param priceWithoutToppings
	 * @param totalPrice
	 * @param pizzaOrderID
	 * @param cookingStrategy
	 * @param cookingPrice
	 */
	public HawaiianPizza(int pizzaOrderID) {
		super(pizzaOrderID);
		this.setPriceWithoutToppings(3.00);
		

		//add default toppings
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		
	}

	@Override
	protected double addTopingsToPrice(double priceWithoutToppings) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
