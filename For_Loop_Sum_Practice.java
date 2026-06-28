import java.util.*;
public class For_Loop_Sum_Practice {
 public static void main(String[]args) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt();
    int sum = 0;
    for (int i=0 ; i<=n ; i++){
    sum = sum + i;}
    
    // Print the final result to the console
    System.out.println("Total Sum :" +sum );

    //close the scanner to prevent memory loss
    sc.close();
 }  
}
