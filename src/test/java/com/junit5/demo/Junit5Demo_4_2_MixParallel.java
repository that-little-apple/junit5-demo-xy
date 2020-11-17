/**
 * projectName: Junit5Demo
 * fileName: Fixtures.java
 * packageName: com.junit5
 * date: 2020-11-07 2:24 下午
 */
package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @description: Fixtrure演练
 **/
public class Junit5Demo_4_2_MixParallel {
    @RepeatedTest(10)
    public void addTest(){
        int result = Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @RepeatedTest(10)
    public void subTractTest(){
        int result = Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }
}