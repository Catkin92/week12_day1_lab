import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Catrin", "J63874V", 60000.00, "General");
    }

    @Test
    public void canGetName() {
        assertEquals("Catrin", manager.getName());
    }
}
