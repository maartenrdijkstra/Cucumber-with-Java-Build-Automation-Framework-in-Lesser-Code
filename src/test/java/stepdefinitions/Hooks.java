package stepdefinitions;

import cucumber.automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageobjects.HomePage;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation() {
        System.out.println("Before Mobile hook");
    }

    @After("@SmokeTest")
    public void afterValidation() {
        System.out.println("After Smoke Test");
    }

    @After("@RegressionTest")
    public void afterSeleniumTest() {
        System.out.println("After Regression Test");
    }

    @Before("@WebTest")
    public void beforeWebValidation() {
        System.out.println("Before Web hook");
    }

    @After("@WebTest")
    public void afterWebValidation() {
        System.out.println("After Web before hook");
    }

    @After("@PortalTest")
    public void afterPortalTest() {
        System.out.println("After Portal Test");
    }
}

