package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {

    @Test
    public void softAssertTest() {

        //1.SoftAssert objesi olustur
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Satir 14");
        softAssert.assertEquals(2, 5);//fail
        System.out.println("Satir 16");
        softAssert.assertTrue("JAVA".contains("U"));//fail
        System.out.println("Satir 18");
        softAssert.assertTrue(true);//pass
        System.out.println("Satir 20");
        softAssert.assertAll();//pass yada fail olarak assertion lari isaretler
    }

}




