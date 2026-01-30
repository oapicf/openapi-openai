package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AssistantsApiService;
import org.openapitools.api.factories.AssistantsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/assistants")


@io.swagger.annotations.Api(description = "the assistants API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApi  {
   private final AssistantsApiService delegate = AssistantsApiServiceFactory.getAssistantsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an assistant with a model and instructions.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response createAssistant(@ApiParam(value = "" ,required=true) CreateAssistantRequest createAssistantRequest
)
    throws NotFoundException {
        return delegate.createAssistant(createAssistantRequest);
    }
    @DELETE
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an assistant.", notes = "", response = DeleteAssistantResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteAssistantResponse.class) })
    public Response deleteAssistant(@ApiParam(value = "The ID of the assistant to delete.",required=true) @PathParam("assistant_id") String assistantId
)
    throws NotFoundException {
        return delegate.deleteAssistant(assistantId);
    }
    @GET
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response getAssistant(@ApiParam(value = "The ID of the assistant to retrieve.",required=true) @PathParam("assistant_id") String assistantId
)
    throws NotFoundException {
        return delegate.getAssistant(assistantId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of assistants.", notes = "", response = ListAssistantsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListAssistantsResponse.class) })
    public Response listAssistants(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20") @QueryParam("limit") Integer limit
,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc") @QueryParam("order") String order
,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before") String before
)
    throws NotFoundException {
        return delegate.listAssistants(limit,order,after,before);
    }
    @POST
    @Path("/{assistant_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response modifyAssistant(@ApiParam(value = "The ID of the assistant to modify.",required=true) @PathParam("assistant_id") String assistantId
,@ApiParam(value = "" ,required=true) ModifyAssistantRequest modifyAssistantRequest
)
    throws NotFoundException {
        return delegate.modifyAssistant(assistantId,modifyAssistantRequest);
    }
}
