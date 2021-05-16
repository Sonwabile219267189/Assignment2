package za.ac.cput.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsSectionTest {

    @Test
    public void testAdd()
    {
        CollectionsSection garage = new CollectionsSection();
        garage.add("BMW");
        assertEquals("BMW", garage.toString() );
    }

    @Test
    public void testRemove()
    {
        CollectionsSection garage = new CollectionsSection();
        garage.add("BMW");
        garage.add("Ford");
        garage.remove("Ford");
        Object answer = garage.find("Ford");
        assertEquals("Does not exist",answer);
    }

    @Test
    public void testFind()
    {

        CollectionsSection garage = new CollectionsSection();
        garage.add("BMW");
        garage.add("Ford");
        garage.add("Nissan");

        Object answer = garage.find("Nissan");
        assertEquals("Does not exist",answer);
    }

}