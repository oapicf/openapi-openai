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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApi {

    @POST
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ", notes = "", response = OpenAIFile.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class)
    })
    public Response createFile( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "purpose")  String purpose) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class)
    })
    public Response deleteFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{file_id}/content")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file", notes = "", response = String.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    public Response downloadFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class)
    })
    public Response listFiles() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class)
    })
    public Response retrieveFile(@PathParam("file_id") @ApiParam("The ID of the file to use for this request") String fileId) {
        return Response.ok().entity("magic!").build();
    }
}
