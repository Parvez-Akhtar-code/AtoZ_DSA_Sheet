package Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        nNumberTriangle(n);
    }
    public static void nNumberTriangle(int n) {
        for(int i=1;i<=n;i++){
            int count=1;
            for(int j=n;j>=i;j--){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
