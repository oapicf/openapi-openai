package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class AssistantsApiService {
    public abstract Response createAssistant(CreateAssistantRequest createAssistantRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAssistant(String assistantId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAssistant(String assistantId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAssistants(Integer limit,String order,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyAssistant(String assistantId,ModifyAssistantRequest modifyAssistantRequest,SecurityContext securityContext) throws NotFoundException;
}
