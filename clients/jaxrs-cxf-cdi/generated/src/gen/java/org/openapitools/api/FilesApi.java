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

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T10:45:22.438122430Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class FilesApi  {

  @Context SecurityContext securityContext;

  @Inject FilesApiService delegate;


    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "purpose")  String purpose) {
        return delegate.createFile(_fileDetail, purpose, securityContext);
    }

    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId) {
        return delegate.deleteFile(fileId, securityContext);
    }

    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file.", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId) {
        return delegate.downloadFile(fileId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles(@ApiParam(value = "Only return files with the given purpose.")  @QueryParam("purpose") String purpose) {
        return delegate.listFiles(purpose, securityContext);
    }

    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId) {
        return delegate.retrieveFile(fileId, securityContext);
    }
}
