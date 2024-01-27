package LearnTheBasics;
import java.util.*;
public class SumOfEven_n_Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sum1=0;
        int sum2=0;
        while(n>0){
            int rev=0;
            rev=n%10;
            if(rev%2==0){

                sum1 = sum1+rev;
            }
            else{

                sum2 = sum2+rev;
            }
            n=n/10;
        }
        System.out.println(sum1 +" "+sum2);

    }
}
