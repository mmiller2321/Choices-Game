// CSE 143, Winter 2010, Marty Stepp
// Homework 4: Assassin
//
// Instructor-provided support class.  You should not modify this code!

/** Each AssassinNode object represents a single node in a linked list
    for a game of Assassin. */
    
import java.io.*;

public class AssassinNode {
   public String name;        // this person's name
   public String killer;      // name of who killed this person (null if alive)
   public AssassinNode next;  // next node in the list (null if none)
   
   /** Constructs a new node to store the given name and no next node. */
   public AssassinNode(String name) {
      this(name, null);
   }

   /** Constructs a new node to store the given name and a reference
       to the given next node. */
   public AssassinNode(String name, AssassinNode next) {
      this.name = name;
      this.killer = null;
      this.next = next;
      constructorCount++;
   }
   
   
   // code below this point is for CSE 143 grading script use only
   private static int constructorCount = 0;
   
   public static void resetCount() {
      constructorCount = 0;
   }

   public static int getCount() {
      return constructorCount;
   }
}

