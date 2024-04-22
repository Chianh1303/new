public class TestMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array1 = new int[array.length+1];

        for(int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }
        for (int a : array){
            System.out.print(a + " ");
        }
    }
}
