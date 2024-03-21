package com.jc.core.oop.encapsulation;

public class Signup {

    private String email;
    private String name;

    Signup(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public String getName() {
        if (name == null) {
            throw new IllegalStateException("Name is not set.");
        }
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        if (email == null)
            throw new IllegalStateException("Email is not set.");
        return email;
    }

    private void setEmail(String email) {
        if (isValidEmailFormat(email))
            this.email = email;
        else
            throw new IllegalArgumentException("Invalid email format.");
    }

    private boolean isValidEmailFormat(String email) {
        /*
          Regular expression for email format validation
          It allows for alphanumeric characters, plus (+), underscore (_), hyphen (-), and dot (.) in the local part before the @ symbol.
          The domain part should consist of alphanumeric characters, hyphens, and dots.

          - ^ asserts the start of the string.
          - [A-Za-z0-9+_.-]+ matches one or more characters that can be either uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), plus (+), underscore (_), dot (.), or hyphen (-).
            This part represents the local part of the email address before the @ symbol.
          - @ matches the literal @ symbol.
          - [A-Za-z0-9.-]+ matches one or more characters that can be either uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), dot (.), or hyphen (-).
            This part represents the domain part of the email address after the @ symbol.
          - $ asserts the end of the string.

          In summary, this regular expression validates that an email address follows a basic format, where the local part can contain letters, digits,
          plus, underscore, dot, or hyphen, followed by the @ symbol, and then the domain part can contain letters, digits, dot, or hyphen.
          */
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Return true if the email matches the regex, false otherwise
        return email != null && email.matches(emailRegex);
    }
}
