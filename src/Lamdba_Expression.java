import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lamdba_Expression {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,1,2,2,2,3,3,4,4,5,5,6,6,8,8,10,10));
        // I need to use removeif()method to remove some element, here we cannot use remove method
        //directly since Arraylist's size is dynamic, meaning it will keep changing.
        Predicate<Integer> lessthan5= n-> n<5;
        list.removeIf(lessthan5);
        System.out.println(list);

        System.out.println("===========================================");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));
        list2.removeIf(p-> Collections.frequency(list2,p)!=1);// element that are not unique.
        System.out.println(list2);
    }


}
