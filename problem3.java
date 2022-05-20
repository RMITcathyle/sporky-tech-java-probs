// first option 

import java.util.Scanner;

public class problem3 {
        public static void main(String[]args) {
            Scanner scnr = new Scanner(System.in);
            boolean hot;
            boolean cold;
            int temperature = scnr.nextInt();
            
            hot = temperature > 25;
            cold = temperature < 20;
            
            System.out.print("Sporky needs ");

            if (hot) {
                System.out.print("a fan.");
            }
            else if (cold){
                System.out.print("a scarf.");
            }
            else {
                System.out.print("nothing.");
            }
        }
    }
