package org.axa.agregaCliente.controlador;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.axa.agregaCliente.modelo.RequestAgregaCliente;

@Path("cliente")
public class agregaCliente {
    @POST
    @Path("/agregaCliente")
    public Response agregaCliente(RequestAgregaCliente requestConsultaCliente){
        //Proceso del servicio
        return Response.ok().build();
    }
}
