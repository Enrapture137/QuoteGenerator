      //import two utilities needed.
import java.util.Scanner;
import java.util.Random;

public class QuoteGenerator
{
   public static void main(String[] args)
   { 
      //generator random number.
      Random random = new Random();
      int number = random.nextInt(10)+1;
     
      //use random number to determine which switch case to use.
      switch (number) {
         case 1: 
            System.out.println("Our greatest glory is not in never falling, but in rising after every time we fall. Confuscius");
            break;
         case 2:
            System.out.println("It does not matter how slowly you go as long as you do not stop. Confuscius");
            break;
         case 3:
            System.out.println("Everything you've ever wanted is on the other side of fear. George Addair");
            break;
         case 4:
            System.out.println("Success is not final, failure is not fatal: it is the courage to continue that counts. Winston Churchill");
            break;
         case 5:
            System.out.println("Hardships often prepare ordinary people for an extraordinary destiny. C.S.Lewis");
            break;
         case 6:
            System.out.println("Believe in yourself, you are braver than you think, more talented than you know, and capable of more than you imagine. Roy T.Bennet");
            break;
         case 7:
            System.out.println("I learned that courage was not the absence of fear, but the triumph over it. The brave man is not he who does not feel afraid, but he who conquers that fear. Nelson Mandela");
            break;
         case 8:
            System.out.println("There is only one thing that makes a dream impossible to achieve: The fear of failure. Paulo Coelho");
            break;
         case 9:
            System.out.println("Your true success in life begins only when you make the commitment to become excellent at what you do. Brian Tracy");
            break;
         case 10:
            System.out.println("Hard times don't create heroes. It is during the hard times when the 'hero' within us is revealed. Bob Riley");
            break;     
            }
   }
}