/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.bank_of_suburbs.Account;
import com.itexps.bank_of_suburbs.AccountType;
import com.itexps.bank_of_suburbs.Bank;
import com.itexps.bank_of_suburbs.Customer;
import com.itexps.bank_of_suburbs.CustomerType;
import com.itexps.bank_of_suburbs.Employee;
import com.itexps.bank_of_suburbs.EmployeeType;
import com.itexps.bank_of_suburbs.FullTimeEmployee;
import com.itexps.bank_of_suburbs.PartTimeEmployee;
import com.itexps.bank_of_suburbs.Transaction;
import com.itexps.bank_of_suburbs.TransactionType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author patel
 */
public class BankTest {
    Bank bank;
    public BankTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        ArrayList<Employee> employees = new ArrayList <Employee>();
        
        Employee e1 = new FullTimeEmployee(70000, 10, "Max", "Jonas", "max@123.com", "1237896060", "N North Ave" , EmployeeType.FullTimeEmployee);
        Employee e2 = new PartTimeEmployee(35, 35,11, "John", "Brown", "john@123.com", "3337896060", "N Plum Ave" , EmployeeType.PartTimeEmployee);
        employees.add(e1);
        employees.add(e2);
        
        ArrayList<Customer> customers = new ArrayList <Customer>();
        ArrayList<Account> accounts = new ArrayList <Account>();
        ArrayList<Transaction> transactions = new ArrayList <Transaction>();
        
        Transaction t1 = new Transaction("t11", TransactionType.Credit, 1000, LocalDateTime.now());
        Transaction t2 = new Transaction("t12", TransactionType.Debit, 2000, LocalDateTime.now());
        
        transactions.add(t1);
        transactions.add(t2);
         
        Account a1 = new Account("a11", AccountType.Checking, 7000, transactions);
        Account a2 = new Account("a12", AccountType.Saving, 5000, transactions);
        
        accounts.add(a1);
        accounts.add(a2);
        
        Customer c1 = new Customer("c01", "Robin", "Wood", "robin@123.com", "3344556677", "robinwood", "robin123", CustomerType.Individual, accounts);
        customers.add(c1);
        
        bank = new Bank("B001", "Chase", "78689098080", "N Pine St", employees, customers);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
    @Test
    public void BankTest() {
        assertEquals(bank.getName(),"Chase");
        assertEquals(bank.getId(), "B001");
        assertEquals(bank.getAddress(), "N Pine St");
        assertEquals(bank.getEmployees().size(), 2 );
        assertEquals(bank.getCustomers().size(), 1);
        assertEquals(bank.getCustomers().get(0).getFirstname(), "Robin");
        assertEquals(bank.getEmployees().get(0).getFirstname(), "Max");
        assertEquals(bank.getEmployees().get(1).getFirstname(), "John");
        assertEquals(bank.getEmployees().get(1).getEmail(), "john@123.com");
        assertEquals(bank.getEmployees().get(1).getEid(),11);
        assertEquals(bank.getEmployees().get(0).getEmail(), "max@123.com");
        assertEquals(bank.getEmployees().get(0).getEmpType(), EmployeeType.FullTimeEmployee);
        assertEquals(bank.getEmployees().get(1).getEmpType(), EmployeeType.PartTimeEmployee );
        assertEquals(bank.getCustomers().get(0).getCustType(), CustomerType.Individual);
        assertEquals(bank.getEmployees().get(0).getEid(), 10);
        assertEquals(bank.getCustomers().get(0).getId(), "c01");
        assertEquals(bank.getCustomers().get(0).getFirstname(), "Robin");
        assertEquals(bank.getCustomers().get(0).getEmail(), "robin@123.com");
        assertEquals(bank.getCustomers().get(0).getAccounts().get(0).getAccType(), AccountType.Checking);
        assertEquals(bank.getCustomers().get(0).getAccounts().get(0).getTransactions().get(0).getTransactionType(), TransactionType.Credit);
        assertEquals(bank.getCustomers().get(0).getAccounts().get(1).getId(), "a12");
        assertEquals(bank.getCustomers().get(0).getAccounts().get(1).getAccType(), AccountType.Saving);
        assertEquals(bank.getCustomers().get(0).getAccounts().get(0).getTransactions().get(0).getTid(), "t11");
    }
    

}
