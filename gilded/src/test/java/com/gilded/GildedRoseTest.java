package com.gilded;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void sellInNegativeAndQualityDecrease() {

        Item[] items = new Item[] { new Item("fixme", -20, 15) };
        int numberLaps = 2;
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberLaps; i++) {
            app.updateQuality();
		}
        System.out.println(app.getItems()[0].toString());
        assertEquals(11, app.getItems()[0].quality);
    }
    
    
    @Test
    public void sellInPositiveAndLimitMaxQuality() {

        Item[] items = new Item[] { new Item("BACKSTAGE to AGED BRIE", 10, 47) };
        int numberLaps = 2;
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberLaps; i++) {
            app.updateQuality();
		}
        System.out.println(app.getItems()[0].toString());
        assertEquals(50, app.getItems()[0].quality);
    }
    
    
    
    @Test
    public void sellInPositiveAndChangeValueCondition() {

        Item[] items = new Item[] { new Item("BACKSTAGE to AGED BRIE", 7, 21) };
        int numberLaps = 3;
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberLaps; i++) {
            app.updateQuality();
		}
        System.out.println(app.getItems()[0].toString());
        assertEquals(28, app.getItems()[0].quality);
    }
    
    
    @Test
    public void sulfurasTest() {

        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 7, 77) };
        int numberLaps = 4;
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberLaps; i++) {
            app.updateQuality();
		}
        System.out.println(app.getItems()[0].toString());
        assertTrue(app.getItems()[0].sellIn == 7 && app.getItems()[0].quality == 80 );

    }
    
    
    @Test
    public void conjuradoTest() {

        Item[] items = new Item[] { new Item("CONJURADO", 7, 38) };
        int numberLaps = 2;
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < numberLaps; i++) {
            app.updateQuality();
		}
        System.out.println(app.getItems()[0].toString());
        assertTrue(app.getItems()[0].sellIn == 5 && app.getItems()[0].quality == 30 );

    }


}