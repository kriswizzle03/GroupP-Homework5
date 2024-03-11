package edu.mu.Cooking;

import edu.mu.pizzaTypes.*;

import java.util.ArrayList;
import java.util.List;

import edu.mu.pizza.*;

import edu.mu.pizza.*;


import edu.mu.pizza.AbstractPizza;
import edu.mu.pizzaTypes.PizzaType;

//creates AbstractPizza instance and instantiates it according to pizzaType parameter
//sets pizzaOrderID of the pizza using current orderIDCounter
public class PizzaCookingFactory{
	private static int orderIDCounter = 1;
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		int pizzaOrderID = orderIDCounter++;
		
		switch(pizzaType) {
			case MARGHERITA:
				return new MargheritaPizza(pizzaOrderID);
			case HAWAIIAN:
				return new HawaiianPizza(pizzaOrderID);
			case SUPREME:
				return new SupremePizza(pizzaOrderID);
			case VEGETARIAN:
				return new VegetarianPizza(pizzaOrderID);
			default:
				System.out.println("Invalid pizza type!");
				break;
		}
		return null;
		
	}
}
