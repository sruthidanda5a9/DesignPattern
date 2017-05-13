package IteratorDesignPattern;

import java.util.Iterator;

public class PancakeMenu {
	
	private static final int   maximum  = 6;
	MenuItems pancakeMenuItem[] = new MenuItems[maximum];
	int pointer = 0;
	
	PancakeMenu(){
		
		addpancake("pancake1",1);
		addpancake("pancake2",1);
		addpancake("pancake3",1);
		addpancake("pancake4",1);
		addpancake("pancake5",1);
		addpancake("pancake6",1);
	}

	public void addpancake(String name, int cost)  {
		MenuItems menu = new MenuItems(name, cost);
		if (pointer< maximum)
		{
			pancakeMenuItem[pointer] = menu;
			pointer ++;
		} else
			try {
				throw new UnsupportedArrayIndexException("Array index exceeded...");
			} catch (UnsupportedArrayIndexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public MenuItems[] getAllPancakeItems()
	{
		return pancakeMenuItem;
	}
	
	public void removeItem(int index)
	{
		if (index < 0 || index > pointer )
		{
			try {
				throw new UnsupportedArrayIndexException("Array index not supported ..");
			} catch (UnsupportedArrayIndexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			System.out.println("Remove is not yet implemented.");
		}
	}
	
	public Iterator createIterator()
	{
		return  new PancakeIterator(pancakeMenuItem);
	}

	

}
