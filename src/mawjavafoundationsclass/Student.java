/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mawjavafoundationsclass;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author HP
 */
// class qualifiers
// class - mandatory
// public, private, and protected - these the three alternative keywords you can put before the word "class"
// These keywords indicate the visibility of the class and its properties (variables + methods);
// public class - then the class is visible to other classes.  Its properties may or may not be visible
//
public class Student {
    
         //data types
         //data type indicates whether a variable in a program is a number, integer, decimal, text (string),
         // floating point number, is a complex structure and if it is, is it  list, a map, an array, vector, a linked list, 
         // hashtable etc
         // 
    
      // Data types in Java
         // Simple or Primitive Data Types   - they store a single value - single value variables
      //  int  - Integer - it is a whole number
      //  float or double  - the number is a decimal
      //  String   - alphanumeric variable
      // COMPLEX java data types - they store a collection of values - either of same or differentdata types
        // An array  ->  String [] studentnames; int [] studentMarks, float [] temperatureReadings;
    
       int x = 60;
       int y =50;
       double temperature =20;
       double payment = 700 ;
       
       static String [] studentNames; 
       static int  [] studentMarks   = {80, 80, 91};
        
      static String [] productNames = {"Omo","Geisha", "mengai","sunlight"};
           
        //arguments of a method = the input variables and their types to the methods 
    /**
     * @param args the command line arguments
     */
        
   public static void printArray(String [] array){
             for(String s: array){
                 System.out.println(s);   
             }
            
   }
   
  public static void printArrayOfNumbers(int [] array){
             for(int s: array){
                 System.out.println(s);   
             }
            
   }
    
   public static void printArrayGeneric(Object [] array){
             for(Object s: array){
                 System.out.println(s);   
             }
            
   }

  
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the first Java Programming Class");
        //instantiation of an object = specifying a particular member of a given kind. 
        Student douglas = new Student();
        
        Student davis = new Student();
        douglas.temperature =19.0;
       
        Object [] studentNames = {"Douglas","Davis", "Clinton"};
       
        ArrayList studentNamesArray  = new ArrayList();
       
        studentNamesArray.add("Douglas");
        studentNamesArray.add("Davis");
        studentNamesArray.add("Clinton");
        studentNamesArray.add(1,"Abiud");
        //studentNamesArray.remove("Clinton");
        
        System.out.println(studentNamesArray.get(1));
        
        System.out.println("=================================");
        
         //HashMap<Integer,String> studentIndexAndNames = new HashMap <Integer,String>();
              HashMap studentIndexAndNames = new HashMap ();
         
        studentIndexAndNames.put(10000, "Douglas");
        studentIndexAndNames.put(10002, "Davis");
        studentIndexAndNames.put(10020, "Clinton");
        studentIndexAndNames.put(100021, "Abiud");
        
        System.out.println("studentIndexAndNames=>"+ studentIndexAndNames);
        
       System.out.println(studentIndexAndNames.get(10002));
 
        
        System.out.println("Student Names Stored in an ArrayList"+studentNamesArray);
       
       System.out.println("=================================");
      
       Object  [] numbers  = {0,1,2,3,4,"orange"};
       studentNames[0] ="Douglas";
       studentNames[1] ="Davis";
       studentNames[2] ="Clinton";
           //studentTwo.temperature =18.0;
       
         System.out.println("=========================================================");
       
             printArrayGeneric(numbers);
             printArrayGeneric(studentNames);
            // printArray(productNames);
             //printArray(studentMarks);
    }
    
}
