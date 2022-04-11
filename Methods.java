import java.util.Scanner;
public class Methods {
    static String newCurrency;

    public static void DisplayInformation(String currentCurrency) {
        System.out.println("\n ***Account Information***"); 
        System.out.println("----------------------------"); 
        for (int count=0; count<BankingApp.accounts.length; count++){
            System.out.println("Name: " + BankingApp.accounts[count]+ "\nFunds: " + currentCurrency+ " " + BankingApp.balance[count] +"\nCurrent Currency: " +currentCurrency);
        }
        
    }

    public static void AddFunds(String currentCurrency) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ***Add Funds***"); 
        System.out.println("----------------------------"); 
        for (int count=0; count<BankingApp.accounts.length; count++){
        System.out.println("Enter the amount you want to add: ");  
        double amount = sc.nextDouble();  
            if(amount<500){
                System.out.println("Cannot add the amount entered.\nA minimum amount of 500 is required to add funds.");
                
            }

            else {
                BankingApp.balance[count] = BankingApp.balance[count] + amount;  
                System.out.println("You successfully added "+currentCurrency +amount +" to your account.");
            }
        
        
        }
        
    }


    public static void WithdrawFunds(String currentCurrency) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ***Withdraw Funds***"); 
        System.out.println("----------------------------"); 
        for (int count=0; count < BankingApp.accounts.length; count++){
            System.out.println("Enter the amount you want to withdraw: ");  
            double amount = sc.nextDouble();
            if(amount<=BankingApp.balance[count] && amount >= 500){
                BankingApp.balance[count] = BankingApp.balance[count] - amount;  
                System.out.println("You have successfully withdrawn "+currentCurrency +amount +" from your account.");
            }

            else if(amount>BankingApp.balance[count]){
                System.out.println("Transaction cannot be processed.\nThe amount entered exceeded current balance.");
            }

            else if(amount<500){
                System.out.println("Transaction cannot be processed.\nA minimum amount of 500 is required to withdraw funds.");
            }
            else{

            }
        
        }

    }


    //Method to convert FROM PHP TO USD
    public static String ConvertFundsFromPhpToUsd(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[1];
            currentCurrency = BankingApp.currency[1];
            System.out.println("1 PHP = 0.019185473 USD");
            System.out.println("PHP "+BankingApp.balance[count]+ " = USD "+(BankingApp.balance[count]*0.019185473));
            BankingApp.balance[count] = BankingApp.balance[count] * 0.019185473;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }


    //Method to convert FROM PHP TO JPY
    public static String ConvertFundsFromPhpToJPY(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[2];
            currentCurrency = BankingApp.currency[2];
            System.out.println("1 PHP = 2.41 JPY");
            System.out.println("PHP "+BankingApp.balance[count]+ " = USD" +(BankingApp.balance[count]*2.41));
            BankingApp.balance[count] = BankingApp.balance[count] * 2.41;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }








    //Method to convert FROM USD TO PHP
    public static String ConvertFundsFromUsdToPhp(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[0];
            currentCurrency = BankingApp.currency[0];
            System.out.println("1 USD = 52.12277 PHP");
            System.out.println("USD " + BankingApp.balance[count]+ " = PHP " +(BankingApp.balance[count]*52.12277));
            BankingApp.balance[count] = BankingApp.balance[count] * 52.12277;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }
    //Method to convert FROM USD TO JPY
    public static String convertFundsFromUsdToJpy(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[2];
            currentCurrency = BankingApp.currency[2];
            System.out.println("1 USD = 125.40972 JPY");
            System.out.println("USD " +BankingApp.balance[count]+ " = JPY " +(BankingApp.balance[count]*125.40972));
            BankingApp.balance[count] = BankingApp.balance[count] * 125.40972;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +" Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }

















    //Method to convert FROM JPY TO PHP
    public static String convertFundsFromJpyToPhp(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[0];
            currentCurrency = BankingApp.currency[0];
            System.out.println("1 JPY = 0.4154494 PHP");
            System.out.println("JPY " + BankingApp.balance[count]+ " = PHP " +(BankingApp.balance[count]*0.4154494));
            BankingApp.balance[count] = BankingApp.balance[count] * 0.4154494;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }
    //Method to convert FROM JPY TO USD
    public static String convertFundsFromJpyToUsd(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            BankingApp.currentCurrency=BankingApp.currency[1];
            currentCurrency = BankingApp.currency[1];
            System.out.println("1 JPY = 0.0079740937 USD");
            System.out.println("JPY " + BankingApp.balance[count]+ " = USD " +(BankingApp.balance[count]*0.0079740937));
            BankingApp.balance[count] = BankingApp.balance[count] * 0.0079740937;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +" Current Currency:" +currentCurrency);
        }

        return currentCurrency;

    }


    
}



