import java.util.Arrays;
import java.util.Scanner;

public class giaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size zô đây :");
        int arr = sc.nextInt();
        int[] mang = new int[arr];
        for (int i = 0; i < mang.length;i++){
            mang[i] = sc.nextInt();
        }
        int min = mang[0];
        for (int i = 1; i < mang.length;i++){
            if (mang[i] < min){
                min = mang[i];
            }

        }
        System.out.println(Arrays.toString(mang));
        System.out.println("Size nhỏ nhất là:" + min);
    }
}
