package vea.itm.jade2015.m01.product;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * Created by Madara on 06.11.2015..
 */
public class CategoryDiscounter {
    private  double discount = 0;   //in percentage like 0.15 is meant like 15%
    private Category category;
    private LocalDate date;
    private int amount;

    public CategoryDiscounter(Category category, LocalDate date, int amount)
    {
        this.category = category;
        this.date = date;
        this.amount = amount;
    }

    public double getDiscount()
    {
        //if it's national freedom's day, there is 100% discount
        if(date == LocalDate.of(LocalDate.now().getYear(), Month.NOVEMBER, 18))
        {
            discount = 1;
            return discount;
        }

        //discount based on category
        switch(category.getName()) {
            case "Fruits":
                discount += amount * 0.02;
                break;
            case "Cars":
                discount += amount * 0.05;
                break;
            case "Furniture":
                discount += amount * 0.01;
                break;
        }

        //max discount is 100%
        if(discount > 1)
            discount = 1;

        return discount;
    }
}
