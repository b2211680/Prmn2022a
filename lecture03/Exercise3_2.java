package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("何行分入力しますか?");
        int num = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> a = new ArrayList<>();

        for(int i = 0; i < num; i++){
            System.out.println(i + 1 + "行目");
            String b = scanner.nextLine();
            a.add(b);
        }

        for(String c: a){
            System.out.println("[" + a.indexOf(c) + "] " + c);
        }
    }
}
