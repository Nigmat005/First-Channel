import java.util.ArrayList;
import java.util.Arrays;

public class remove_digit_and_letters {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', '1', 'b', 'c', 'd', '$', '#', '@', '7', '*'));
        list.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(list);


        System.out.println("=====================================");
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '@', '?', '*', '&'));
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> SpecialChar = new ArrayList<>();
        //  Filling digits part
        digit.addAll(list2);// here we use list instead of Arrays.asList()method because list is Arraylist type also belongs to Collection type.
        System.out.println(digit);
        digit.removeIf(p -> !Character.isDigit(p));
        System.out.println(digit);

        // Filling letters part
        letters.addAll(list2);// here we use list instead of Arrays.asList()method because list is Arraylist type also belongs to Collection type.
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);

        // Filling SpecialChar part
        SpecialChar.addAll(list2);// here we use list instead of Arrays.asList()method because list is Arraylist type also belongs to Collection type.
        SpecialChar.removeAll(digit);   /*Since here we have removed all digit and letters to Arraylist digit and Arraylist letter respectively, we can directly
        remove all digits and letter then all we have are specialchar*/
        SpecialChar.removeAll(letters);
        System.out.println(SpecialChar);
    }
    }


