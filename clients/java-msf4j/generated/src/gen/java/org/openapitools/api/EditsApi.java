package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EditsApiService;
import org.openapitools.api.factories.EditsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/edits")


@io.swagger.annotations.Api(description = "the edits API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EditsApi  {
   private final EditsApiService delegate = EditsApiServiceFactory.getEditsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", notes = "", response = CreateEditResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class) })
    public Response createEdit(@ApiParam(value = "" ,required=true) CreateEditRequest createEditRequest
)
    throws NotFoundException {
        return delegate.createEdit(createEditRequest);
    }
}
