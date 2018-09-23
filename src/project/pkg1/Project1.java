/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author admin-vk0018
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueContents qc = new QueueContents();

        qc.buildQueue();
        int total_transactions = qc.sumTransactions();
        int total_customers = qc.sumCustomers();
        int average = total_transactions/total_customers;
        qc.currentCustomer();



        System.out.println("Total number of transactions are: "+total_transactions);
        System.out.println("Total number of customers are: "+total_customers);
        System.out.println("Average number of transactions per customer are: "+average);
        
        
    }
    
}
