package vea.itm.jade2015.m01;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract item list class which could be extended to concrete implementation as ShopingList, DeliveryList, etc
 * @author Janis
 *
 */
public abstract class ItemList implements ItemListInterface
{
	private HashMap<String, Item> items;

	ItemList()
	{
		items = new HashMap<String, Item>();
	}

	@Override
	public boolean addItem(Item item)
	{
		if (item != null)
		{
			items.put(item.getCode(), item);
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean removeItem(String code)
	{
		if (items.containsKey(code))
		{
			items.remove(code);
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Item getItem(String code)
	{
		return items.get(code);
	}

	@Override
	public ArrayList<Item> getAllItems()
	{
		return new ArrayList<Item>(items.values());
	}
}