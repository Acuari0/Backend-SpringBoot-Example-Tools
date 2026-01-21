package com.example.demo.constants;

public final class URLConstants {

    private URLConstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static final String API_TEST_BASE = "/api/test";
    public static final String API_TEST_USER = "/{id}";
    
}
