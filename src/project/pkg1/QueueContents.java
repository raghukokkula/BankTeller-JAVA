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

import java.util.ArrayList;

public class QueueContents {
    
    private static ArrayList<String> customer_names = new ArrayList<String>();
    private static ArrayList<Integer> customer_transactions = new ArrayList<Integer>();
    private static ArrayList<String> queue_names = new ArrayList<String>();
    private static ArrayList<Integer> queue_transactions = new ArrayList<Integer>();



    public void buildQueue(){

        ReadFile rf = new ReadFile();
        rf.openFile();
        rf.readFile();
        rf.closeFile();



        customer_names = rf.getCustomer_names();
        customer_transactions = rf.getCustomer_transactions_integer();


        System.out.println("This is printing "+customer_names);

        System.out.println("These are customer transactions "+customer_transactions);

        int size = customer_names.size();

        System.out.println("\nQueue Contents: ");

        for (int i = 0; i<= size-1;i++){

            if (customer_transactions.get(i) == 0){
                System.out.printf("The customer %s has 0 transactions, so he will not be added to the queue.",customer_names.get(i));

            }

            else{

                queue_names.add(customer_names.get(i));
                queue_transactions.add(customer_transactions.get(i));
            }
        }
        int size1 = queue_names.size();

        for (int i = 0;i<=size1 -1; i++){
            System.out.printf("\nCustomer %s with %s transactions enters the bank",queue_names.get(i),queue_transactions.get(i));
        }

//        System.out.println(queue_names);
//        System.out.println(queue_transactions);
    }

    public void currentCustomer(){

        int size = queue_names.size();

//        for (int i=0; i<= size -1;i++){
        while(size>0){
            System.out.printf("\nCustomer %s with %s transactions is now the current customer handled by the teller.",queue_names.get(0),queue_transactions.get(0));
            int transactions = queue_transactions.get(0);
            while(transactions>0){
                System.out.printf("\nCurrent customer %s now has %s transactions remaining.",queue_names.get(0),transactions);
                transactions -=1;
            }
            if(transactions == 0){
                System.out.printf("\nCurrent Customer %s has completed all his/her transactions and has exited the bank.", queue_names.get(0));
                queue_names.remove(0);
                queue_transactions.remove(0);
                System.out.println("\nThe updated queue contents are: ");
                System.out.println("Customer Names: "+queue_names);
                System.out.println("Customer Transactions: "+queue_transactions);

            }

            size = size-1;

        }

    }

    public Integer sumTransactions(){

        int i;
        int sum_transactions = 0;
        for(i = 0; i < queue_transactions.size(); i++)
            sum_transactions += queue_transactions.get(i);
        return sum_transactions;
    }

    public Integer sumCustomers(){
        return queue_names.size();
    }
    
}
