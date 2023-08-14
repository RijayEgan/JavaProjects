import java.util.Scanner;
import java.text.DecimalFormat;
 
public class currencyconverter
{

private static Scanner scanner;

public static void main(String[] args)
   {
      double dollar, rupee, pound, euro, yen;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Following are the Choices:");
          System.out.println("Enter 1: Dollar");
          System.out.println("Enter 2: Rupee");
          System.out.println("Enter 3: Pound");
          System.out.println("Enter 4: Euro");
          System.out.println("Enter 5: Yen");
 
          System.out.print("\nChoose from above options: ");
          choice = sc.nextInt();
 
          

    }


        System.out.println("Enter the amount you want to convert?");
        String amount1 = scanner.nextLine();

          if (amount1.matches("[a-zA-Z]+") == true){
            System.out.println("Invalid choice");
            System.exit(0);     
        }
         double amount = Double.parseDouble(amount1);

      switch (choice)
      {
         case 2:  
            dollar = amount / 70;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 88;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 80;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.63;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            break;
 
         case 1:  
            rupee = amount * 70;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.87;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *111.087;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
            break;
 
         case 3:  
            rupee = amount * 88;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.26;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.10;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *140.93;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
            break;
 
         case 4:  
            rupee = amount * 80;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.14;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.90;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *127.32;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
            break;
 
         case 5:  
            rupee = amount *0.63;
            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.008;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.007;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.007;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
            break;
  
          
         default:
            System.out.println("Invalid Input");
      }
   }
}