import org.junit.Before;
import staff.techStaff.DatabaseAdmin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin =  new DatabaseAdmin("Melinda", "DG124579H", 1000000);

    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DG124579H", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1000000, databaseAdmin.getSalary(), 0.1);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(databaseAdmin.payBonus());
        assertEquals(1010000, databaseAdmin.getSalary(), 0.1);

    }
}


