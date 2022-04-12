import java.util.Scanner;
public class Methods {
    static String newCurrency;

    //Method for Display Account Information
    public static void DisplayInformation(String currentCurrency) {
        System.out.println("\n ***Account Information***"); 
        System.out.println("----------------------------"); 
        for (int count=0; count<BankingApp.accounts.length; count++){
            System.out.println("Name: " + BankingApp.accounts[count]+ "\nFunds: " + currentCurrency+ " " + BankingApp.balance[count] +"\nCurrent Currency: " +currentCurrency);
        }
        
    }

    //Method for Adding Funds to the Account
    public static void AddFunds(String currentCurrency) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ***Add Funds***"); 
        System.out.println("----------------------------"); 
        for (int count=0; count<BankingApp.accounts.length; count++){
        //Ask user to input amount to be added to the account and store the value to amount
        System.out.println("Enter the amount you want to add: ");  
        double amount = sc.nextDouble();  
            if(amount<500){
                System.out.println("Cannot add the amount entered.\nA minimum amount of 500 is required to add funds.");
                
            }

            else {
                //Add the amount entered to the balance and assign the result of balance
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
        //Ask user to input amount to be withdrawn from the account and store the value to amount
        System.out.println("Enter the amount you want to withdraw: ");  
        double amount = sc.nextDouble();
            if(amount<=BankingApp.balance[count] && amount >= 500){
                //Subtract the amount entered from the balance and assign the result to balance
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
            //Assign currentCurrency to currency[1] which is "USD"
            BankingApp.currentCurrency=BankingApp.currency[1];
            currentCurrency = BankingApp.currency[1];
            //Display information of the conversion
            System.out.println("1 PHP = 0.019185473 USD");
            System.out.println("PHP "+BankingApp.balance[count]+ " = USD "+(BankingApp.balance[count]*0.019185473));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 0.019185473;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is USD
        return currentCurrency;

    }


    //Method to convert FROM PHP TO JPY
    public static String ConvertFundsFromPhpToJPY(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            //Assign currentCurrency to currency[2] which is "JPY"
            BankingApp.currentCurrency=BankingApp.currency[2];
            currentCurrency = BankingApp.currency[2];
            //Display information of the conversion
            System.out.println("1 PHP = 2.41 JPY");
            System.out.println("PHP "+BankingApp.balance[count]+ " = JPY" +(BankingApp.balance[count]*2.41));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 2.41;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is JPY
        return currentCurrency;

    }


    //Method to convert FROM USD TO PHP
    public static String ConvertFundsFromUsdToPhp(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            //Assign currentCurrency to currency[0] which is "PHP"
            BankingApp.currentCurrency=BankingApp.currency[0];
            currentCurrency = BankingApp.currency[0];
            //Display information of the conversion
            System.out.println("1 USD = 52.12277 PHP");
            System.out.println("USD " + BankingApp.balance[count]+ " = PHP " +(BankingApp.balance[count]*52.12277));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 52.12277;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is PHP
        return currentCurrency;

    }

    //Method to convert FROM USD TO JPY
    public static String convertFundsFromUsdToJpy(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            //Assign currentCurrency to currency[2] which is "JPY"
            BankingApp.currentCurrency=BankingApp.currency[2];
            currentCurrency = BankingApp.currency[2];
            //Display information of the conversion
            System.out.println("1 USD = 125.40972 JPY");
            System.out.println("USD " +BankingApp.balance[count]+ " = JPY " +(BankingApp.balance[count]*125.40972));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 125.40972;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +" Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is JPY
        return currentCurrency;

    }


    //Method to convert FROM JPY TO PHP
    public static String convertFundsFromJpyToPhp(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            //Assign currentCurrency to currency[0] which is "PHP"
            BankingApp.currentCurrency=BankingApp.currency[0];
            currentCurrency = BankingApp.currency[0];
            //Display information of the conversion
            System.out.println("1 JPY = 0.4154494 PHP");
            System.out.println("JPY " + BankingApp.balance[count]+ " = PHP " +(BankingApp.balance[count]*0.4154494));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 0.4154494;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +"Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is PHP
        return currentCurrency;

    }

    //Method to convert FROM JPY TO USD
    public static String convertFundsFromJpyToUsd(String currentCurrency) {
        for (int count=0; count<BankingApp.accounts.length; count++){
            //Assign currentCurrency to currency[1] which is "USD"
            BankingApp.currentCurrency=BankingApp.currency[1];
            currentCurrency = BankingApp.currency[1];
            //Display information of the conversion
            System.out.println("1 JPY = 0.0079740937 USD");
            System.out.println("JPY " + BankingApp.balance[count]+ " = USD " +(BankingApp.balance[count]*0.0079740937));
            //Calculate the conversion by multiplying balance to the conversion rate and assign the result to balance
            BankingApp.balance[count] = BankingApp.balance[count] * 0.0079740937;
            System.out.println("Conversion Successful.");
            //System.out.println("Name: " + BankingApp.accounts[count]+ " Funds: " + BankingApp.balance[count] +" Current Currency:" +currentCurrency);
        }
        //return currentCurrency to main which is USD
        return currentCurrency;

    }


    
}



