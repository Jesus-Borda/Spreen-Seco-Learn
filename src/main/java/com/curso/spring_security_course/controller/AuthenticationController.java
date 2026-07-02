package com.curso.spring_security_course.controller;

import com.curso.spring_security_course.dto.AuthenticationRequest;
import com.curso.spring_security_course.dto.AuthenticationResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @PostMapping(path = "authenticate")
    public ResponseEntity<AuthenticationResponse> login (
            @RequestBody @Valid AuthenticationRequest authenticationRequest){
        return null;
    }
}
