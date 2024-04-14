package org.selenium;

import org.selenium.pom.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases extends BaseTest {

  @Test
  void test1() {
    Assert.assertNotNull(driver, "tbd");
  }

  @Test
  void test2() {
    Assert.assertNotNull(driver, "tbd");
  }
}
