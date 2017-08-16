import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class listtest {

   @Test
   public void remove_data() {
        list l = new list();
 
        l.add("fds");
        l.add(34);
        l.add(3234);
        l.add("hello");
        l.remove();
      assertEquals(l.getSize(),3);
   }

      @Test
   public void add_data() {
        list l = new list();
 
        l.add("fds");
        l.add(34);
        l.add(3234);
        l.add("hello");
      assertEquals(l.getSize(),4);
   }

         @Test
   public void isempty() {
        list l = new list();
 
        l.add("fds");
        l.add(34);
        l.add(3234);
        l.add("hello");
      assertEquals(l.isempty(),false);

      	l.remove();
      	l.remove();
      	l.remove();
      	l.remove();
      	l.remove();
      	assertEquals(l.isempty(),true);
      	assertEquals(l.getSize(),0);
   }
}