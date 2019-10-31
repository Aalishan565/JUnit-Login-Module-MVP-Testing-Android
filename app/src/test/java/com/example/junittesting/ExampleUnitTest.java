package com.example.junittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginActivityTest.class,
        LoginActivityTest.class
})
public class ExampleUnitTest {

}