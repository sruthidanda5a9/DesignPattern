package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintHere {

	public static void main(String[] args) {
		
		DinnerMenuItems dinnermenu = new DinnerMenuItems();
		PancakeMenu pancake = new PancakeMenu();
		
		MenuItems[] pancakes = pancake.getAllPancakeItems();
		ArrayList<MenuItems> dinnerMenu = dinnermenu.getAllDinnerMenu();
		
		/*for (int i=0;i<pancakes.length;i++)
		{
			System.out.println(pancakes[i].getName() +" "+ pancakes[i].getCost());
		}
		
		for (MenuItems menu : dinnerMenu)
		{
			System.out.println(menu.getCost() + " "+ menu.getName());
		}*/
		
		Iterator dinner = dinnerMenu.iterator();
		
		Iterator pancake1 = (pancake).createIterator();
		
		print(dinner);
		print(pancake1);
		
		
	}

	private static void print(Iterator iteraton) {
			while(iteraton.hasNext())
			{
				MenuItems menuItems = (MenuItems) iteraton.next();
				System.out.println(menuItems.getCost());
				System.out.println(menuItems.getName());
			}
			
	}

}
