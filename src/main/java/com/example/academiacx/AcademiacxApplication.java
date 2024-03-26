package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.academiacx.Filme;
import com.example.academiacx.FilmeRepository;

import java.util.Optional;

@SpringBootApplication
public class AcademiacxApplication {

    @Autowired
    private static FilmeRepository filmeRepository;

    public static void main(String[] args) {
        SpringApplication.run(AcademiacxApplication.class, args);

    }
}
