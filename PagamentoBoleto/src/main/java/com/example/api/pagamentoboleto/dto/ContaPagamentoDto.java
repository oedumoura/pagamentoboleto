package com.example.api.pagamentoboleto.dto;

import lombok.Data;

@Data
public class ContaPagamentoDto {
    private long id;
    private String numeroConta;
    private String agencia;
    private long idCliente;
    private String nomeCliente;
    private double saldo;
    private boolean status;

}
