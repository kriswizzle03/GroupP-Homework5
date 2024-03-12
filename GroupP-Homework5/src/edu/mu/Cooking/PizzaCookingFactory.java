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
	     AbstractPizza pizza;

	     switch (pizzaType) {
	         case MARGHERITA:
	             pizza = new MargheritaPizza(orderIDCounter);
	             break;
	         case VEGETARIAN:
	             pizza = new VegetarianPizza(orderIDCounter);
	             break;
	         case HAWAIIAN:
	             pizza = new HawaiianPizza(orderIDCounter);
	             break;
	         case SUPREME:
	             pizza = new SupremePizza(orderIDCounter);
	             break;
	         default:
	             throw new IllegalArgumentException("Invalid pizza type: " + pizzaType);
	     }

	     pizza.setPizzaOrderID(orderIDCounter);
	     orderIDCounter++;
	    
	     //pizza.setPizzaOrderID(++orderIDCounter);
	     return pizza;
	 }
}
