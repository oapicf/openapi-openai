package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/files")


@io.swagger.annotations.Api(description = "the files API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface FilesApi  {

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile(MultipartFormDataInput input,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext);
    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the contents of the specified file.", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of files.", notes = "", response = ListFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles( @QueryParam("purpose") String purpose, @DefaultValue("10000") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext);
}
