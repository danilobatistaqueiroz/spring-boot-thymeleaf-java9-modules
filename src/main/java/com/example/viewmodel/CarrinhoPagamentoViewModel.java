package com.example.viewmodel;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class CarrinhoPagamentoViewModel {
    private String nomeCartao;
    private String numeroCartao;
    private String expiracaoCartao;
    private String cvvCartao;
}