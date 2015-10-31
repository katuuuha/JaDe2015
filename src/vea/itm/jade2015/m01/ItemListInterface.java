package vea.itm.jade2015.m01;

import java.util.ArrayList;

/**
 * Created by Madara on 31.10.2015..
 */
public interface ItemListInterface {

	boolean addItem(Item item);

	boolean removeItem(String code);

	Item getItem(String code);

	ArrayList<Item> getAllItems();

}