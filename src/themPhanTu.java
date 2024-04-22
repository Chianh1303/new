import java.util.Arrays;

public class themPhanTu {
    public static void main(String[] args) {
       int[] arr1 = {1,23,45,6};
       int[] arr2= new int[arr1.length+1];
       int index = 2;
       for (int i =0;i< arr1.length;i++){
           arr2[i]=arr1[i];
       }
       arr2 [index]= 32;
       for (int i=index+1;i< arr2.length;i++){
           arr2[i]= arr1[i-1];
       }
        System.out.println(Arrays.toString(arr2));
    }
}
