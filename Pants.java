/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * Prints ASCII art depicting a pair of pant with a belt to the console.
     */
    public void display() {
        System.out.println("        .=====GG=====.");
        System.out.println("        |   | \\/  |  |");
        System.out.println("        |__/  ||  \\__|");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |=====||=====|");
        System.out.println("        |_____||_____|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
