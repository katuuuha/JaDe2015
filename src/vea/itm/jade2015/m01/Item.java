package vea.itm.jade2015.m01;

public class Item {
    private int quantity;
    private String code;
    private double cost;

    public Item(int quantity, String code, double cost){
    	this.quantity = quantity;
    	this.code = code;
    	this.cost = cost;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getCode()
    {
        return code;
    }

    public double getCost()
    {
        return cost;
    }
}
