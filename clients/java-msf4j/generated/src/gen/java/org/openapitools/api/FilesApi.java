package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FilesApiService;
import org.openapitools.api.factories.FilesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/files")


@io.swagger.annotations.Api(description = "the files API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FilesApi  {
   private final FilesApiService delegate = FilesApiServiceFactory.getFilesApi();

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", notes = "", response = OpenAIFile.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile(
            @FormDataParam("file") InputStream _fileInputStream,
            @FormDataParam("file") FileInfo _fileDetail
,@ApiParam(value = "The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). ", required=true, allowableValues="assistants, batch, fine-tune, vision")@FormDataParam("purpose")  String purpose
)
    throws NotFoundException {
        return delegate.createFile(_fileInputStream, _fileDetail,purpose);
    }
    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.deleteFile(fileId);
    }
    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the contents of the specified file.", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.downloadFile(fileId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of files.", notes = "", response = ListFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles(@ApiParam(value = "Only return files with the given purpose.") @QueryParam("purpose") String purpose
,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ", defaultValue="10000") @DefaultValue("10000") @QueryParam("limit") Integer limit
,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc") @QueryParam("order") String order
,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
)
    throws NotFoundException {
        return delegate.listFiles(purpose,limit,order,after);
    }
    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Files", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile(@ApiParam(value = "The ID of the file to use for this request.",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.retrieveFile(fileId);
    }
}
