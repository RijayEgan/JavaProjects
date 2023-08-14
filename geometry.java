import java.util.Scanner;



public class geometry {
    public static void main(String[] args){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Hello User! What is your name?");
            System.out.println("Enter Here:");
            String name = myObj.nextLine();
            if (name.matches("[0-9]+") == true || name.matches("[a-zA-Z]+") == false){
                System.out.println("Invalid name");
                System.exit(0);     
            }
            System.out.println("Hello there " + name);
            System.out.println("What would you like to do " + name);
            System.out.println("1. Area Of Triangle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Square");
            String choices = myObj.nextLine();
            if (choices.matches("[a-zA-Z]+") == true){
                System.out.println("Invalid choice");
                System.exit(0);     
            }
            int choice = Integer.parseInt(choices);   
            if (choice == 1){
                System.out.println("Please enter the Height of the Triangle");
                String heighttriangle = myObj.nextLine();
            if (heighttriangle.matches("[0-9]+") == false || heighttriangle.matches("[a-zA-Z]+") == true){
                System.out.println("Please enter a number");
                System.exit(0);     
            }   
            int heighttriangleint = Integer.parseInt(heighttriangle);   
                System.out.println("Please enter the Base Length");
                String basetriangle = myObj.nextLine();
            if (basetriangle.matches("[0-9]+") == false || basetriangle.matches("[a-zA-Z]+") == true){
                System.out.println("Please enter a number");
                System.exit(0);     
            }    
            int basetriangleint = Integer.parseInt(basetriangle);
            int firststeptriangle = (basetriangleint * heighttriangleint);
            int areaoftriangle = (firststeptriangle / 2);
            System.out.println("Here is the area of your Triangle: " + areaoftriangle);       
            }
            else if(choice == 2){
              System.out.println("Please enter the Height of the Rectangle");
                String heightrectangle = myObj.nextLine();
            if (heightrectangle.matches("[0-9]+") == false || heightrectangle.matches("[a-zA-Z]+") == true){
                System.out.println("Please enter a number");
                System.exit(0);     
            }   
            int heightrectangleint = Integer.parseInt(heightrectangle);   
                System.out.println("Please enter the Base Length");
                String baserectangle = myObj.nextLine();
            if (baserectangle.matches("[0-9]+") == false || baserectangle.matches("[a-zA-Z]+") == true){
                System.out.println("Please enter a number");
                System.exit(0);     
            }    
            int baserectangleint = Integer.parseInt(baserectangle);
            int areaofrectangle = (baserectangleint * heightrectangleint);
            System.out.println("Here is the area of your Rectangle: " + areaofrectangle); 
            }
            else if(choice == 3){
              System.out.println("Please enter the Height of the Square");
                String heightsquare = myObj.nextLine();
            if (heightsquare.matches("[0-9]+") == false || heightsquare.matches("[a-zA-Z]+") == true){
                System.out.println("Please enter a number");
                System.exit(0);     
            }   
            int heightsquareint = Integer.parseInt(heightsquare);   
            int areaofsquare = (heightsquareint * heightsquareint);
            System.out.println("Here is the area of your Square: " + areaofsquare); 
            }
            else{
                System.out.println("Sorry you need to enter a correct number");
                System.exit(0);
            }

        }
    }
}
