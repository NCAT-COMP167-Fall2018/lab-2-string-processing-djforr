
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author djforrest
 */
public class Lab2 {
  static String[]records;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        records= new String[100]; 
        try{
       Scanner reader= new Scanner(new File(args[0]));
       
       while(reader.hasNext()){
       String[] line= reader.nextLine().split(",");
       String firstName= line[0];
       String lastName= line[1];
       String gender= line[2];
       String age= line[3];
       String phoneNumber= line[4];
       String email= line[5];
           int currentIndex = 0;
       
      
         records[currentIndex]= String.format("");
       currentIndex++;
      
       String output = String.format("%-20s%-20s%-10s%10d", "William", "Bryant", "Male", 22);
       String output2 = String.format("%-20s%-20s%-10s%10d",firstName,lastName, gender, age, phoneNumber,email );
       System.out.println(output);
       System.out.println(output2);
       }
       
    }catch(FileNotFoundException ex){
        System.err.println("Failed to read input file");
    }
       
    }
    
}
