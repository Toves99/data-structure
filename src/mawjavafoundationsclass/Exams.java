/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mawjavafoundationsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author HP
 */
   public class Exams {
   
       
    final static int  examNumber=3;
    final static int termNumber = 2;
    final static String examCode = "CS308";
     
     public Exams(){
          
     }
   
public  static String calculateGrade(int score){
        String [] grades = {"A", "A-", "B+","B"};
         
        String [] grades2 = new String [4];
        
        grades2[0]="A"; grades2[1]="A-"; grades2[2]="B+"; grades2[3]="B";
       
        System.out.println("Element at position 3:"+ grades[2]);
        
        String AGrade = "A"; String AMinusGrade="A-";
        
        String studentGrade = "";
        
           if(score>=80){
                studentGrade = grades[0];
           }
           else if(score>=70){
               
                 studentGrade = grades[1];
           }
           else if (score>=60){
                studentGrade = grades[2];
           }
           else if(score>=50){
                studentGrade = grades[3];
           }
           else {
              studentGrade = "E"; 
           }
        
        return studentGrade;  
    }


   public  static String calculateGradeWithSwitch(int score){
        String [] grades = {"A", "A-", "B+","B"};
         
        String [] grades2 = new String [4];
        
        grades2[0]="A"; grades2[1]="A-"; grades2[2]="B+"; grades2[3]="B";
       
        System.out.println("Element at position 3:"+ grades[2]);
        
        String AGrade = "A"; String AMinusGrade="A-";
        
        String studentGrade = "";
        
        switch (score){
            case 80:
             studentGrade = grades[0];  
            break;
            case 70:
            studentGrade = grades[1];
            break;
            case 60:
            studentGrade = grades[2];
            break;
            default:
            studentGrade = "E"; 
        }
        return studentGrade;  
    }



   public  static void getStudentMarks(int n, int mathScore, int chemScore, int phyScore){
         int []studentMarksArray = new int [3];
      //int [] studentMarksArray = {mathScore, chemScore, phyScore};
             
        String pinString = "12356";
          String pinString2 = "123xZ";
    
           int pinNumber = Integer.parseInt(pinString);
               pinNumber  = Integer.valueOf(pinString);
           System.out.println("PIN Number of first PIN string after conversion:"+ pinNumber);
          
             try{
                 pinNumber = Integer.valueOf(pinString2); 
                // pinNumber = Integer.parseInt(pinString2);
                 System.out.println("PIN Number of first PIN string after conversion:"+ pinNumber);
      
              for (int k=0; k<=n; k++){   
                 studentMarksArray[k] = mathScore;  studentMarksArray[1]=chemScore;
                studentMarksArray[2] = phyScore;
                System.out.println(Arrays.toString(studentMarksArray));
                }
               }
               
               catch (NumberFormatException e){
                    System.out.println("Invalid PIN Number. Ensure PIN has numerical values between 0 and 9 only "+studentMarksArray.length);
                    e.printStackTrace();
               }
               catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("We are sorry. Student marks cannot exceed"+studentMarksArray.length);
                    e.printStackTrace();
               }
               catch(Exception ex){
                   System.out.println("We are sorry. We are currently experiencing system isssues. Please try later or contact us on");
                   ex.printStackTrace();
                   
               }
       
    }

   public  static HashMap<String,Double> getStudentMarksHashMap( double mathScore, double chemScore, double phyScore){
         int []studentMarksArray = new int [3];
          HashMap<String,Double> studentSubjectNamesAndScores = new HashMap<String,Double>();
          studentSubjectNamesAndScores.put("MATH", mathScore);
          studentSubjectNamesAndScores.put("CHEM", chemScore);
          studentSubjectNamesAndScores.put("PHY", phyScore);
          //studentSubjectNamesAndScores.put("NUM_OF_TESTS",n);
          
          return studentSubjectNamesAndScores;
        
    }
   
   
   public static  void workWithVectors(){
       int x;
       Vector  genericVector=new Vector();
       Vector <String> stringVec=new Vector<String>();
       Vector<Double> doubleVec=new Vector<Double>();
       Vector<Integer> intVec=new Vector<Integer>();
       
       Vector <Object> objectVec =new Vector<Object>();
       
       //add generic element to generic vector
       genericVector.add(1); genericVector.add("Clinton");
       System.out.println("generaic Vector"+genericVector);
       
       //add string element to string vector
       stringVec.add("1"); stringVec.add("Clinton");
       System.out.println("string Vector"+stringVec);
       
       //add double element to double vector
       doubleVec.add(2.0); doubleVec.add(100.0);
       System.out.println("string Vector"+stringVec);
       
       //add int element to int vector
       intVec.add(2); intVec.add(100);
       System.out.println("integer Vector"+intVec);
       //getting an element from a vector at a particular index
       double  secondVectorElement=doubleVec.get(1);
       System.out.print("vector element at position 2 is"+secondVectorElement);
       
       
       
       
   }
   
   
   public static  void workWithLists(){
       ArrayList arrayList=new ArrayList();
       ArrayList arrayList2=new ArrayList();
       List list=new ArrayList();
       
       arrayList.add(100); arrayList.add(70); arrayList.add(100);
       arrayList2.add(80); arrayList2.add(90); arrayList2.add(50);
       
       list.add(arrayList);list.add(arrayList2);
       System.out.println("Matrix"+list);
       
       List list1=new Vector();
       Vector vec=new Vector();
       Vector vec2=new Vector();
       Vector vec3=new Vector();
       vec.add(100);vec.add(200);vec.add(300);vec.add(400);
       vec2.add(600);vec2.add(700);vec2.add(800);vec2.add(900);
       vec3.add(1000);vec3.add(2000);vec3.add(3000);vec3.add(4000);
       
       list1.add(vec);
       list1.add(vec2);
       list1.add(vec3);
       System.out.println("Matrix"+list1);
         
   }
   
   //example of method overloading
   //the method getSum is said to be method overloading because
   //@1 it has has differnt numbers of input parameters
   //@2 it has 
   public static int getSum(int x,int y){
       return x+y;
       
   }
   public static int getSum(int x,int y,int z){
       return x+y+z;
       
   }
   public static int getSum(int x,int y,int z,int b){
       return x+y+z+b;
       
   }
public static void main (String[] args){
    //get the sum of two numbers
    System.out.println("sum is"+getSum(100+200));
    System.out.println("sum is"+getSum(100+200+300));
    workWithVectors();
    workWithLists();
    System.exit(1);
    
    
    
           Exams exams  = new Exams();
           // Exams exams2  = new Exams();
           System.out.println("Exam No:"+ Exams.examNumber);
           System.out.println("Exam Code:"+ Exams.examCode);
           System.out.println("Term No:"+ Exams.termNumber);
           System.out.println("===================================================================");

           int score  = 30;
           String grade  =  Exams.calculateGradeWithSwitch(score); //calling the method
           
           Exams.getStudentMarks(3, 80, 80, 60);
           System.out.println("Student Grade="+ grade);
           HashMap <String, Double> subjectNamesAndScores  = Exams.getStudentMarksHashMap(85.6, 80.0, 60);
           HashMap <String, Double> subjectNamesAndScoresTest2  = Exams.getStudentMarksHashMap(70, 40.0, 90);
           HashMap <String, HashMap<String,Double>> testScores  = new HashMap <String, HashMap<String,Double>> ();
           testScores.put("Test01",subjectNamesAndScores );
           testScores.put("Test02",subjectNamesAndScoresTest2);
           
           System.out.println(subjectNamesAndScores );//simple hashmaps
           System.out.println("Test Scores Map"+testScores);//complex hashmaps
           // how do we loop through a hashmap and for each key in the hashmap, print the name of the key and the value associated with that key
               for (String key :subjectNamesAndScores.keySet()){
                    double subjectScore = subjectNamesAndScores.get(key);
                    System.out.println("key="+key + ",value="+subjectScore);
               }
               
               System.out.println("==============================================================");
               
               for (String key:testScores.keySet()){
                    HashMap<String, Double> innerMap =  testScores.get(key);
                    System.out.println("ExamTestId="+key);
                    for(String innerKey:innerMap.keySet()){
                     double subjectScore = innerMap.get(innerKey);
                    System.out.println("subjectcode="+innerKey + ",subjectvalue="+subjectScore);  
                    }
                   
               }
    }
}
