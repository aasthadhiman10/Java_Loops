import java.util.*;
public class Table_Generator_Loop {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // Take the number input from the user 
        int n = sc.nextInt();

        // Loop starts at 1 and runs up to 10 to print a standard table
        for (int i = 1 ; i <= 11 ; i++) {

            System.out.println(i*n);
            sc.close();
        }

    }
    
}
