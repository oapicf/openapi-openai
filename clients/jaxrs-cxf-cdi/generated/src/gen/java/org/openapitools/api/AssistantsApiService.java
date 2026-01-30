package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface AssistantsApiService {
      public Response createAssistant(CreateAssistantRequest createAssistantRequest, SecurityContext securityContext);
      public Response deleteAssistant(String assistantId, SecurityContext securityContext);
      public Response getAssistant(String assistantId, SecurityContext securityContext);
      public Response listAssistants(Integer limit, String order, String after, String before, SecurityContext securityContext);
      public Response modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest, SecurityContext securityContext);
}
