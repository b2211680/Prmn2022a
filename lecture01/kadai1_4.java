package lecture01;

public class kadai1_4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            sum = sum + array[i];
        }

        System.out.println(sum);
    }
}
