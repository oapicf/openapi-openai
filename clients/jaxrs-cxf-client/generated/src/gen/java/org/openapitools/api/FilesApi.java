package org.openapitools.api;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/files")
@Api(value = "/", description = "")
public interface FilesApi  {

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     */
    @POST
    
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public OpenAIFile createFile( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "purpose")  String purpose);

    /**
     * Delete a file.
     *
     */
    @DELETE
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public DeleteFileResponse deleteFile(@PathParam("file_id") String fileId);

    /**
     * Returns the contents of the specified file.
     *
     */
    @GET
    @Path("/{file_id}/content")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String downloadFile(@PathParam("file_id") String fileId);

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public ListFilesResponse listFiles(@QueryParam("purpose") String purpose);

    /**
     * Returns information about a specific file.
     *
     */
    @GET
    @Path("/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public OpenAIFile retrieveFile(@PathParam("file_id") String fileId);
}
