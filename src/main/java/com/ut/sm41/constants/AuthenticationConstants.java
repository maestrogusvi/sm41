package com.ut.sm41.constants;

public final class AuthenticationConstants {

    /**
     * Url authenticated
     */
    public static final String URL_PRIVATE_AUTHETICATION = "/";

    /**
     * config Url access
     */
    public static final String URL_CONFIG_PRIVATE_AUTHETICATION = "/api/v1/**";

    private AuthenticationConstants() {
        throw new IllegalStateException("Constants class");
    }
}
