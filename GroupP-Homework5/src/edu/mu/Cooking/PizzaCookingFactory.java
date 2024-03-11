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
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		double orderIDCounter = orderIDCounter++;
		switch(pizzaType) {
			case MARGHERITA:
				return new MargheritaPizza();
			case HAWAIIAN:
				return new HawaiianPizza();
			case SUPREME:
				return new SupremePizza();
			case VEGETARIAN:
				return new VegetarianPizza();
			default:
				System.out.println("Invalid pizza type!");
				break;
		}
		return null;
		
	}
}
