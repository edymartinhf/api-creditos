package com.bootcamp.bank.creditos.infrastructure.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorBean {
    private String codigoEstadoHttp;
    private String mensaje;
}
