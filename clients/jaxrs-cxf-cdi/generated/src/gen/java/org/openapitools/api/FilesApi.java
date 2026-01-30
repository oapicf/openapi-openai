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


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class FilesApi  {

  @Context SecurityContext securityContext;

  @Inject FilesApiService delegate;


    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        
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
    @ApiOperation(value = "Returns a list of files.", notes = "", response = ListFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Files" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles(@ApiParam(value = "Only return files with the given purpose.")  @QueryParam("purpose") String purpose, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ", defaultValue="10000") @DefaultValue("10000")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listFiles(purpose, limit, order, after, securityContext);
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
