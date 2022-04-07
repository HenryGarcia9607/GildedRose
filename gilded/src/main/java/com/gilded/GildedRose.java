package com.gilded;

public class GildedRose {
	
	static final int  MAX_QUALITY = 50;
	static final int  MIN_QUALITY = 0;
	static final int  MAX_QUALITY_SULFURAS = 80;
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

	public void updateQuality() {

		for (Item item : items) {
			if (item.name != null) {
				if (item.sellIn < 0) {
					if (item.name.equalsIgnoreCase("Aged Brie")) {
						item.quality = item.quality + 2 > MAX_QUALITY ? MAX_QUALITY : item.quality + 2;
					} else {
						item.quality = item.quality - 2 < MIN_QUALITY ? MIN_QUALITY : item.quality - 2;
					}

				} else {
					if (item.name.toUpperCase().contains("AGED BRIE")
							&& item.name.toUpperCase().contains("BACKSTAGE")) {
						if (item.sellIn > 5 && item.sellIn <= 10) {
							item.quality = item.quality + 2 > MAX_QUALITY ? MAX_QUALITY : item.quality + 2;
						}else if (item.sellIn <= 5 ){
							item.quality = item.quality + 3 > MAX_QUALITY ? MAX_QUALITY : item.quality + 3;
						}else {
							item.quality = item.quality + 1 > MAX_QUALITY ? MAX_QUALITY : item.quality + 1;
						}
					} else if (item.name.equalsIgnoreCase("Sulfuras, Hand of Ragnaros")) {
						item.quality = item.quality + 1 > MAX_QUALITY_SULFURAS ? MAX_QUALITY_SULFURAS
								: item.quality + 1;
					} else if (item.name.equalsIgnoreCase("Aged Brie")) {
						item.quality = item.quality + 1 > MAX_QUALITY ? MAX_QUALITY : item.quality + 1;
					} else if (item.name.toUpperCase().contains("CONJURADO")) {
						item.quality = item.quality - 4 < MIN_QUALITY ? MIN_QUALITY : item.quality - 4;
					} else {
						item.quality = item.quality - 1 < MIN_QUALITY ? MIN_QUALITY : item.quality - 1;
					}

				}
				item.sellIn = item.name.equalsIgnoreCase("Sulfuras, Hand of Ragnaros") ? item.sellIn : item.sellIn -1;
			}
		}
	}

	public Item[] getItems() {
		return items;
	}
	
	
}