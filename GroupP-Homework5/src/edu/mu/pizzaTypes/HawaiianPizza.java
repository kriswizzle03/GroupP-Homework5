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
	public HawaiianPizza(double priceWithoutToppings) {
		super(priceWithoutToppings);
		
		this.setPriceWithoutToppings(3.00);
		

		//add default toppings
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		
	}

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		//set priceWithoutToppings attribute to passed parameter
		this.priceWithoutToppings = priceWithoutToppings;
		
		//set toppingPrice to 0
		double toppingPrice = 0;
		
		//go through toppingList and add up the dollar values associated with each topping on pizza
		for(Toppings topping: toppingList) {
			toppingPrice = toppingPrice + topping.getToppingPrice();
		}
		//calculate totalPrice of pizza and toppings & return value
		//should this be this.?
		totalPrice = priceWithoutToppings + toppingPrice + cookingPrice;
		return totalPrice;
	}



	@Override
	public double updatePizzaPrice() {
		totalPrice=(addToppingsToPrice(getPriceWithoutToppings()) + cookingPrice);
		return totalPrice;
	}

}
