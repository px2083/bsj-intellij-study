package bsj.study;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sujong on 2016-10-18.
 */
public class HelloTest {

    private Hello hello;

    @Before
    public void setup() {
        hello = new Hello();
    }

    @Test
    public void test_sayHello() {
        hello.sayHello();
    }
}