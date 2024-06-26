package org.api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;

public class Get {

  @Test
  void testGetWorkspacesSuccess() {
    Dotenv env = Dotenv.load();
    RestAssured
        .given()
        .baseUri("https://api.postman.com")
        .header("X-Api-Key", env.get("POSTMAN_API_KEY"))
        .when()
        .get("/workspaces")
        .then()
        .log().all()
        .assertThat()
        .statusCode(200)
        .body("workspaces.name", Matchers.hasItems("My Workspace", "Learn"))
        .body("workspaces.type", Matchers.hasItems("personal", "personal"));
  }
}
