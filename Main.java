/*Whatcom Community College - Winter 2019
CS240 Data Structures and Algorithm Analysis
Professor Ryan Parsons
AUTHORS: Adib Thaqif, Andrew Jacobi, Donald Strong, and Micah Miller*/
//Worked on code for save and change value based off answer

import java.util.Scanner;
import java.util.*;
import java.awt.*;
import java.io.*;

public class Main{

   private static int year=1;
   private static int round=1;
   private static int eventCounter = 1;
   private static Event event;
   private static int maxSize = 96;
   private static EventHashTable table = new EventHashTable(maxSize + 1);
   private static EventHeap heap = new EventHeap(96);
   private static int aspectValue[] = new int[3];
	
   public static void main(String[]args){
   int school = aspectValue[0];
   int work = aspectValue[1];
   int life = aspectValue[2];
   ArrayList<Event> Graveyard = new ArrayList<Event>();

	}
   public static void play(String answer,int n, Event event){
   
   }
   
   public static void changeAspect(String answer, Event event){
      if(answer.equals("y")){
      //apply the aspect value to the aspect
         if(event.aspect == "school"){
         //apply to school
            school += event.reward;
         }else if(event.aspect == "work"){
          //apply to work
            work += event.reward;
         }else if(event.aspect == "life"){
          //apply to life
            life += event.reward;
         }
      }else if(answer.equals("n")){
         if(event.aspect == "school"){
         //apply to school
            school += event.punishment;
         }else if(event.aspect == "work"){
          //apply to work
            work += event.punishment;
         }else if(event.aspect == "life"){
          //apply to life
            life += event.punishment;
         }
         if(school < 25 || work < 25 || life < 25){
            //game is over
         }
      }
      Graveyard.add(event);
   }
       
   public static void quit(){
      System.out.println("Thank you for playing. See you next time!");
        
   }
    
   public static void viewHighScore(){
   
   	
   }
   
   public static void viewGraveyard(){
      for(int i = 0; i < Graveyard.size(); i++){
         System.out.println(Graveyard.get(i));
      }
   }
   
   //saves the heap to an output file
   public static void save(PrintStream output){
      int i = 0;
      while(!heap.isEmpty()){
         //output.println(heap[i]);
         i++;
      } 
      System.out.println("Your game is saved!");
   }
  
	
}