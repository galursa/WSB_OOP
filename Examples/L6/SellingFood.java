/*
 * Food
--
String: nameOfFood
int: numberOfPortions
String: kindOfFood
int: calories
double: price
--
void: info()
 * 
 */

class Food{
	String nameOfFood;
	int numberOfPortions;
	String kindOfFood;
	int calories;
	double price;
	void info()
	{
		System.out.println("Name of the food: "+nameOfFood);
		System.out.println("Numbers of portions: "+numberOfPortions);
		System.out.println("Kind of food: "+kindOfFood);
		System.out.println("Calories: "+calories);
		System.out.println("Price: "+price+" zl.");
	}
	
}

public class SellingFood {
	public static void main(String[] args) {
		Food soup = new Food();
		soup.nameOfFood = "Chicken Soup";
		soup.numberOfPortions = 6;
		soup.kindOfFood = "Non vegetarian";
		soup.calories = 456;
		soup.price = 15.50;
		soup.info();
		Food veggieBurgers = new Food();
		veggieBurgers.nameOfFood = "Vegetarian Burger";
		veggieBurgers.numberOfPortions = 1;
		veggieBurgers.kindOfFood = "Vegan";
		veggieBurgers.calories =310;
		veggieBurgers.price = 25.99;
		veggieBurgers.info();
	}
}
