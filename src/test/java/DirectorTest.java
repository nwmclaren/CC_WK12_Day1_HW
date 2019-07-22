import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setup(){
        director = new Director("Arthur Hughes","UG56765",250000,"Group",200000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Arthur Hughes", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("UG56765", director.getNiNumber());
    }

    @Test
    public void canGetBonus(){
        assertEquals(5000, director.payBonus(), 0.0);
    }

    @Test
    public void canGetRaise(){
        director.raiseSalary(10000.00);
        assertEquals(260000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBudget(){

        assertEquals(200000, director.getBudget(), 0.0);

    }

}
