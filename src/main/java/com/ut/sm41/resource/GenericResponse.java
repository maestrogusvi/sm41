package com.ut.sm41.resource;

import com.nimbusds.jose.shaded.json.JSONObject;

public class GenericResponse {
    int i;
    String success;
    Object loginAuthentication;

    public GenericResponse(int i, String success, Object loginAuthentication) {
        this.i = i;
        this.success = success;
        this.loginAuthentication = loginAuthentication;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Object getLoginAuthentication() {
        return loginAuthentication;
    }

    public void setLoginAuthentication(Object loginAuthentication) {
        this.loginAuthentication = loginAuthentication;
    }
}
