public class Recursion {
    public static int recursion(int x){
        if(x>0){
            return x+(recursion(x-1)); // For recursion the core understanding is to call the same method over and over again.
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10));
    }



}

