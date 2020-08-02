
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Arraylist_frequency{
    public static void main(String[] args) {
        // I wanna know all frequency of single word showed up in string.
    String input="AAABBBCCDD";String res="";
        ArrayList<String>list=new ArrayList<>();
    for(int i=0;i<input.length();i++){
        // Amending begins below
        if(!res.contains(input.charAt(i)+"")){
            res+=input.charAt(i);
        }
        //list.add(Character.toString(input.charAt(i)));
    }
//    for(String each1:res.split("")){
//        list.add(each1);
//    }
        list.addAll(Arrays.asList(input.split("")));
        System.out.println(list);

for(String each:res.split(""))// here if you wanna use for-each loop you need to use non-primitive data, meaning use valued data{
    System.out.print(each+Collections.frequency(list,each));
}



    }



