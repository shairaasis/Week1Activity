import java.util.Scanner;
public class WeekAct {  
    static int length, count=0;
    String[] accounts = new String[length];
    double [] balance = new double [length];
    String [] currency = {"PHP", "USD", "JPY"};
    
    
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in); 
        double initialAmount = 10000;
        String currentCurrency = "PHP";
        //create initial accounts  
        System.out.print("How many number of account do you want to input? ");  
        int length = sc.nextInt();  
        String[] accounts = new String[length];
        double [] balance = new double [length];
        String [] currency = {"PHP", "USD", "JPY"};
        //for loop to ask user to input upto 5 names with their age
        for(int index=0; index<accounts.length; index++)  
        {  
            // Reading user input and store it in arrays person and age
            System.out.println("Enter the name: ");  
            sc.nextLine(); 
            accounts[index]=sc.nextLine();
            
            balance[index]= initialAmount;
            currency[0] = currentCurrency;

            /*for (int count=0; count<accounts.length; count++){
                System.out.println("Name: " + accounts[count]+ " Age: " + balance[count] +"Current Currency:" +currentCurrency);
            }*/
        }  


        System.out.println("\n ***Banking System***");  
        System.out.println("1. Display Information \n 2. Add Funds\n \n 3. Withdraw funds \n 4.Convert Funds \n 0. Exit");  
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
        case 1: 
                System.out.println("Display Information");
                for (int count=0; count<accounts.length; count++){
                    System.out.println("Name: " + accounts[count]+ "\nFunds: " + balance[count] +"\nCurrent Currency:" +currentCurrency);
                } break;

        case 2: System.out.println("Add funds"); 
                for (int count=0; count<accounts.length; count++){
                System.out.println("Enter the amount you want to add: ");  
                double amount = sc.nextDouble();  
                    if(amount>=500){
                        balance[count] = balance[count] + amount;  
                        System.out.println("Name: " + accounts[count]+ " Funds: " + balance[count] +"Current Currency:" +currentCurrency);
                    }
                    else{
                        System.out.println("Cannot withdraw amounts less than 500");
                    }
                } break;

        case 3: System.out.println("Withdraw funds"); 
                for (int count=0; count<accounts.length; count++){
                System.out.println("Enter the amount you want to withdraw: ");  
                double amount = sc.nextDouble(); 
                    if(amount<=0){
                        System.out.println("Invalid amount!");

                    }
                    else if(amount<500){
                        System.out.println("Cannot withdraw amounts less than 500!");

                    }
                    else if(amount>balance[count]){
                        System.out.println("Amount exceeded the current balance!");

                    }
                    else {
                        balance[count] = balance[count] - amount;  
                        System.out.println("Name: " + accounts[count]+ " Funds: " + balance[count] +"Current Currency:" +currentCurrency);
                    }
                    
                } break;
                
        case 4: System.out.println("Convert Currency"); 
                
                    for (int count=0; count<accounts.length; count++){
                        System.out.println("Choose currency\n0." +currency[0] +"\n1." +currency[1] + "\n2. " +currency[2]);
                        int newCurrency = sc.nextInt();
                        switch (newCurrency){
                            case 0: 
                                    currentCurrency=currency[0];
                                    System.out.println("1 PHP = 1 PHP");
                                    System.out.println(balance[count]+ " = " +(balance[count]*1));
                                    balance[count] = balance[count] * 1;
                                    System.out.println("Name: " + accounts[count]+ " Funds: " + balance[count] +"Current Currency:" +currentCurrency);

                            case 1: 
                                    currentCurrency=currency[1];
                                    System.out.println("1 PHP = 0.0192044 USD");
                                    System.out.println(balance[count]+ " = " +(balance[count]*0.0192044));
                                    balance[count] = balance[count] * 0.0192044;
                                    
                                    System.out.println("Name: " + accounts[count]+ " Funds: " + balance[count] +"Current Currency:" +currentCurrency);
                                    break;
                            case 2: 
                                    currentCurrency=currency[2];
                                    System.out.println("1 PHP = 2.41 JPY");
                                    System.out.println(balance[count]+ " = " +(balance[count]*2.41));
                                    balance[count] = balance[count] * 2.41;
                                    System.out.println("Name: " + accounts[count]+ " Funds: " + balance[count] +"Current Currency:" +currentCurrency);
                            break;
                                    
                            default:                                     
                                    

                        }
                    
                    
                    }
                

                    break;
        default:
            System.out.println("Terminated");
        


        }


        























    }

}