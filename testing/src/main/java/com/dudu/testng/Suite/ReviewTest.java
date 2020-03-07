package com.dudu.testng.Suite;

import org.testng.annotations.Test;

import java.net.SocketTimeoutException;

public class ReviewTest {

    @Test
    public void ignore1(){
        System.out.println("test 1: " + Thread.currentThread().getId());
    }

    @Test(timeOut = 2000)
    public void ignore2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("test 2: " + Thread.currentThread().getId());
    }

    @Test(timeOut = 3000)
    public void ignore3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test 3: " + Thread.currentThread().getId());
    }


}
