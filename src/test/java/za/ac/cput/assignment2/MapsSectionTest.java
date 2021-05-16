package za.ac.cput.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class MapsSectionTest {



    @Test
    public void testAdd()
    {
        MapsSection mp1 = new MapsSection();

        mp1.add("CarFactory1","Toyota");


        assertEquals("Toyota",mp1.toString());

    }

    @Test
    public void testRemove()
    {
        MapsSection mp1 = new MapsSection();
        mp1.add("CarFactory1","Toyota");
        mp1.add("CarFactory2","Honda");

        mp1.remove("CarFactory1", "Toyota");
        Object answer = mp1.find("CarFactory1","Toyota");
        assertEquals("Does not exist",answer);

    }

    @Test
    public void testFind()
    {
        MapsSection mp1 = new MapsSection();
        mp1.add("CarFactory1","Toyota");
        mp1.add("CarFactory2","Honda");
        Object answer = mp1.find("CarFactory1","Toyota");
        assertEquals("Toyota",answer);

    }
}