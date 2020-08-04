public class Method_with_String_extractNumberfromString {
    public static void main(String[] args) {
    String end=extractNum("AAb257");
    System.out.println(end);
    System.out.println(extractNum("aa2aa3"));
} public static String extractNum(String s) {
    String result="";
    for(char each: s.toCharArray()){
        if(Character.isDigit(each)){
            result+=each;
        }
    }return result;

}
}
