package Patterns;
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        seeding(n);
    }
    public static void seeding(int n) {
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
