package IKEA.Item.subclasses;

import IKEA.Item.Item;

public class Tool extends Item {
	public Tool(int itemID, String name, double sellPrice, double buyPrice, char sectionID) {
		super(itemID, name, sellPrice, buyPrice, 'T');
	}

}