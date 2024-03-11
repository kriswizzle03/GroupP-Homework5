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
public class MargheritaPizza extends AbstractPizza{

	

	/**
	 * @param toppingList
	 * @param priceWithoutToppings
	 * @param totalPrice
	 * @param pizzaOrderID
	 * @param cookingStrategy
	 * @param cookingPrice
	 */
	public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		
		
	}
	

	//method that calculates the total price of the pizza using priceWithoutToppings 
	//and the prices of each topping in toppingsList
	//for default toppings
	@Override
	protected double addTopingsToPrice(double priceWithoutToppings) {
		//set priceWithoutToppings attribute to passed parameter
		this.priceWithoutToppings = priceWithoutToppings;
		
		//add default toppings
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		
		//set toppingPrice to 0
		double toppingPrice = 0;
		
		//go through toppingList and add up the dollar values associated with each topping on pizza
		for(Toppings topping: toppingList) {
			toppingPrice = toppingPrice + topping.getToppingPrice();
		}
		//calculate totalPrice of pizza and toppings & return value
		//should this be this.?
		totalPrice = priceWithoutToppings + toppingPrice;
		return totalPrice;
	}

	//calculates and updates the totalPrice of the pizza using priceWithoutToppings attribute and
	//prices of each topping in toppingsList
	//used to make updates to the pizza
	@Override
	public double updatePizzaPrice() {
		//set toppingPrice to 0
		double toppingPrice = 0;
				
		//go through toppingList and add up the dollar values associated with each topping on pizza
		for(Toppings topping: toppingList) {
			toppingPrice = toppingPrice + topping.getToppingPrice();
		}
		
		//calculate totalPrice of pizza and toppings & return value
		//should totalPrice be this.?
		totalPrice = priceWithoutToppings + toppingPrice;
		return totalPrice;	
		
	}

}
