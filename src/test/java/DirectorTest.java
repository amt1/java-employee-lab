import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director =  new Director("Melinda", "DG124579H", 200000, "Executive", 9999999);

    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DG124579H", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200000, director.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void canRaiseSalaryDouble(){
        director.raiseSalary(director.payBonus());
        assertEquals(204000, director.getSalary(), 0.1);

    }

    @Test
    public void hasBudget(){
        assertEquals(9999999, director.getBudget(), 0.01);
    }
}
