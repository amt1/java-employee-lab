import org.junit.Before;
import staff.techStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class DeveloperTest {

        Developer developer;

        @Before
        public void before(){
            developer =  new Developer("Melinda", "DG124579H", 1000000);

        }

        @Test
        public void canGetName(){
            assertEquals("Melinda", developer.getName());
        }

        @Test
        public void canGetNINumber(){
            assertEquals("DG124579H", developer.getNiNumber());
        }

        @Test
        public void canGetSalary(){
            assertEquals(1000000, developer.getSalary(), 0.1);
        }


        @Test
        public void canRaiseSalary(){
            developer.raiseSalary(developer.payBonus());
            assertEquals(1010000, developer.getSalary(), 0.1);

        }
    }


