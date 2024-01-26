package LearnTheBasics;
import java.util.*;
public class DataType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String type = s.nextLine();

        System.out.print(dataTypes(type));
    }
    public static int dataTypes(String type){
        if(type.equals("Integer")){
            return 4;
        }
        if(type.equals("Long")){
            return 8;
        }
        if(type.equals("Float")){
            return 4;
        }if(type.equals("Double")){
            return 8;
        } if(type.equals("Character")){
            return 1;
        }



        return 0;
    }
}
