import java.util.Scanner;

public class WeitereKlasse1
	{
	    public static void main(String[]args) {
	        String name;
	        int numberShares;
	        double buyPrice,sellPrice;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Wie heisst der Kunde");
	        name=input.nextLine();
	        System.out.print("Welche Aktie wünscht der Kunde?");
	        numberShares=input.nextInt();
	        System.out.print("Buy price?");
	        buyPrice=input.nextDouble();
	        System.out.print("Sale price?");
	        sellPrice=input.nextDouble();
	        input.close();
	        System.out.println(name + " here is the information of your stock transactions:");
	        System.out.println("Number of shares:" + numberShares);
	        System.out.println("Amount of purchase:" + buyPrice*numberShares);
	        System.out.println("Amount of sell:" + sellPrice*numberShares);
	        System.out.println("Transaction fee paid:" + 30);
	        System.out.println("Net profit:" + (sellPrice*numberShares-buyPrice*numberShares));
	    }
	}


