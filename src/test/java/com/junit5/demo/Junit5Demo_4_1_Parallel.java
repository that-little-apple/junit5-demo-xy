/**
 * projectName: Junit5Demo
 * fileName: Fixtures.java
 * packageName: com.junit5
 * date: 2020-11-07 2:24 下午
 */
package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;

/**
 * @description: Fixtrure演练
 **/
public class Junit5Demo_4_1_Parallel {
    @RepeatedTest(10)
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    public void countSynTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    public void countAtomicIntegerTest() throws InterruptedException {
        int result = Calculator.atomCount(1);
        System.out.println(result);
    }
}