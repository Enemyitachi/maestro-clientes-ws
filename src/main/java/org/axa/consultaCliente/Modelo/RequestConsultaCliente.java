package org.axa.consultaCliente.Modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RequestConsultaCliente {
    @JsonProperty("cliente")
    String cliente;
}
