import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Jimmy Bloggs", "ZX867886", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jimmy Bloggs",developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("ZX867886", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary(), 0.0);
    }
}
