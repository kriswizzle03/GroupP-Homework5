package edu.mu.Order;

import java.util.ArrayList;
import java.util.List;

import edu.mu.Cooking.CookingStyleType;
import edu.mu.Cooking.ICookingStrategy;
import edu.mu.Cooking.PizzaCookingFactory;
import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.Toppings;
import edu.mu.pizzaTypes.PizzaType;

public class PizzaOrder {
	private PizzaCookingFactory pizzaCookingFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	public PizzaOrder() {
		pizzaCookingFactory = new PizzaCookingFactory();
		pizzaOrderList = new ArrayList<>();
	}
	 
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		
	}
	
	public void printPizzaOrderCart(int orderID) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(pizza != null) {
			System.out.println("Pizza ID: "+orderID);
		}
		else {
			System.out.println("Pizza ID: "+ orderID+ " not found");
		}
		
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for(AbstractPizza pizza: pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		AbstractPizza pizza = pizzaCookingFactory.createPizza(pizzaType);
		if(pizzaOrderList.add(pizza)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		return false;
		
	}
	
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		return false;
		
	}
	
	public boolean isThereAnyUncookedPizza() {
		return false;
		
	}
	
	public double checkout() throws Exception{
		return 0;
		
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		return false;
		
	}
}
