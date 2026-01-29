package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AssistantFileObject;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantFileRequest;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantFileResponse;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantFilesResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/assistants")


@io.swagger.annotations.Api(description = "the assistants API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T10:45:31.742862961Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface AssistantsApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an assistant with a model and instructions.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response createAssistant(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssistantRequest createAssistantRequest,@Context SecurityContext securityContext);
    @POST
    @Path("/{assistant_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).", notes = "", response = AssistantFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class) })
    public Response createAssistantFile( @PathParam("assistant_id") String assistantId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateAssistantFileRequest createAssistantFileRequest,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an assistant.", notes = "", response = DeleteAssistantResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteAssistantResponse.class) })
    public Response deleteAssistant( @PathParam("assistant_id") String assistantId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{assistant_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an assistant file.", notes = "", response = DeleteAssistantFileResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteAssistantFileResponse.class) })
    public Response deleteAssistantFile( @PathParam("assistant_id") String assistantId, @PathParam("file_id") String fileId,@Context SecurityContext securityContext);
    @GET
    @Path("/{assistant_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response getAssistant( @PathParam("assistant_id") String assistantId,@Context SecurityContext securityContext);
    @GET
    @Path("/{assistant_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an AssistantFile.", notes = "", response = AssistantFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class) })
    public Response getAssistantFile( @PathParam("assistant_id") String assistantId, @PathParam("file_id") String fileId,@Context SecurityContext securityContext);
    @GET
    @Path("/{assistant_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of assistant files.", notes = "", response = ListAssistantFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListAssistantFilesResponse.class) })
    public Response listAssistantFiles( @PathParam("assistant_id") String assistantId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of assistants.", notes = "", response = ListAssistantsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListAssistantsResponse.class) })
    public Response listAssistants( @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext);
    @POST
    @Path("/{assistant_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public Response modifyAssistant( @PathParam("assistant_id") String assistantId,@ApiParam(value = "" ,required=true) @NotNull @Valid ModifyAssistantRequest modifyAssistantRequest,@Context SecurityContext securityContext);
}
