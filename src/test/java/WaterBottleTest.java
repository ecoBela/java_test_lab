import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;
    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void take10FromVolume(){
        assertEquals(90, waterbottle.haveDrink());
    }

    @Test
    public void emptyTheBottle(){
        assertEquals(0, waterbottle.emptyTheBottle());
    }

    @Test
    public void fillTheBottle(){
        assertEquals(100, waterbottle.fillTheBottle());
    }

}
