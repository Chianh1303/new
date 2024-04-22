public class gopmang {
    public static void main(String[] args){
//        b1 khai báo mảng
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9};
//        Mảng 3 = Mảng 1+ Mảng 2
        int[] array3 = new int [array1.length+ array2.length];
//        b2 in ra màn hiình 2 mảng
     for (int a : array1 ){
         System.out.print(a + " ");
        }
        System.out.println(" ");
     for (int b : array2){
         System.out.print(b + " ");
     }
     int intdex3 = 0;
     for(int i = 0; i < array1.length; i++){
         array3[intdex3] = array1[i];
         intdex3++;
     }
     for(int j = 0; j < array2.length;j++){
         array3[intdex3]= array2[j];
         intdex3++;
     }
        System.out.println("mang 3 la:");
     for(int t : array3){
         System.out.print(t + " ");
     }
    }
}

