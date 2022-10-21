/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

 
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Prints ASCII art depicting speech bubble wrapping to fit the supplied message to the console.
     */
    public void display() {
        int l=this.message.length();
        // First line of the banner
        System.out.print("  ");
        for(int i=0;i<l+8;i++){
            //number of * changes based on the length of the message
            System.out.print("*");
        }
        System.out.println(" ");//skips one line

        // Second line of the banner
        System.out.print(" *** ");
        for(int i=0;i<l+2;i++){
            //number of ~ changes based on the length of the message
            System.out.print("~");
        }
        System.out.print(" ***");
        System.out.println(" ");//skips one line

        // Third line of the banner
        System.out.println("*** ~ "+this.message+" ~ ***");

        // Fourth line of the banner(same as the second line)
        System.out.print(" *** ");
        for(int i=0;i<l+2;i++){
            System.out.print("~");
        }
        System.out.print(" ***");
        System.out.println(" ");//skips one line

        // Create the last two lines as the tail of the banner
        System.out.print("  ");
        for(int i=0;i<l;i++){
            System.out.print("*");
        }
        System.out.print("     ****");
        System.out.println(" ");
        for(int i=0;i<l;i++){
            System.out.print(" ");
        }
        System.out.print("*******");
        System.out.println(" ");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello World");
        myBanner.display();
    }
}
