package com.curso.spring_security_course.dto;

public class AuthenticationRequest {
    private String usaername;
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String usaername, String password) {
        this.usaername = usaername;
        this.password = password;
    }

    public String getUsaername() {
        return usaername;
    }

    public void setUsaername(String usaername) {
        this.usaername = usaername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "usaername='" + usaername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
