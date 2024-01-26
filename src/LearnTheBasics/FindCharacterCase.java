package LearnTheBasics;
import java.util.*;
public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='A'&& a<='Z'){
            System.out.print("1");
        }
        else if(a>='a' && a<='z'){
            System.out.print("0");
        }
        else{
            System.out.print("-1");
        }
    }
}
