/*PS_Variables
 * Tahmid Chowdhury
 * 9/19/2018
 * 
 */
public class Variables_TahmidChowdhury {

	public static void main(String[] args) {
/*Declares variables for driver's licence*/		
String name = "\n    DOE\n    JOHN\n\n";
String address = "\n    123 ANY STREET\n    TORONTO, ON, M0M 0M0\n\n";
String number = "\n    D6101 - 40706 - 60905\n\n";
String issued = "\n    2009/04/23\n\n";
String expires = "\n    2014/04/23\n\n";
String sex = "\n    M";
/*Prints driver's license*/
System.out.println("Ontario, CAN: Driver's Licence\n             /Permis de conduire\n\n" + "NAME/NOM:" + name + "ADDRESS/ADRESSE:" + address + "NUMBER/NUMERO:" + number + "ISS/DEL:" + issued + "EXP/EXP:" + expires + "SEX/SEXE:" + sex);

/*Declares variables for triangle and sphere*/
int side1 = 1;
int side2 = 3;
int side3 = 4;
int area = (side3 * side2) / 2;
int perimeter = side1 + side2 + side3;
double radius = 4.2;
double volume = Math.pow(radius, 3) * 4 / 3 * 3.14 ;
/*Prints perimeter and are for triangle and volume for sphere*/
System.out.println(" Triangle Perimeter = " + side1 +  " + " + side2 + " + " + side3 + " = " + perimeter);
System.out.println("\n\n Triangle Area = ( " + side3 + " * " + side2 + " ) / 2 = " + area);
System.out.print("\n\nSphere Volume = 4 / 3 * 3.14 * " + radius + " ³ = ");
System.out.printf("%.2f %n", volume);

/*Declares variables for receipt*/
String storeName = "Mountain Equipment Co-op Toronto";
String storeAddress = "400 King Street West, Toronto, ON M5V 1K2";
String customerName = "Mrs. Darai Baf";
String item1 = "Disc (Frisbee)";
String item2 = "Canoe Paddle";
String item3 = "Algonquin Park Map";
double item1Price = 14.99;
double item2Price = 84.99;
double item3Price = 9.49;
double subtotal = item1Price + item2Price + item3Price;
double total = 1.13 * subtotal;
int payment = 100 + 50;
double change = payment - total;
int day = 20;
int month = 9;
int year = 2018;
int hour = 12;
int minute = 30;
String timing = "PM";
/*Prints receipt using variables*/
System.out.print("                WWW.MEC.CA\n    " + storeName + "\n" + storeAddress + "\n-----------------------------------------\nCASHIER| GENERATED USING JAVA\nCUSTOMER| " + customerName + "\n-----------------------------------------\nPURCHASE| \n\n      " + item1 + "               $" + item1Price + "\n      " + item2 + "                 $" + item2Price + "\n      " + item3 + "            $" + item3Price + "\n\n                        SUBTOTAL| $");
System.out.printf("%.2f %n", subtotal);
System.out.print("HST +13%                      TAX| $");
System.out.printf("%.2f %n", 0.13 * subtotal);
System.out.print("-----------------------------------------\n                           TOTAL| $");
System.out.printf("%.2f %n", total);
System.out.print("\nPAYMENT METHOD|                 $" + payment + " CASH\nCHANGE DUE|                        $");
System.out.printf("%.2f %n", change);
System.out.print("DATE|                           " + day + "/" + month + "/" + year + "\nTIME|                         " + hour + ":" + minute + ":00 " + timing + "\n\n       NO RETURNS WITHOUT RECEIPT\n\n           T H A N K   Y O U ");
	}

}
