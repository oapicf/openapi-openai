package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ChatApiService {
      Response createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest,SecurityContext securityContext)
      throws NotFoundException;
}
