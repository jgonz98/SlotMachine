package slotmachine;

import java.util.*;

public class SlotMachine {


    public static void main(String[] args) {
        double amountEntered = 0;
        double amountWon = 0;
        double totalAmountEntered = 0;
        double totalAmountWon = 0;
        
        Random rand = new Random();
        
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            String input;
            String again = "y";
            while("y".equals(again)){
                System.out.print("\nEnter amount you would like to put into slot maching: $");
                amountEntered = keyboard.nextDouble();
                totalAmountEntered += amountEntered;
                int n1 = rand.nextInt(5);
                int n2 = rand.nextInt(5);
                int n3 = rand.nextInt(5);
                String i1 = "Bars";
                String i2 = "Cherries";
                String i3 = "Oranges";
                switch(n1){
                    case 0:
                        i1 = "Cherries";
                        break;
                    case 1:
                        i1 = "Oranges";
                        break;
                    case 2:
                        i1 = "Plums";
                        break;
                    case 3:
                        i1 = "Melons";
                        break;
                    case 4:
                        i1 = "Bars";
                        break;
            }
                switch(n2){
                    case 0:
                        i2 = "Cherries";
                        break;
                    case 1:
                        i2 = "Oranges";
                        break;
                    case 2:
                        i2 = "Plums";
                        break;
                    case 3:
                        i2 = "Melons";
                        break;
                    case 4:
                        i2 = "Bars";
                        break;
            }
                switch(n3){
                    case 0:
                        i3 = "Cherries";
                        break;
                    case 1:
                        i3 = "Oranges";
                        break;
                    case 2:
                        i3 = "Plums";
                        break;
                    case 3:
                        i3 = "Melons";
                        break;
                    case 4:
                        i3 = "Bars";
                        break;
            }
                if(n1 == n2 && n1 == n3){
                    amountWon = amountEntered*3;
                } else if (n1 == n2 || n1 == n3 || n2 == n3){
                    amountWon = amountEntered*2;
                } else
                    amountWon = 0;
                System.out.println("Slot Machine Output: " + i1 + " " + i2 + " " + i3);
                System.out.println("Amount Won is: $" + amountWon);
                System.out.print("Would you like to try again? (Y/N): ");
                again = keyboard.next();
                again = again.toLowerCase();
            }
    }
}
