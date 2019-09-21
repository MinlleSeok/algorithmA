package dataStructure;
import java.util.Scanner;
// print the input decimal number after converting from binary to hexadecimal.
public class CardConvRev
{
  // Convert the integer value x to decimal r
  // Put it in the array d from the number one position down.
  // Return the number of digits.
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; // the digit number after converting
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          
        do {
            d[digits++] = dchar.charAt(x % r); // store the rest divided by r.
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner (System.in);
        int no; // Converting integer
        int cd; // cardinal number
        int dno; // digit number after converting
        int retry; // retry?
        char[] cno = new char[32]; // Array of characters for storing number after converting

        System.out.println("Convert a decimal number to other cardinal number");
        
        do {
            do {
                System.out.print("Non-negative integer to convert : ");
                no = stdIn.nextInt();
            } while (no < 0);
            
            do {
                System.out.print("What cardinal number do you want to convert? : ");
                cd = stdIn.nextInt();
            } while (cd < 2 ||  cd > 36);
            
            dno = cardConvR(no, cd, cno); //convert no to cd
            
            System.out.println("to cardinal number : " + cd);
            System.out.print("=> ");
            for (int i = dno - 1; i >= 0; i--)
                System.out.print(cno[i]);
            System.out.println();
            
            System.out.print("Do you want to retry? (1.Yes / 2.No) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
  }
}
