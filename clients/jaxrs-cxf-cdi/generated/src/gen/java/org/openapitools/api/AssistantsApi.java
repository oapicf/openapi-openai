package org.openapitools.api;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;
import org.openapitools.api.AssistantsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/assistants")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class AssistantsApi  {

  @Context SecurityContext securityContext;

  @Inject AssistantsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an assistant with a model and instructions.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response createAssistant(@ApiParam(value = "" ,required=true) CreateAssistantRequest createAssistantRequest) {
        return delegate.createAssistant(createAssistantRequest, securityContext);
    }

    @DELETE
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an assistant.", notes = "", response = DeleteAssistantResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteAssistantResponse.class) })
    public Response deleteAssistant(@ApiParam(value = "The ID of the assistant to delete.",required=true) @PathParam("assistant_id") String assistantId) {
        return delegate.deleteAssistant(assistantId, securityContext);
    }

    @GET
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response getAssistant(@ApiParam(value = "The ID of the assistant to retrieve.",required=true) @PathParam("assistant_id") String assistantId) {
        return delegate.getAssistant(assistantId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of assistants.", notes = "", response = ListAssistantsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListAssistantsResponse.class) })
    public Response listAssistants(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listAssistants(limit, order, after, before, securityContext);
    }

    @POST
    @Path("/{assistant_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response modifyAssistant(@ApiParam(value = "The ID of the assistant to modify.",required=true) @PathParam("assistant_id") String assistantId, @ApiParam(value = "" ,required=true) ModifyAssistantRequest modifyAssistantRequest) {
        return delegate.modifyAssistant(assistantId, modifyAssistantRequest, securityContext);
    }
}
