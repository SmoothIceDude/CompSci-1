import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GradebookTester {

      private GradeBook g1;

      @Before

      public void setUp() {

            g1 = new GradeBook(5);

            g1.addScore(40);

            g1.addScore(35);

            g1.addScore(100);

            g1.addScore(90);

      }

      @After

      public void tearDown() {

            g1 = null;
      }

      @Test

      public void testAddScore() {

          
            g1 = new GradeBook(3);

           
            assertEquals(0, g1.getScoreSize());

            assertEquals(0, g1.sum(), 0.0001);

            
            g1.addScore(99);

          
            assertEquals(1, g1.getScoreSize());

            assertEquals(99, g1.sum(), 0.0001);

            g1.addScore(25);

            assertEquals(2, g1.getScoreSize());

            assertEquals(99 + 25, g1.sum(), 0.0001);



            g1.addScore(77);

            assertEquals(3, g1.getScoreSize());

            assertEquals(99 + 25 + 77, g1.sum(), 0.0001);

            assertFalse(g1.addScore(87));

            assertEquals(3, g1.getScoreSize());

            assertEquals(99 + 25 + 77, g1.sum(), 0.0001);

      }

      @Test

      public void testSum() {

            assertEquals(50 + 75 + 100 + 90, g1.sum(), 0.0001);

            g1.addScore(55);

            assertEquals(50 + 75 + 100 + 90 + 55, g1.sum(), 0.0001);
      }

      @Test

      public void testMinimum() {

            assertEquals(50, g1.minimum(), 0.0001);

            g1.addScore(22);

            assertEquals(22, g1.minimum(), 0.0001);

      }

      @Test

      public void testFinalScore() {

     
            assertEquals(75 + 100 + 90, g1.finalScore(), 0.0001);

            g1.addScore(22);
            
            assertEquals(50 + 75 + 100 + 90, g1.finalScore(), 0.0001);

            g1 = new GradeBook(2);
       
            assertEquals(0, g1.finalScore(), 0.0001);

      }

      @Test

      public void testGetScoreSize() {

            assertEquals(4, g1.getScoreSize());

            g1.addScore(22);

            assertEquals(5, g1.getScoreSize());

            g1.addScore(76);

            assertEquals(5, g1.getScoreSize());

      }

      @Test

      public void testToString() {

            assertTrue(g1.toString().equals("50.0 75.0 100.0 90.0"));

            g1.addScore(22);

            assertTrue(g1.toString().equals("50.0 75.0 100.0 90.0 22.0"));

            g1.addScore(80);

            assertTrue(g1.toString().equals("50.0 75.0 100.0 90.0 22.0"));

      }

}