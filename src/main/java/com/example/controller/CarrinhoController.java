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
public class CarrinhoController {

    @GetMapping(value = {"/carrinho"})
    public String carrinho(Model model) {
        model.addAttribute("title", "Carrinho");
        model.addAttribute("voucherCodigo", 3842);
        model.addAttribute("valorDesconto", 111);
        model.addAttribute("carrinho", new CarrinhoViewModel("Devio",new BigDecimal(10),"454545454545",new BigDecimal(30)));
        return "carrinho/index.html";
    }

    // @GetMapping(value = {"/vitrine/index"})
    // public String index(){
    //     return "vitrine/index.html";
    // }
}