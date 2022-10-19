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
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
        int l=this.message.length();
        String s="*** ~ "+this.message+" ~ ***";
        System.out.print("  ");
        for(int i=0;i<l+8;i++){
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(" *** ");
        for(int i=0;i<l+2;i++){
            System.out.print("~");
        }
        System.out.print(" ***");
        System.out.println(" ");
        System.out.println(s);
        System.out.print(" *** ");
        for(int i=0;i<l+2;i++){
            System.out.print("~");
        }
        System.out.print(" ***");
        System.out.println(" ");
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
        Banner myBanner = new Banner("Hi Hi Alex");
        myBanner.display();
    }
}
