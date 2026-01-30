package org.openapitools.api;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

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
@Path("/files")
@Api(description = "the files API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FilesApi {

    @POST
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class)
    })
    public Response createFile( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "purpose")  String purpose) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class)
    })
    public Response deleteFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{file_id}/content")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file.", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response downloadFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files.", notes = "", response = ListFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class)
    })
    public Response listFiles(@QueryParam("purpose")  @ApiParam("Only return files with the given purpose.")  String purpose,@QueryParam("limit") @DefaultValue("10000")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class)
    })
    public Response retrieveFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request.") String fileId) {
        return Response.ok().entity("magic!").build();
    }
}
