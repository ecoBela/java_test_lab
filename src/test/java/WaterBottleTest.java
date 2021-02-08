import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;
    @Before
    public void before(){
        waterbottle = new WaterBottle(50);
    }

    @Test
    public void hasVolume(){
        assertEquals(50, waterbottle.getVolume());
    }

    @Test
    public void take10FromVolume(){
        assertEquals(40, waterbottle.haveDrink());
    }

}
