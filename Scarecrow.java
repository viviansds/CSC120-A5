/*
 * Scarecrow class (template) Assignment 5: Bringing it All Together @author R.
 * Jordan Crouser + CSC120 (Fall '22)) @version 13 October 2022 
 * @param a object from class Pumpkin, a object from class, Shirt, a object from class Boot, a
 * object from class Banner, a string
 */

public class Scarecrow {

    /* Parts of the Scarecrow */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot BothFoot;
    private Banner sign;
    private String message;

    /* Constructor*/
    public Scarecrow(Pumpkin h, Shirt b, Pants l,Boot f,Banner s, String m) {
        head = h;
        body = b;
        legs = l;
        BothFoot = f;
        sign = s;
        message=m;

    }
    /* Displays the Scarecrow in the right order! */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        BothFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // Initialize a scarecrow
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(),
                                              new Shirt(), 
                                              new Pants(), 
                                              new Boot("both"), 
                                              new Banner(""),
                                              "Happy Fall");

        // If a message was passed in on the command line, extract and store it 
        if (args.length > 0) {
            String sign = args[0];
            System.out.println(sign);
            myScarecrow.sign = new Banner(sign);
        }else {//print default message of that instance
            myScarecrow.sign = new Banner(myScarecrow.message);
        }

        myScarecrow.display();
    }

}
