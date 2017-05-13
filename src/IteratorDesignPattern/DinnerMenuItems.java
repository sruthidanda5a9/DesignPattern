package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class DinnerMenuItems {
	
	ArrayList<MenuItems> dinnerMenu = new ArrayList<MenuItems>();
	
	DinnerMenuItems()
	{
		addDinnerMenu( "dinner1" , 1);
		addDinnerMenu( "dinner2" , 1);
		addDinnerMenu( "dinner3" , 1);
		addDinnerMenu( "dinner4" , 1);
	}

	public  void addDinnerMenu(String name, int cost) {
		MenuItems menuItem = new MenuItems(name, cost);
		dinnerMenu.add(menuItem);
	}

	public void remove(MenuItems menuItem)
	{
		throw new UnsupportedOperationException();
	}
	
	public ArrayList<MenuItems> getAllDinnerMenu()
	{
		return  dinnerMenu;
	}
	
	public Iterator createIterator()
	{
		return  dinnerMenu.iterator();
	}

}
