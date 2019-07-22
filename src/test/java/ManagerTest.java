import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Mr Mephisto", "ZX56784677", 30000, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Mr Mephisto", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("ZX56784677",manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDept(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(3000.00);
        assertEquals(33000, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalaryOnlyIfPositive(){
        manager.raiseSalary((-3000.00));
        assertEquals(30000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300,manager.payBonus(), 0.0);
    }

    @Test
    public void checkNameChange(){
        manager.changeName("Big Neil");
        assertEquals("Big Neil", manager.getName());
    }

    @Test
    public void checkNameChangeWhenNullEntered(){
        manager.changeName("");
        assertEquals("Mr Mephisto", manager.getName());
    }

}
