package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();

        for(int i = 0; i < 2; i++){
            System.out.println(i + 1 + "つ目の整数を入力してください:");
            String b = scanner.nextLine();
            a.add(b);
        }

        System.out.println(a.get(0) + " + " + a.get(1) + " = " + (Integer.parseInt(a.get(0)) + Integer.parseInt(a.get(1))));
    }
}
