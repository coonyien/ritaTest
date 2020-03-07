package com.dudu.testng.Suite;

import org.testng.annotations.Test;

public class ReviewTest {

    @Test
    public void ignore1(){
        System.out.println("ignoreTest 1");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignoreTest 2");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignoreTest 3");
    }
}
