package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class EmbeddingsApiServiceImpl extends EmbeddingsApiService {
    @Override
    public Response createEmbedding(CreateEmbeddingRequest createEmbeddingRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
