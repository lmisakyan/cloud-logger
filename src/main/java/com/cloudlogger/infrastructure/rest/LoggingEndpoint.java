package com.cloudlogger.infrastructure.rest;

import java.io.IOException;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloudlogger.domain.Entry;
import com.cloudlogger.service.LogService;

@Path("/logging")
public class LoggingEndpoint {
	@Autowired
	LogService logService;

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTitle() {
		return "Sample Log Application";
	}

	@POST
	@Path("/log")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertLogEntries(Entry[] entries) throws IOException {
		try {
			logService.log(Arrays.asList(entries));
			return Response.ok().entity("OK").build();
		}
		catch (Exception e) {
			return Response.status(500).entity(e).build();
		}

	}

}
