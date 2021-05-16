package za.ac.cput.assignment2;
git 
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListSectionTest {

    @Test
    public void testAdd()
    {
        ListSection carlist = new ListSection();
        carlist.add(0,"Toyota");

        assertEquals("Toyota",carlist.equals(0));
    }


    @Test
    public void testRemove()
    {
        ListSection carlist = new ListSection();
        carlist.add(0,"Toyota");
        carlist.add(1,"BMW");
        carlist.add(2,"Honda");

        carlist.remove(1);
    }

    @Test
    public void testFind()
    {
        ListSection carlist = new ListSection();
        carlist.add(0,"Toyota");
        carlist.add(1,"BMW");
        carlist.add(2,"Honda");

        Object answer = carlist.find(0);
        assertEquals(0,answer);
    }

}