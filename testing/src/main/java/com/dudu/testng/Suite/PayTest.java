package com.dudu.testng.Suite;

import org.testng.annotations.Test;

public class PayTest {

    @Test
    public void pay(){
        System.out.println("pay 1: " + Thread.currentThread().getId());
    }
}
