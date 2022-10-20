/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    /* The direction of the boot: left, right, or both*/
    private String direction;
  
    /* Constructor 
     * @param a string indicating direction
    */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Prints ASCII art depicting individual left or right, and both boots to the console.
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.println("         |=~=|");
          System.out.println("         |   |");
          System.out.println("         / **|");
          System.out.println("     .-'`    |");
          System.out.println("     (___/\\__)");
          
        } else if (this.direction.equals("right")) {
          System.out.println("|=~=|");
          System.out.println("|   |");
          System.out.println("|** \\");
          System.out.println("|    `'-.");
          System.out.println("(__/\\___)");
        }
          else if (this.direction.equals("both")) {
            System.out.println("         |=~=|  |=~=|");
            System.out.println("         |   |  |   |");
            System.out.println("         / **|  |** \\");
            System.out.println("     .-'`    |  |    `'-.");
            System.out.println("     (___/\\__)  (__/\\___)");         
        }
        else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        Boot BothBoot = new Boot("both");
        myLeftBoot.display();
        myRightBoot.display();
        BothBoot.display();
        
    }
}
