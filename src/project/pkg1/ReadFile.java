/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin-vk0018
 */
public class ReadFile {
    
    private static ArrayList<String> customer_names = new ArrayList<String>();
    private static ArrayList<String> customer_transactions = new ArrayList<String>();
    private static ArrayList<Integer> customer_transactions_integer = new ArrayList<Integer>();
    private Scanner x;

    public void openFile(){
        
        java.io.File file = new java.io.File("test.txt");

        try{
            x = new Scanner(file);
        }
        catch (Exception e){
            System.out.println("could not find the file");
        }

    }

    public void readFile(){
        while(x.hasNext()){
            customer_transactions.add( x.next());
            customer_names.add(x.nextLine());
        }

        int size = customer_transactions.size();
        for(int i = 0; i<= size -1; i++){

            int result = Integer.parseInt(customer_transactions.get(i));

            customer_transactions_integer.add(result);
        }


    }


    public void closeFile(){
        x.close();
    }

    public ArrayList<String> getCustomer_names(){

        return customer_names;
    }
    public ArrayList<Integer> getCustomer_transactions_integer(){

        return customer_transactions_integer;
    }
    
}
