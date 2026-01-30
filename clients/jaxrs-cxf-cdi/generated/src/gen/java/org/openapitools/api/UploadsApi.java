package org.openapitools.api;

import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;
import org.openapitools.api.UploadsApiService;

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
@Path("/uploads")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class UploadsApi  {

  @Context SecurityContext securityContext;

  @Inject UploadsApiService delegate;


    @POST
    @Path("/{upload_id}/parts")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ", notes = "", response = UploadPart.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UploadPart.class) })
    public Response addUploadPart(@ApiParam(value = "The ID of the Upload. ",required=true) @PathParam("upload_id") String uploadId,  @Multipart(value = "data" ) Attachment dataDetail) {
        return delegate.addUploadPart(uploadId, dataDetail, securityContext);
    }

    @POST
    @Path("/{upload_id}/cancel")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels the Upload. No Parts may be added after an Upload is cancelled. ", notes = "", response = Upload.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Upload.class) })
    public Response cancelUpload(@ApiParam(value = "The ID of the Upload. ",required=true) @PathParam("upload_id") String uploadId) {
        return delegate.cancelUpload(uploadId, securityContext);
    }

    @POST
    @Path("/{upload_id}/complete")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ", notes = "", response = Upload.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Upload.class) })
    public Response completeUpload(@ApiParam(value = "The ID of the Upload. ",required=true) @PathParam("upload_id") String uploadId, @ApiParam(value = "" ,required=true) CompleteUploadRequest completeUploadRequest) {
        return delegate.completeUpload(uploadId, completeUploadRequest, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ", notes = "", response = Upload.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Upload.class) })
    public Response createUpload(@ApiParam(value = "" ,required=true) CreateUploadRequest createUploadRequest) {
        return delegate.createUpload(createUploadRequest, securityContext);
    }
}
