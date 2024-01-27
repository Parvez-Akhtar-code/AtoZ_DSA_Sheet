package LearnTheBasics;
import java.util.*;
public class If_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(CompareIfElse(a,b));
    }
    public static String CompareIfElse(int a, int b) {
        if(a>b){
            return "greater";
        }
        else if(a<b){
            return "smaller";
        }
        else if(a==b){
            return "equal";
        }
        return "";
    }
}
