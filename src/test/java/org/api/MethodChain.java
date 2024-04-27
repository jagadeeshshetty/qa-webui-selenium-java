package org.api;

// CRS: CustomRequestSpecification
class CRS {

  static CRS given() {
    System.out.println("exe given method");
    return new CRS();
  }

  CRS when() {
    System.out.println("exe when method");
    return this;
  }

  CRS then() {
    System.out.println("exe then method");
    return this;
  }

}

public class MethodChain {
  public static void main(String[] args) {
    CRS.given().when().then();
  }
}
