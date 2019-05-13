import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager =  new Manager("Melinda", "DG124579H", 200000, "Executive");

    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DG124579H", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Executive", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(manager.payBonus());
        assertEquals(202000, manager.getSalary(), 0.1);

    }
}
