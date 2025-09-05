package CS201LLab1;
import java.util.Scanner;
//NAME:  Lance Le
//DATE:  9/5/25
//LAB TIME: 10:00 AM - 12:30 PM
//PROGRAM: Lab1
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to CS201L - Lab1!");

        //declare variables used
        int x1, x2, y1, y2;
        double dist1, dist2;
        char choice;
        String inputLine;
        Scanner input = new Scanner(System.in);

        //get choice from the user
        System.out.print("\nHow would you like to get your 4 values: enter(e) or generate(g)? ");
        inputLine = input.nextLine();
        choice = inputLine.charAt(0);

        //allow user to enter both points (1 point has been done for you)
        if (choice == 'e') {
            System.out.println("Enter the 4 values separated by spaces: ");
            x1 = input.nextInt();
            y1 = input.nextInt();
            x2 = input.nextInt(); //added in x2 and y2
            y2 = input.nextInt();
            if (!((x1 >= -10 && x1 <= 10) &&
                (y1 >= -10 && y1 <= 10)) || !((x2 >= -10 && x2 <= 10) &&
                (y2 >= -10 && y2 <= 10))){ //added in the x2 and y2 here as well to make sure correct value
                System.out.println("A value entered was not valid"); 
                return;                       
            }

        }
        //generate a value from -10 to 10 for both points (1 point has been done for you)
        else if (choice == 'g') {
            x1 = (int)(Math.random() * 21) - 10;
            y1 = (int)(Math.random() * 21) - 10;
            x2 = (int)(Math.random() * 21) - 10;//added in random generated values for x2 and y2
            y2 = (int)(Math.random() * 21) - 10;
         }
        else {
            System.out.println("The value " + choice + " is not a valid option!");
            return;
        }
        //print both points
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")"); //added in point 2

        //calculate dist1 & dist2 (the distance from each point to the origin)
        dist1 = Math.pow(Math.pow((x1-0),2) + Math.pow((y1-0),2),.5);
        dist2 = Math.pow(Math.pow(x2,2) + Math.pow(y2,2), 0.5); //Using pathagorean theorem we can find the distance from origin

        //determine which is distance closer to the origin and print
        if (dist1 < dist2){
            System.out.println("Point 1 is closer to the origin");
        }
        else if (dist1 > dist2){
            System.out.println("Point 2 is closer to the origin");
        }
        else{
            System.out.println("Both points are the same distance from the origin");
        }

        //close scanner
        input.close();
    }
}

