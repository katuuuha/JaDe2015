package vea.itm.jade2015.m01.product;

public class Item {
    private int quantity;
    private String code;
    private double cost;
    private Category category;

    public Item(int quantity, String code, double cost, Category category){
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

    public Category getCategory() {
        return category;
    }

}
