package org.axa.consultaCliente.Controlador;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.axa.consultaCliente.Modelo.RequestConsultaCliente;

@Path("/cliente")
public class ConsultaCliente {

    @POST
    @Path("/consultaCliente")
    public Response consultaCliente(RequestConsultaCliente requestConsultaCliente){
        //Proceso del servicio

        return Response.ok().build();
    }
}
