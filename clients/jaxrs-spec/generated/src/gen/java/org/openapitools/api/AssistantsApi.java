package org.openapitools.api;

import org.openapitools.model.AssistantFileObject;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantFileRequest;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantFileResponse;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantFilesResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/assistants")
@Api(description = "the assistants API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an assistant with a model and instructions.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class)
    })
    public Response createAssistant(@Valid @NotNull CreateAssistantRequest createAssistantRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{assistant_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).", notes = "", response = AssistantFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class)
    })
    public Response createAssistantFile(@PathParam("assistant_id") @ApiParam("The ID of the assistant for which to create a File. ") String assistantId,@Valid @NotNull CreateAssistantFileRequest createAssistantFileRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{assistant_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an assistant.", notes = "", response = DeleteAssistantResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteAssistantResponse.class)
    })
    public Response deleteAssistant(@PathParam("assistant_id") @ApiParam("The ID of the assistant to delete.") String assistantId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{assistant_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an assistant file.", notes = "", response = DeleteAssistantFileResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteAssistantFileResponse.class)
    })
    public Response deleteAssistantFile(@PathParam("assistant_id") @ApiParam("The ID of the assistant that the file belongs to.") String assistantId,@PathParam("file_id") @ApiParam("The ID of the file to delete.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{assistant_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class)
    })
    public Response getAssistant(@PathParam("assistant_id") @ApiParam("The ID of the assistant to retrieve.") String assistantId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{assistant_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an AssistantFile.", notes = "", response = AssistantFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class)
    })
    public Response getAssistantFile(@PathParam("assistant_id") @ApiParam("The ID of the assistant who the file belongs to.") String assistantId,@PathParam("file_id") @ApiParam("The ID of the file we&#39;re getting.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{assistant_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of assistant files.", notes = "", response = ListAssistantFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListAssistantFilesResponse.class)
    })
    public Response listAssistantFiles(@PathParam("assistant_id") @ApiParam("The ID of the assistant the file belongs to.") String assistantId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of assistants.", notes = "", response = ListAssistantsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListAssistantsResponse.class)
    })
    public Response listAssistants(@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{assistant_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies an assistant.", notes = "", response = AssistantObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class)
    })
    public Response modifyAssistant(@PathParam("assistant_id") @ApiParam("The ID of the assistant to modify.") String assistantId,@Valid @NotNull ModifyAssistantRequest modifyAssistantRequest) {
        return Response.ok().entity("magic!").build();
    }
}
