package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ModerationsApiService;
import org.openapitools.api.factories.ModerationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/moderations")


@io.swagger.annotations.Api(description = "the moderations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ModerationsApi  {
   private final ModerationsApiService delegate = ModerationsApiServiceFactory.getModerationsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Classifies if text violates OpenAI's Content Policy", notes = "", response = CreateModerationResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    public Response createModeration(@ApiParam(value = "" ,required=true) CreateModerationRequest createModerationRequest
)
    throws NotFoundException {
        return delegate.createModeration(createModerationRequest);
    }
}
