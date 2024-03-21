package com.jc.core.system;

import java.util.Properties;

public class GetPropertyUser {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);

        // usage example
        // System.out.println(System.getProperty("user.dir"));
    }
}
