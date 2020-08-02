import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Method_arraysClass_Arraylist_Collection {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', '1', 'b', 'c', 'd', '$', '#', '@', '7', '*'));
        Collections.swap(list,0,1);
        System.out.println(list);

        ArrayList<String> Stringlist = new ArrayList<>();
        Stringlist.addAll(Arrays.asList("A","B","C","D","E","F","G"));


            System.out.println("When using Collections.swap method you need to provide list and index of the element you wanna swap with,remember only index number will be taken");

            Collections.swap(Stringlist,0,1);// If you wanna change the position of "A" and "B"(Please use index number of "A"and "B")


    }
}
