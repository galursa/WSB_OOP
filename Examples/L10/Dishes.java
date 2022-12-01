/*
Dish
-----
#name: String
#Category: String
-----
Dish(name, category)
info(): void
setter
getters

Salad extends Dish
------------------
#ingriediens: String
#calories: double
#portions: int
---------------
Salad(name, category, ingriediens, calories, portions)
info()

*/


class Dish
{
	protected String name;
	protected String category;
	Dish(String name, String category)
	{
		this.name = name;
		this.category = category;
	}
	public void info()
	{
		System.out.println("Class Dish: ");
		System.out.println("Name: "+name);
		System.out.println("Category: "+category);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCategory(String category)
	{
		this.category  = category;
	}
	public String getName()
	{
		return name;
	}
	public String getCategory()
	{
		return category;
	}		
}

class Salad extends Dish
{
	protected String ingriediens;
	protected double calories;
	protected int portions;
	Salad(String name, String category, String ingriediens, double calories, int portions)
	{
		super(name,category);
		this.ingriediens = ingriediens;
		this.calories = calories;
		this.portions = portions;
	}
	public void info()
	{
		System.out.println("Name: "+name);
		System.out.println("Category: "+category);
		System.out.println("Ingriediens: "+ingriediens);
		System.out.println("Calories: "+calories+" kcal");
		System.out.println("Portions: "+portions);		
	}
	
}

public class Dishes {
	public static void main(String[] args) {
		Dish soup = new Dish("Chickes Soup", "Soups");
		soup.info();
		Salad fruitSalad = new Salad("Summer fruit salad", "Salad", "Apple - 1, banana - 1, kiwi - 2", 100.4,4);
		fruitSalad.info();
	}
}
