package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import java.io.IOException;
import java.math.BigDecimal;

import jakarta.servlet.http.HttpServletResponse;

import com.example.viewmodel.*;

@Controller
public class VitrineController {

    @GetMapping(value = {"/vitrine/index"})
    public String index(Model model) {
        return "vitrine/index.html";
    }
}