package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_DependsOfMethods {

    @Test
    public void homeTest() {
        System.out.println("Home Test");
        Assert.assertTrue(false);//fail
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test
    public void paymentTest() {
        System.out.println("Paymen Test");

    }

}


