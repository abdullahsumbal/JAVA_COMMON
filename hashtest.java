import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class hashtest {

   @Test
   public void remove_data() {
        hashmap h = new hashmap();


        h.put(1,100);
        assertEquals(h.get(1),100);
        h.put(11,200);
        assertEquals(h.get(11),200);

        h.put(4,300);
        assertEquals(h.get(1),200);
   }


}