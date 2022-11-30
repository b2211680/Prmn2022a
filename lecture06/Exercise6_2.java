package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            integers.add(random.nextInt(7));
        }
        System.out.println("さいころを5つ振りました。");

        System.out.println("何番目のさいころの値を確認しますか？");

        try {
            int index = scanner.nextInt();
            System.out.println(integers.get(index));

        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
            System.exit(0);

        }catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
            System.exit(0);
        }
    }
}
