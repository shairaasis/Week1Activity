import java.util.Scanner;
public class BankingApp {  
    static int length=1, count=0;
    static String currentCurrency;
    static String[] accounts = new String[length];
    static double[] balance = new double [length];
    static int[] userNumber = new int [length];
    static String[] currency = {"PHP", "USD", "JPY"};

    public static void main(String arg[]) {  
        String currentCurrency = currency[0];
        Scanner sc = new Scanner(System.in);
        //Initial ask user to input name
        for(int index=0; index<accounts.length; index++){
            System.out.println("Enter your name: ");  
            accounts[index]=sc.nextLine();    
            userNumber [0] = 1;
            balance[0] = 10000;
        }



        int choice;
        do{
            
            System.out.println("\n\n ***Choose Transaction***"); 
            System.out.println("----------------------------"); 
            System.out.println("0.Exit\n1.Display Information\n2.Add Funds\n3.Withdraw funds\n4.Convert Funds");  
            System.out.println("----------------------------"); 
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            

            switch(choice){
                case 0: 
                    System.out.println("\nThank you for using my Banking App!");
                break;

                case 1:
                    Methods.DisplayInformation(currentCurrency);
                break;

                case 2:
                    Methods.AddFunds(currentCurrency);
                break;

                case 3:
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
                    System.out.println("Choose Currency:");
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){

                            Methods.ConvertFundsFromPhpToUsd(currentCurrency);
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            Methods.ConvertFundsFromPhpToJPY(currentCurrency);
                            currentCurrency = BankingApp.currentCurrency;
                        }

                    }


                    else if(currentCurrency == "USD"){
                    System.out.println("Available Currencies");
                    System.out.println("-------------------");
                    System.out.println("1."+BankingApp.currency[0] +"\n2." +BankingApp.currency[2]);
                    System.out.println("----------------------");
                    System.out.println("Choose Currency:");                   
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){

                            Methods.ConvertFundsFromUsdToPhp(currentCurrency);
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            Methods.convertFundsFromUsdToJpy(currentCurrency);
                            currentCurrency = BankingApp.currentCurrency;
                        }

                    }



                    else if(currentCurrency == "JPY"){
                    System.out.println("Available Currencies");
                    System.out.println("-------------------");
                    System.out.println("1."+BankingApp.currency[0] +"\n2." +BankingApp.currency[1]);
                    System.out.println("----------------------");
                    System.out.println("Choose Currency:");
                    int currencyChosen = sc.nextInt();
                    System.out.println("-------------------");
                        if(currencyChosen==1){

                            Methods.convertFundsFromJpyToPhp(currentCurrency);
                            currentCurrency = BankingApp.currentCurrency;
                        }
                        
                        else if(currencyChosen ==2){
                            Methods.convertFundsFromJpyToUsd(currentCurrency);
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