



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Using the regular way
public class Replit_215 {
   public static void main(String[] args) {
        ArrayList<Integer>value=new ArrayList<>();
        value.addAll(Arrays.asList(1,5,3,7));
       System.out.println(twoTimes(value));

        }
        //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer>value){
        ArrayList<Integer> res=new ArrayList<>();
        int j=0;
        for(int i=0;i<value.size()*2;i++){
            res.add(i,value.get(j++));
           res.add(i+1,res.get(i));
            i++;
        }
        return res;
        }
}
// Easy version
class easyReplit_215{
    public static void main(String[] args)
    {  ArrayList<Integer>value=new ArrayList<>();
    value.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(twoTimes(value));
    }
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> value){ // When creating a return type of a method, if it is Arraylist we do Not need to
        //add <type> here, instead we could use ArrayList to roughly cover. But   we could do either way.
      ArrayList<Integer>res=new ArrayList<>();
      res.addAll(value);
      res.addAll(res);
      Collections.sort(res);
      return res;
    }
}
