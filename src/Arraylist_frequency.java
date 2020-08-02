
import java.util.ArrayList;
import java.util.Collections;


public class Arraylist_frequency{
    public static void main(String[] args) {
        // I wanna know all frequency of single word showed up in string.
    String input="AAABBBCCDD";
        ArrayList<String>list=new ArrayList<>();
    for(int i=0;i<input.length();i++){
        list.add(Character.toString(input.charAt(i)));
    }
        System.out.println(list);
for(String each:list){
    System.out.println(each+Collections.frequency(list,each));
}



    }


}
