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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApi  {
   private final FilesApiService delegate = FilesApiServiceFactory.getFilesApi();

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ", notes = "", response = OpenAIFile.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile(
            @FormDataParam("file") InputStream _fileInputStream,
            @FormDataParam("file") FileInfo _fileDetail
,@ApiParam(value = "The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. ", required=true)@FormDataParam("purpose")  String purpose
)
    throws NotFoundException {
        return delegate.createFile(_fileInputStream, _fileDetail,purpose);
    }
    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.deleteFile(fileId);
    }
    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the contents of the specified file", notes = "", response = String.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.downloadFile(fileId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles()
    throws NotFoundException {
        return delegate.listFiles();
    }
    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile(@ApiParam(value = "The ID of the file to use for this request",required=true) @PathParam("file_id") String fileId
)
    throws NotFoundException {
        return delegate.retrieveFile(fileId);
    }
}
