package com.amazon.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    //sleep
    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }


    public static void priceOfItems(){

        List<Double> prices = new ArrayList<>();

        List<WebElement> price = Driver.getDriver().findElements(By.xpath("(//span[@class='a-price-whole'])"));
        List<WebElement> franctionPrice = Driver.getDriver().findElements(By.xpath("//span[@class='a-price-fraction']"));

        System.out.println(price.size());
        System.out.println(franctionPrice.size());

        try{
            for (int i = 0; i < price.size(); i++) {

                String value = price.get(i).getText()+"."+franctionPrice.get(i).getText();
                prices.add(Double.parseDouble(value));
                System.out.println("prices = " + prices);
            }
        }catch (Exception e){

        }
    }
}
