import java.util.Arrays;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
public class remove_duplicate {
    
        public static void A_Sorting(int[]Original_Array){
            int Temp=0;
            for(int i=0;i<Original_Array.length;i++){
                for(int j=i+1;j<Original_Array.length;j++){
                    if(Original_Array[i]>Original_Array[j]){
                        Temp=Original_Array[i];
                        Original_Array[i]=Original_Array[j];
                        Original_Array[j]=Temp;
                    }
                }
            }
            System.out.print("Arrays order ascending");
            System.out.println(Arrays.toString(Original_Array));
        }
        public static void D_Sorting(int[]Original_Array){
            int Temp=0;
            for(int i=0;i<Original_Array.length;i++){
                for(int j=i+1;j<Original_Array.length;j++){
                    if(Original_Array[i]<Original_Array[j]){
                        Temp=Original_Array[i];
                        Original_Array[i]=Original_Array[j];
                        Original_Array[j]=Temp;
                    }
                }
            }
            System.out.print("Arrays order descending");
            System.out.println(Arrays.toString(Original_Array));
        }
        //
        public static void Num_remove_dup(int[] Array ){ // when we need to remove any duplicate from an int Array,
            //we have to compare the first with the next only when it is sorted
            // remove the non-duplicate to new arr. But need to know what the size is.
            int n1=0;
            int n2=0;
            for(int i=0;i<Array.length-1;i++){

                if(Array[i]==Array[i+1]){
                    n2+=1;
                }
            }// no need to consider last element
            System.out.println(n2);




//        int[] arr=new int[n1];
            int[] arr=new int[Array.length-n2];

            int j=0;
            for(int i=0;i<Array.length-1;i++){
                if(Array[i]!=Array[i+1]){
                    arr[j]=Array[i];
                    j++;
                }
            }
            arr[j++]=Array[Array.length-1];
            System.out.println(Arrays.toString(arr));

        }

        public static void main(String[] args) {
            int[]Original_Array={5,6,9,3,14,89};
            A_Sorting(Original_Array);
            int[] Array={3,3,5,6,7,7,8};
            Num_remove_dup(Array);
            System.out.println("Method called");
        }
    }






    class String_Array_removeDuplicate{
        public static void main(String[] args) {
            String [] A={"A","A","B","C","D"};


            String A1=String.valueOf(A);
            System.out.println(A1);
            String res="";
            for(int i=0;i<A.length;i++){

                if(!(res.contains(A[i]))){
                    res+=A[i];
                }
            } System.out.println(res);
        }


    }


    class test2{
        public static void main(String[] args) {
            int[] Array={3,3,5,6,7,7,8};// remove the non-duplicate to new arr. But need to know what the size is.
            int n1=0;
            int n2=0;
            for(int i=0;i<Array.length-1;i++){

//            if(Array[i]!=Array[i+1]){
//               n+=1;
//            }
//            // Since last element cannot be included, we need to increase 1 at last. Or we can use subtraction.
//
//        }
//           n++;
//            System.out.println(n1);

                if(Array[i]==Array[i+1]){
                    n2+=1;
                }
            }// no need to consider last element
            System.out.println(n2);




//        int[] arr=new int[n1];
            int[] arr=new int[Array.length-n2];

            int j=0;
            for(int i=0;i<Array.length-1;i++){
                if(Array[i]!=Array[i+1]){
                    arr[j]=Array[i];
                    j++;
                }
            }
            arr[j++]=Array[Array.length-1];
            System.out.println(Arrays.toString(arr));
        }
    }


}
