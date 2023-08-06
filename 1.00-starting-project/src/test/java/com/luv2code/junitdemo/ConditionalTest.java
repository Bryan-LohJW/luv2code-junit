package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest() {
        // basic tests
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // basic tests
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        // basic tests
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void testForWindowsAndMacOnly() {
        // basic tests
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // basic tests
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17() {
        // basic tests
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13() {
        // basic tests
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
    void testForOnlyForJavaRange() {
        // basic tests
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyForJavaRangeMin() {
        // basic tests
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testForOnlyForDevEnvironment() {
        // basic tests
    }


    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testForOnlyForSystemProperty() {
        // basic tests
    }
}
