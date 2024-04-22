import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1,24,3,43,5,64,7};

        System.out.println("Ta có mang mang ban đầu là:");

        for(int a : array){
            System.out.print(a + " ");
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMời nhập vị trí cần xóa.");
        int viTri = scanner.nextInt();

        if (viTri < 0 || viTri > array.length){
            System.out.println("Vị trí không phù hợp.");
        }else {

            for (int i = viTri; i < array.length; i++){
                array[i-1] = array[i];
            }
        }
        array = Arrays.copyOf(array, array.length -1);

        System.out.println("Mang moi là:");

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
