package com.consol.citrus.samples;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.testng.AbstractTestNGCitrusTest;

/**
 * TODO: Description
 *
 * @author Ryan
 * @since 2017-08-21
 */
@Test
public class MyTest extends AbstractTestNGCitrusTest {

    @CitrusXmlTest(name = "MyTest")
    public void myTest() {}
}
