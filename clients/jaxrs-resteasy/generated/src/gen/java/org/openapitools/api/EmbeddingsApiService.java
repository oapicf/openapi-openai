package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface EmbeddingsApiService {
      Response createEmbedding(CreateEmbeddingRequest createEmbeddingRequest,SecurityContext securityContext)
      throws NotFoundException;
}
