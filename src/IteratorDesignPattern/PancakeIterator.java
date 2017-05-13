package IteratorDesignPattern;

import java.util.Iterator;

public class PancakeIterator implements Iterator<MenuItems>{
	
	int position = 0;
	MenuItems[] items;
	
	PancakeIterator(MenuItems[] items)
	{
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >=  items.length || items[position] == null)
			return false;
		else return true;
		
	}

	@Override
	public MenuItems next() {
		MenuItems menu = items[position];
		position++;
		return menu;
		
	}

}
