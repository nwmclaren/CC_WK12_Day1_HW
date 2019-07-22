import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dataBaseAdmin;

    @Before
    public void setup(){
        dataBaseAdmin = new DatabaseAdmin("Steve O'Hagan", "HD657665", 35000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve O'Hagan", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("HD657665",dataBaseAdmin.getNiNumber());
    }


    @Test
    public void canGetSalary(){
        assertEquals(35000, dataBaseAdmin.getSalary(), 0.0);
    }
}
