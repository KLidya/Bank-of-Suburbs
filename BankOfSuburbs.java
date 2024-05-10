/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itexps.bankofsuburbs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phalk
 */
public class BankOfSuburbs {
    public static void main(String[] args) {
        int choice;
        ArrayList<Employee> finalEmployees = new ArrayList();
        ArrayList<Customer> finalCustomers = new ArrayList();
        Bank myBank = new Bank("B001","Bank Of Suburbs","9990000111","Schaumburg, IL",finalEmployees,finalCustomers);
        do {
            System.out.println("|**********************************|");
            System.out.println("|*** Welcome to Bank Of Suburbs ***|");
            System.out.println("|**********************************|");         
            System.out.println("|        1. Admin Portal           |");
            System.out.println("|        2. Employee Portal        |");
            System.out.println("|        3. Customer Portal        |");
            System.out.println("|        4. Exit                   |");
            System.out.println("|**********************************|");
            
            System.out.println(" --> Please make your selection from above options : <--");
            Scanner sc1 = new Scanner(System.in);
            choice = sc1.nextInt();         
            switch(choice) {
                case 1 :
                        printAdminMenu();
                        break;
                case 2 :
                        String uname,password;
                        Scanner sc2= new Scanner(System.in);
                        System.out.println("Enter Username to Login Employee Portal:");
                        uname= sc2.next();
                        System.out.println("Enter Password to Login Employee Portal:");
                        password= sc2.next();
                        if(uname.equals("emp") && password.equals("emp@123")){
                          printEmployeeMenu(myBank,finalCustomers);  
                        }else{
                            System.out.println("Please check your Credentials and Try again..!");  
                        }  
                        break;
                case 3 :
                        printCustomerMenu();
                        break;
                case 4 :
                        System.out.println("Thanks for visiting Bank Of Suburbs...See you soon...!");
                        break;
                default :
                        System.out.println("Try again...Unfortunately, you won't be to able visit any portal, as you have made the wrong selection..!");
                        break;
            }
        }while(choice!=4);
    }

    private static void printAdminMenu() {
        System.out.println("I am in Admin Portal");
    }
    
    private static void printEmployeeMenu(Bank myBank,ArrayList<Customer> finalCustomers) {
            int choice2;
            do {
                System.out.println("|****************************************|");
                System.out.println("|****** Welcome to Employee Portal ******|");
                System.out.println("|****************************************|");         
                System.out.println("|  1. Add Customer and Open Account/s    |");
                System.out.println("|  2. Update Customer Details            |");
                System.out.println("|  3. Find Customer                      |");
                System.out.println("|  4. Print All Customer's Information   |");
                System.out.println("|  5. Exit                               |");
                System.out.println("|****************************************|");

                System.out.println(" --> Please make your selection from above options : <--");
                Scanner sc1 = new Scanner(System.in);
                choice2 = sc1.nextInt();
                switch(choice2) {
                        case 1 :
                                Customer cust=new Customer();
                                addCustomer(cust);
                                System.out.println("Added Customer:");
                                System.out.println(cust);
                                finalCustomers.add(cust);
                                break;
                        case 2 :
                                updateCustomer(finalCustomers);
                                break;
                        case 3 :
                                findCustomer(finalCustomers);
                                break;
                        case 4 :
                                printAll(finalCustomers); 
                                break;
                        case 5 :
                                System.out.println("Thanks for visiting Employee Portal...!");
                                myBank.setCustomers(finalCustomers);
                                System.out.println(myBank);
                                break;
                        default :
                                System.out.println("Try again...you have made the wrong selection..!");
                                break;
                }
            }while(choice2!=5);
    }
    
    private static void printCustomerMenu() {
        System.out.println("I am in Customer Portal");
    }

    private static void addCustomer(Customer cust) {
        String answer;
        ArrayList<Account> accountsArray = new ArrayList();
        System.out.println("Enter Customer ID:");
        Scanner sc3=new Scanner(System.in);
        answer=sc3.next();
        cust.setId(answer);
        
        System.out.println("Enter Customer's First Name:");       
        answer=sc3.next();
        cust.setFirstname(answer);
        
        System.out.println("Enter Customer's Last Name:");      
        answer=sc3.next();
        cust.setLastname(answer);
        
        System.out.println("Enter Customer's Email:");       
        answer=sc3.next();
        cust.setEmail(answer);
        
        System.out.println("Enter Customer's Phone:");
        answer=sc3.next();
        cust.setPhone(answer);
        
        System.out.println("Enter Customer Type: Enter 'I'/'i' For Individual and 'B'/'b' For Business:");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("i")) {
           cust.setCustType(CustomerType.Individual);
        }else if(answer.equalsIgnoreCase("b")) {
           cust.setCustType(CustomerType.Business); 
        }else {
           cust.setCustType(CustomerType.Individual); 
        }
        
        System.out.println("Customer wants to open Checking Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account checkAcc = new Account();
           System.out.println("Enter Checking Account Number:");      
            answer=sc3.next();
            checkAcc.setId(answer);
            checkAcc.setAccType(AccountType.Checking);
            System.out.println("Enter Balance For Checking Account:");
            float balance = sc3.nextFloat();
            checkAcc.setBalance(balance);
            accountsArray.add(checkAcc);
        }
        
        System.out.println("Customer wants to open Saving Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account savingAcc = new Account();
           System.out.println("Enter Saving Account Number:");      
            answer=sc3.next();
            savingAcc.setId(answer);
            savingAcc.setAccType(AccountType.Saving);
            System.out.println("Enter Balance For Saving Account:");
            float balance = sc3.nextFloat();
            savingAcc.setBalance(balance);
            accountsArray.add(savingAcc);
        }
        
        System.out.println("Customer wants to open FD Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account fdAcc = new Account();
           System.out.println("Enter FD Account Number:");      
            answer=sc3.next();
            fdAcc.setId(answer);
            fdAcc.setAccType(AccountType.FixedDeposite);
            System.out.println("Enter Balance For FD Account:");
            float balance = sc3.nextFloat();
            fdAcc.setBalance(balance);
            accountsArray.add(fdAcc);
        }
        
        cust.setAccounts(accountsArray);
    }

    private static void updateCustomer(ArrayList<Customer> finalCustomers) {
        int count=0;
        String answer;
        System.out.println("Please Enter Customer ID to Update Information For:");
        Scanner sc4 = new Scanner(System.in);
        String custId = sc4.next();
        for(Customer cust:finalCustomers){
            if(custId.equals(cust.getId())) {
               count++;
               System.out.println("Existing First Name for Customer is : "+cust.getFirstname());
               System.out.println("Enter New First Name for Customer :");
               answer=sc4.next();
               cust.setFirstname(answer);

               System.out.println("Existing Last Name for Customer is : "+cust.getLastname());
               System.out.println("Enter New Last Name for Customer :");
               answer=sc4.next();
               cust.setLastname(answer);

               System.out.println("Existing Email for Customer is : "+cust.getEmail());
               System.out.println("Enter New Email for Customer :");
               answer=sc4.next();
               cust.setEmail(answer);

               System.out.println("Existing Phone Number for Customer is : "+cust.getPhone());
               System.out.println("Enter New Phone Number for Customer :");
               answer=sc4.next();
               cust.setPhone(answer);
            }
        }
        if(count==0) {
            System.out.println("Customer doesn't exist in Bank. Please Try Again with Correct Customer ID...!");
        }
    }

    private static void findCustomer(ArrayList<Customer> finalCustomers) {
        int count=0;
        System.out.println("Please Enter Customer ID to Find :");
        Scanner sc4 = new Scanner(System.in);
        String custId = sc4.next();
        for(Customer cust:finalCustomers){
            if(custId.equals(cust.getId())) {
                count++;
                System.out.println("Customer Found and Below are the Customer Details:");
                System.out.println("|-------------------------------------------------|");         
                System.out.println("|   ID      :    "+cust.getId());
                System.out.println("|   Name    :    "+cust.getFirstname()+" "+cust.getLastname());
                System.out.println("|   Email   :    "+cust.getEmail());
                System.out.println("|   Phone   :    "+cust.getPhone());
                for(Account acct:cust.getAccounts()){
                   System.out.println("|");
                   System.out.println("|   Account Number   :    "+acct.getId());
                   System.out.println("|   Account Type     :    "+acct.getAccType());
                   System.out.println("|   Account Balance  :    "+acct.getBalance());
                }
                System.out.println("|-------------------------------------------------|");
                break;
            }
        }
        
        if(count==0) {
            System.out.println("Customer doesn't exist in Bank. Please Try Again with Correct Customer ID...!");
        }
    }

    private static void printAll(ArrayList<Customer> finalCustomers) {
        System.out.println("Total Number Of Registered Customers with us : "+finalCustomers.size());
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|ID|Name|Email|Phone|Accounts(Number-Type-Balance)");
        for(Customer cust:finalCustomers){ 
            String str="";
            for(Account acct:cust.getAccounts()){
                   str = str+"|"+acct.getId()+"-"+acct.getAccType()+"-"+acct.getBalance();
                }
            System.out.println("|"+cust.getId()+"|"+cust.getFirstname()+" "+cust.getLastname()+"|"+cust.getEmail()+"|"+cust.getPhone()+str);
        }
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------|");
    }
}
