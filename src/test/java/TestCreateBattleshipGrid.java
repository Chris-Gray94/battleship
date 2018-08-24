import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;

public class TestCreateBattleshipGrid {


    @Test
    public void testCreateBattleshipComponentIsNotNull(){

        Component battleshipComponentt = new Component() {
            @Override
            public Point getLocation() {
                return super.getLocation();
            }
        };
        assertNotNull(battleshipComponentt);
    }

    @Test
    public void testCreateDestroyerComponentIsNotNull(){

        Component destroyerComponent = new Component() {
            @Override
            public Point getLocation() {
                return super.getLocation();
            }
        };
        assertNotNull(destroyerComponent);
    }

}
