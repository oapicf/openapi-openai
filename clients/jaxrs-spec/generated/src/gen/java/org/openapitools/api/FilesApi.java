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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-14T13:42:15.676976801Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApi {

    @POST
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        
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
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class)
    })
    public Response listFiles(@QueryParam("purpose")  @ApiParam("Only return files with the given purpose.")  String purpose) {
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
