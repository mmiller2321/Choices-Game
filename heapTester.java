/*Whatcom Community College - Winter 2019
 CS240 Data Structures and Algorithm Analysis
 Professor Ryan Parsons
 AUTHORS: Adib Thaqif, Andrew Jacobi, Donald Strong, and Micah Miller
 Heap tester
 
 */
import java.io.*;
import java.util.*;


public class heapTester{
   //public EventHashTable
 
   public static void main(String[] args){
      int maxSize = 20;
      IntHeap heap = new IntHeap(maxSize);
   
      heap.insert(9);
      heap.insert(4);
      heap.insert(3);
      heap.insert(6);
      heap.insert(1);
      heap.insert(12);
      heap.insert(7);
      heap.insert(8);
      heap.insert(15);
      heap.insert(5);
      heap.insert(11);
      heap.insert(22);
      //heap.deleteMin();
      //heap.deleteMin();
      System.out.println(heap);
      
   }
   public static int sum(int x, int y){
      return x + y;
   }
   
   
}