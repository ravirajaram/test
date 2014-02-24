package com.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test")
public class test{

@GET
@Path("/{param}")
public Response getMsg(@PathParam("param") String msg) {

    String output = "Jersey say : " + msg;

    return Response.status(200).entity(output).build();

    }

}

//run: localhost:8080/test/rest/test/blabla
//http://stackoverflow.com/questions/10009010/restful-webservices-in-java-using-eclipse-tomcat-and-jersey

/*mvn archetype:generate -DgroupId=com.test.rest -DartifactId=restapp -DarchetypeArtifactId=maven-archetype-webapp

mvn archetype:generate -DgroupId=com.mkyong -DartifactId=NumberGenerator -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false*/