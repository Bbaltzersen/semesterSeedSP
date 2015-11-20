/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author bbalt
 */
@Path("footbaalclubs")
public class GenericResource {

    @GET
    @Produces("application/json")
    public String getJson() {
        String temp = "[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},{\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]";
        return temp;
    }
}
