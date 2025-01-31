

public class BankAccount{

    public static void main (String[]args){
        double money = 2175.37;
        System.out.println("Bob has a balance of $"+ money + " in his checking account with Texas Bank");

        money -= 302.50;
        System.out.println("Bob withdrew $"+ money );

        
        money += 50.03; 
        System.out.println("Bob deposited $" + String.format("%.2f",money)); 
        money /= 2.00;
        
        System.out.println("Bob withdrew half his balance which left him $" + String.format("%.2f", money ));
        money += 20.00;
        System.out.println("Bob deposited $20.00 which left him a balance of $" + String.format ("%.2f", money));

        money -= 1.00;
        System.out.println("Bob withdrew a $1 which left him a balance of $" + String.format("%.2f", money));

        money *= 2.00;
        System.out.println("Bob deposited his paycheck that doubled his current balance which left him $" + String.format("%.2f", money));

        money += 1.00;
        System.out.println("Bob deposited a $1 and his end balance is $" + String.format("%.2f", money));

    }
}
