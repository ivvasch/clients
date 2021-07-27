package ru.inversion.clients;

import ru.inversion.gateclasses.utils.ObjStringConverter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/clients")
public class ClientsWS {
    final static String SERVICE_NAME = "ClientsWS";

    @POST
    @Path("/reqclientsdata")
    @Produces(MediaType.APPLICATION_JSON)
    public OutAnsClientsData212 clientsToJson(InReqClientsData212 inReqClientsData212) throws Throwable {
        OutAnsClientsData212 result = null;
        String inparam = "cmd=767161743" + (char) Integer.parseInt("01", 16) + ObjStringConverter.objToString(inReqClientsData212);
        return (OutAnsClientsData212) ServiceConnector.outData(result, inparam, inReqClientsData212, SERVICE_NAME);

    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public String getServiceName() {
        return "index";
    }
}
