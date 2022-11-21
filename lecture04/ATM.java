package lecture04;

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accountList;

    public ATM(){
        this.accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number){
        if(existsAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            accountList.add(new Account(name, number));
            System.out.println(name + " さんのアカウントを 口座番号:" + number + " で登録しました。");
        }
    }

    public boolean existsAccount(String name, String number){
        for(Account account: accountList){
            if(account.getName() == name && account.getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public void deposit(String number, long money){
        for(Account account: accountList){
            if(account.getNumber() == number){
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + account.getNumber() + " に " + money + " 円入金しました。");
            }
        }
    }

    public long withdraw(String number, long money){
        for(Account account: accountList){
            if(account.getNumber() == number){
                if((account.getBalance() - money) < 0){
                    System.out.println("口座番号:" + account.getNumber() + " から " + money + " 円引き出せませんでした。残高:" + account.getBalance() + "円です。");
                }else{
                    account.setBalance(account.getBalance() - money);
                    System.out.println("口座番号:" + account.getNumber() + " から " + money + " 円引き出しました。残高:" + account.getBalance() + "円です。");
                    return money;
                }
            }
        }
        return 0;
    }
}
