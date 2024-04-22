import java.util.Scanner;

public class giaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
    int [][]arr = {{2,4,6,8} ,{1,3,5,7}};
    int maximum = arr[0][0];
    for (int i =0; i<arr.length;i++){
        for (int j =0;j < arr[i].length;j++){
            if (arr[i][j] > maximum){
                maximum = arr[i][j];
            }

        }
    }
        System.out.println("Gía trị lớn nhất là: "+maximum);
    }
}