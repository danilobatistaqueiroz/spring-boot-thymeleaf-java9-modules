package com.example.viewmodel;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import lombok.ToString;

@ToString
public class CarrinhoViewModel {
  public String pedidoId;
  public String clienteId;
  public BigDecimal subTotal;
  public BigDecimal valorTotal;
  public BigDecimal valorDesconto;
  public String voucherCodigo;
  public List<CarrinhoItemViewModel> items = new ArrayList<CarrinhoItemViewModel>();
  public CarrinhoPagamentoViewModel pagamento;

  public CarrinhoViewModel(String clienteId, BigDecimal valorTotal, String pedidoId, BigDecimal desconto) {
      this.clienteId = clienteId;
      this.valorTotal = valorTotal;
      this.pedidoId = pedidoId;
      this.valorDesconto = desconto;
      this.subTotal = desconto.add(valorTotal);
  }
}