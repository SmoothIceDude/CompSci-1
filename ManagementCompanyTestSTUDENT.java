import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {

    ManagementCompany studentTests;

    @Before
    public void setUp() throws Exception {
        //student create a management company

        //student add three properties, with plots, to mgmt co
        studentTests = new ManagementCompany("Surfer", "12345", 9);

        studentTests.addProperty("Hello world", "Montgomery Village", 20886, "Malcolm Albright");
        studentTests.addProperty("Sunshine Mountains", "Gaithersburg", 20879, "Sam Watkins");
        studentTests.addProperty("Sunny Hills", "Germantown", 20887, "Gary Sikes");

    }

    @After
    public void tearDown() {
        //student set mgmt co to null
        studentTests = null;
    }

    @Test
    public void testAddPropertyDefaultPlot() {
        //student should add property with 4 args & default plot (0,0,1,1)
        //student should add property with 8 args
        //student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1

        assertEquals(studentTests.addProperty("Hello world", "Montgomery Village", 20886, "Malcolm Albright"), 3, 0);
        assertEquals(studentTests.addProperty("Sunshine Mountains", "Gaithersburg", 20879, "Sam Watkins", 7, 8, 4, 3), 4, 0);
        assertEquals(studentTests.addProperty("Sunny Hills", "Germantown", 20887, "Gary Sikes", 3,4,6,8), -1, 0);
    }
 
    @Test
    public void testMaxRentProp() {
       double message = studentTests.maxRentProp();

       assertTrue(message);
        //student should test if maxRentProp contains the maximum rent of properties

    }

    @Test
    public void testTotalRent() {
        assertEquals(studentTests.totalRent(), 2000, 0);
        //student should test if totalRent returns the total rent of properties
    }

 }
