package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FilesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/files")


@io.swagger.annotations.Api(description = "the files API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApi  {

    @Inject FilesApiService service;

    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ", notes = "", response = OpenAIFile.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response createFile(MultipartFormDataInput input,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFile(input,securityContext);
    }
    @DELETE
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a file.", notes = "", response = DeleteFileResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public Response deleteFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFile(fileId,securityContext);
    }
    @GET
    @Path("/{file_id}/content")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the contents of the specified file", notes = "", response = String.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class) })
    public Response downloadFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.downloadFile(fileId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of files that belong to the user's organization.", notes = "", response = ListFilesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public Response listFiles(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listFiles(securityContext);
    }
    @GET
    @Path("/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns information about a specific file.", notes = "", response = OpenAIFile.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public Response retrieveFile( @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retrieveFile(fileId,securityContext);
    }
}
