package org.openapitools.api;

import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
import org.openapitools.api.FilesApiService;

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
@Path("/files")
@RequestScoped

@Api(description = "the files API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class FilesApi  {

  @Context SecurityContext securityContext;

  @Inject FilesApiService delegate;


    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ", notes = "", response = OpenAIFile.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile( @Multipart(value = "file") InputStream _fileInputStream, @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "purpose")  String purpose) {
        return delegate.createFile(_fileInputStream, _fileDetail, purpose, securityContext);
    }

    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId) {
        return delegate.deleteFile(fileId, securityContext);
    }

    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file", notes = "", response = String.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId) {
        return delegate.downloadFile(fileId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles() {
        return delegate.listFiles(securityContext);
    }

    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId) {
        return delegate.retrieveFile(fileId, securityContext);
    }
}
