/*
 * Tables
--
String: material
int: howManyLegs
double: price
double: height
double: breadth
double: length
String: shapeOfTableTop
--
printInfo():void
vat():double
markup(double percent):double
discount(double percent): double

 */
 
class  Tables
{
    String material;
    int howManyLegs;
    double price;
    double height;
    double breadth;
    double length;
    String shapeOfTableTop;
    void printInfo()
    {
        System.out.println("Material: "+material);
        System.out.println("It has: "+howManyLegs+" leg(s)");
        System.out.println("Height: "+height);
        System.out.println("Breadth: "+breadth);
        System.out.println("Length: "+length);
        System.out.println("Tabletop shape: "+shapeOfTableTop);
        System.out.println("Price: "+price);
    }
    double vat()
    {
        return price * 0.1; //100% - 1*element, 10% - 0.1*element, 7% - 0.07*element
    }
   double markup(double percent) //we assume that percent is given by fraction
   {
       return price*percent;
   }
   double discount(double percent) //we pass percent variable to markup method
   {
       double markupValue = markup(percent);
       return price - (markupValue /2);
   }
}
 

public class Main
{
	public static void main(String[] args) {
	    Tables oneLegTable;
	    //
	    //
	    oneLegTable = new Tables();
	    oneLegTable.material = "Wood and metal";
	    oneLegTable.howManyLegs = 1;
	    oneLegTable.price = 199.99;
	    oneLegTable.height = 80;
	    oneLegTable.breadth = 50.5;
	    oneLegTable.length = 50.5;
	    oneLegTable.shapeOfTableTop = "Circle";
	    oneLegTable.printInfo();
	    System.out.println("Vat: "+ oneLegTable.vat());
	    System.out.println("Markup: "+oneLegTable.markup(0.3));
	    System.out.println("Price after discount: "+oneLegTable.discount(0.3));
	}
}
