import java.util.*;

public class EventNode {

   private Event data; 
   private EventNode life;
   private EventNode work; 
   private EventNode school;
   private EventNode parent;

   public EventNode(Event data, EventNode life, EventNode work, EventNode school,EventNode parent) {
      this.data = data;
      this.parent = parent;
      this.life = life;
      this.work = work;
      this.school = school;
   }
   //constructor for all child nodes
   public EventNode(Event data, EventNode parent){
      this(data,null,null,null,parent);
   }
   
   //overallRoot constructor
   public EventNode(Event data){
      this(data,null,null,null,null);
   
   }



}