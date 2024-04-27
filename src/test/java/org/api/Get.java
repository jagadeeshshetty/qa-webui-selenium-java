package org.api;

import io.github.cdimascio.dotenv.Dotenv;

public class Get {
  public static void main(String[] args) {
    Dotenv env = Dotenv.load();
    System.out.println(env.get("EMAIL"));
  }
}
