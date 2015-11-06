package vea.itm.jade2015.m01.product;

/**
 * Created by katrina.zvaigzne on 10/31/2015.
 */
public class Category {
    private String name;
    private double discount;

    public Category(String name, double discount){
        this.name=name;
        this.discount=discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }
}
