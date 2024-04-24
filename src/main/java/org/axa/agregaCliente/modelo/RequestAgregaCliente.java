package org.axa.agregaCliente.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RequestAgregaCliente {
    @JsonProperty("cliente")
    String cliente;
}