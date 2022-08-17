package testmg;

import org.testng.annotations.*;

public class beforeExample {


    @Test(priority = 2)
    public void MethodB() {
        System.out.println("method B");
    }

    @Test(priority = 3)
    public void MethodC() {
        System.out.println("method C");
    }

    @Test(priority = 1)
    public void MethodA() {
        System.out.println("method A");
    }
}