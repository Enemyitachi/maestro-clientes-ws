package org.axa.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Cliente {
    @JsonProperty("cliente")
    String cliente;
    @JsonProperty("razon_cliente")
    String razon_cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRazon_cliente() {
        return razon_cliente;
    }

    public void setRazon_cliente(String razon_cliente) {
        this.razon_cliente = razon_cliente;
    }
}
