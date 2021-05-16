package za.ac.cput.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetsSectionTest {

    SetsSection set1 = new SetsSection();

    @Test
    public void testAdd()
    {
        SetsSection carSet = new SetsSection();
        carSet.add("Mitsibishi");
    }


    @Test
    public void testRemove()
    {
        SetsSection carSet = new SetsSection();
        carSet.add("Mitsibishi");
        carSet.add("Toyota");
        carSet.remove("Mitshibishi");

        Object answer = carSet.find("Mitsibishi");
        assertEquals("Does not Exist",answer);

    }

    @Test
    public void testFind()
    {
        SetsSection carSet = new SetsSection();
        carSet.add("Mitsibishi");
        carSet.add("Honda");
        carSet.add("Toyota");

        Object answer = carSet.find("Honda");
        assertEquals("Honda",answer);
    }


}