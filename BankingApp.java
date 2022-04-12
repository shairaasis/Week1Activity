import java.util.Scanner;
public class BankingApp {  
    static int length=1, count=0;
    static String currentCurrency;
    static String[] accounts = new String[length];
    static float[] balance = new float [length];
    static int[] userNumber = new int [length];
    static String[] currency = {"PHP", "USD", "JPY"};

    public static void main(String arg[]) {  
        String currentCurrency = currency[0];
        Scanner sc = new Scanner(System.in);
        //2. Initially ask the user to input his Name and set the initial funds to 10,000 and the initial currency to PHP.
        System.out.println("Enter your name: ");  
        accounts[0]=sc.nextLine();    
        userNumber [0] = 1;
        balance[0] = 10000;
            
        
        int choice;
        //Program will keep on running until the user inputs 0. Exit 
        do{
            
            System.out.println("\n\n ***Choose Transaction***"); 
            System.out.println("----------------------------"); 
            System.out.println("0.Exit\n1.Display Information\n2.Add Funds\n3.Withdraw funds\n4.Convert Funds");  
            System.out.println("----------------------------"); 
            
            //Ask the user to input choice of transaction (store the input to choice)
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            

            switch(choice){
                case 0: 
                    //Program ends / Exit
                    System.out.println("\nThank you for using my Banking App!");
                break;

                case 1:
                    //Call the method for Displaying Account Information
                    Methods.DisplayInformation(currentCurrency);
                break;

                case 2:
                    //Call the method for Adding Funds to Account
                    Methods.AddFunds(currentCurrency);
                break;

                case 3:
                    //Call the method for Withdrawing Funds from Account
                    Methods.WithdrawFunds(currentCurrency);
                break;

                case 4:
                    System.out.println("\n ***Convert Funds***"); 
                    System.out.println("----------------------------");
                    //If current currency is PHP, only USD and JYP are available to convert to
                    if(currentCurrency == "PHP"){
                    System.out.println("Available Currencies");
                    System.out.println("-------------------");
                    System.out.println("1."+BankingApp.currency[1] +"\n2." +BankingApp.currency[2]);
                    System.out.println("----------------------");
                    //Ask the user to choose currency (store the input to currencyChosen)
                    System.out.println("Choose Currency:");
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){
                            //Call the Method for Converting Funds From PHP to USD
                            Methods.ConvertFundsFromPhpToUsd(currentCurrency);
                            //The method will return currentcCurrency from Methods Class (Now USD) and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            //Call the Method for Converting Funds From PHP to JPY
                            Methods.ConvertFundsFromPhpToJPY(currentCurrency);
                            //The method will return currentcCurrency from Methods Class (Now JPY)and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }

                    }

                    //If current currency is USD, only PHP and JPY are available to convert to
                    else if(currentCurrency == "USD"){
                    System.out.println("Available Currencies");
                    System.out.println("-------------------");
                    System.out.println("1."+BankingApp.currency[0] +"\n2." +BankingApp.currency[2]);
                    System.out.println("----------------------");
                    //Ask the user to choose currency (store the input to currencyChosen)
                    System.out.println("Choose Currency:");                   
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){
                            //Call the Method for Converting Funds From USD to PHP
                            Methods.ConvertFundsFromUsdToPhp(currentCurrency);
                            //The method will return currentCurrency from Methods Class (Now PHP) and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            //Call the Method for Converting Funds From USD to JPY
                            Methods.convertFundsFromUsdToJpy(currentCurrency);
                            //The method will return currentCurrency from Methods Class (Now JPY) and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }

                    }


                    //If current currency is JPY, only PHP and USD are available to convert to
                    else if(currentCurrency == "JPY"){
                    System.out.println("Available Currencies");
                    System.out.println("-------------------");
                    System.out.println("1."+BankingApp.currency[0] +"\n2." +BankingApp.currency[1]);
                    System.out.println("----------------------");
                    //Ask the user to choose currency (store the input to currencyChosen)
                    System.out.println("Choose Currency:");
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){
                            //Call the Method for Converting Funds From JPY to PHP
                            Methods.convertFundsFromJpyToPhp(currentCurrency);
                            //The method will return currentCurrency from Methods Class (Now PHP) and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            //Call the Method for Converting Funds From JPY to USD
                            Methods.convertFundsFromJpyToUsd(currentCurrency);
                            //The method will return currentCurrency from Methods Class (Now USD) and assign it to currentCurrency of BankingApp class
                            currentCurrency = BankingApp.currentCurrency;
                        }
    
                    }
                    else
    
                break;
            }
        }

        while(choice<5 && choice > 0);


    sc.close();

    }

}