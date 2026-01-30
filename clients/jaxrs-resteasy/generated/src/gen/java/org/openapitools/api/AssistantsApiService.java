package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface AssistantsApiService {
      Response createAssistant(CreateAssistantRequest createAssistantRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAssistant(String assistantId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAssistant(String assistantId,SecurityContext securityContext)
      throws NotFoundException;
      Response listAssistants(Integer limit,String order,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyAssistant(String assistantId,ModifyAssistantRequest modifyAssistantRequest,SecurityContext securityContext)
      throws NotFoundException;


}
