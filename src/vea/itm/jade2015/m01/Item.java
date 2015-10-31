package vea.itm.jade2015.m01;

public class Item {
    private int quantity;
    private String code;
    private double cost;
    private String category;

    public Item(int quantity, String code, double cost, String category){
    	this.quantity = quantity;
    	this.code = code;
    	this.cost = cost;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

}
