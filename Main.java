import java.util.Scanner;

/**


 * This will determine the price of a pizza
 * @author Cesar Gil
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner for the pizza cm
    Scanner input = new Scanner(System.in);

    System.out.println("What is the size of the pizza?(In cm)");
    int size = input.nextInt();
  
  
   // Calculates and shows total price
  System.out.println("Subtotal:" + (0.75 + 0.99 + 0.50 * size));
  System.out.println("Taxes:" + 0.13 * (0.75 + 0.99 + 0.50 * size));
  System.out.println("Total:" + 1.13 * ( 0.75 + 0.99 + 0.50 * size));

  // reponse   
   if (size > 40){ 
    System.out.println("Whoa, big pizza! You might need a truck to get this home!");
   } else if (size > 20){
     System.out.println("This will be delicious!");
   } else if (size > 0){
     System.out.println("We are going to make you a cute little pizza!");
   }
  }
}
