package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.registerAccount("藤井智子", "12345");
        atm.registerAccount("藤井智子", "12345");

        atm.deposit("12345", 1000);
        long money = atm.withdraw("12345", 2000);
        System.out.println("所持金:" + money);
        money = atm.withdraw("12345", 500);
        System.out.println("所持金:" + money);
    }
}
