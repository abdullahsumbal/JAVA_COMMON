import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class stacktest {

   @Test
   public void remove_data() {
        stack s = new stack();
        s.push(4);
        assertEquals(s.getMax(),4);
        assertEquals(s.getMin(),4);

        s.push(6);
        assertEquals(s.getMax(),6);
        assertEquals(s.getMin(),4);

        s.push(2);
        assertEquals(s.getMax(),6);
        assertEquals(s.getMin(),2);

        s.pop();
        assertEquals(s.getMax(),6);
        assertEquals(s.getMin(),4);

        s.push(65);
        assertEquals(s.getMax(),65);
        assertEquals(s.getMin(),4);

   }


}