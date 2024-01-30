package Patterns;
import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int n=sc.nextInt();
    nForest(n);
    }
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
