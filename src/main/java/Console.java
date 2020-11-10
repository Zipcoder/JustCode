
import Models.Region;

import java.util.HashMap;
import java.util.Scanner;

public class Console {

    // ******************************************************************************************** Welcome **********

    public void welcomeMessageRegions() {

        System.out.println("\n");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^   Hello  Welcome to MARCH MADNESS          ^");
        System.out.println("^--------------------------------------------^");
        System.out.println("^   Please select the Models.Region by number       ^");
        System.out.println("^                                            ^");
        System.out.println("^   1. EAST                                  ^");
        System.out.println("^   2. WEST                                  ^");
        System.out.println("^   3. MIDWEST                               ^");
        System.out.println("^   4. SOUTH                                 ^");
        System.out.println("^                                            ^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(" Enter your input :");
//                char escCode = 0x1B;
//                int row = 10; int column = 10;
//                System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }




    // ***************** Getting String input from User **********

    public Object getUserInput() {

        Object userInput;
        Scanner readInput = new Scanner(System.in);
//        try {
            userInput = readInput.nextLine();

//        } catch (NumberFormatException ex) {
//            System.out.println("Invalid entry. Please enter a number from the menu" + "\n");
//            userInput = Integer.parseInt(readInput.nextLine());
//            return userInput;
//        }
        return userInput;
    }

    // ******************** Main ****************

    public static void main(String[] args) {

//        GUI gui = new GUI();

        Console region = new Console();
        Boolean invalid = false;
        region.welcomeMessageRegions();

        HashMap<Integer, String> response = new HashMap<Integer, String>();
        response.put(1, "EAST");
        response.put(2, "WEST");
        response.put(3, "MIDWEST");
        response.put(4, "SOUTH");
//        System.out.println(response.get(1));
//        System.out.println(response.get(2));
//        System.out.println(response.get(3));
//        System.out.println(response.get(4));
//        System.out.println(response.keySet().toArray()[1]);



        do {

            Object r = region.getUserInput();
//            System.out.println(r);
//            System.out.println(response.get(2));
//            System.out.println(response.keySet().toArray()[1]);

            if ((response.get(1).equalsIgnoreCase((String)r)) || r == response.keySet().toArray()[0])
                {
                    System.out.println("You selected EAST" + "\n\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }

                    System.out.println("Redirecting.........");
                    invalid = false;
                    Region regionSelected = new Region("east");
                    regionSelected.getRegionBracket();
                }

            else if ((response.get(2).equalsIgnoreCase((String)r)) || r == response.keySet().toArray()[1]) {

                System.out.println("You selected WEST" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                Region regionSelected = new Region("west");
                regionSelected.getRegionBracket();
            }

            else if ((response.get(3).equalsIgnoreCase((String)r)) || r == response.keySet().toArray()[2]) {

                System.out.println("You selected MIDWEST" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                Region regionSelected = new Region("midwest");
                regionSelected.getRegionBracket();
            }

            else if (((response.get(4).equalsIgnoreCase((String)r))) || r == response.keySet().toArray()[3]) {
                System.out.println("You selected SOUTH" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                Region regionSelected = new Region("south");
                regionSelected.getRegionBracket();
            }

            else {
                System.out.println(" Invalid Entry ! Please enter a valid response from the menu  ");
                invalid = true;

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n");
            }

        } while (invalid);
    }
}


