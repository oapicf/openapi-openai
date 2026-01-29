package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AssistantFileObject;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantFileRequest;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.DeleteAssistantFileResponse;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.ListAssistantFilesResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ModifyAssistantRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class AssistantsApiService {
    public abstract Response createAssistant(CreateAssistantRequest createAssistantRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createAssistantFile(String assistantId,CreateAssistantFileRequest createAssistantFileRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAssistant(String assistantId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAssistantFile(String assistantId,String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAssistant(String assistantId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAssistantFile(String assistantId,String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAssistantFiles(String assistantId,Integer limit,String order,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAssistants(Integer limit,String order,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyAssistant(String assistantId,ModifyAssistantRequest modifyAssistantRequest,SecurityContext securityContext) throws NotFoundException;
}
