/******************************************************************************
Furniture
--
kind: String
numberOfElements: int
price: double
material: String
readyToUse: boolean
--
info(): void

*******************************************************************************/

class Furniture
{
    String kind;
    int numberOfElements;
    double price;
    String material;
    Boolean readyToUse;
    void info(){
        System.out.println("Furniture: "+kind);
        System.out.println("Consits of "+numberOfElements+" elements");
        System.out.println("It is made of "+material);
        System.out.println("It is ready to use: "+readyToUse);
        System.out.println("Price: "+price+" zl");
    }
}

public class FurnitureExamples
{
	public static void main(String[] args) {
		Furniture chair = new Furniture();
		chair.kind = "Chair"; 
		chair.numberOfElements = 1;
		chair.price = 79.99;
		chair.material = "plastic, metal, fabric";
		chair.readyToUse = true;
		chair.info();
		Furniture desktop = new Furniture();
		desktop.kind = "Computer Desktop";
		desktop.numberOfElements = 3;
		desktop.price = 99.99;
		desktop.material=" metal, wood";
		desktop.readyToUse = false;
	    desktop.info();
	}
}
