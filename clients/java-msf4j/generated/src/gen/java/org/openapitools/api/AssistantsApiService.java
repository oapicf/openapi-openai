package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class AssistantsApiService {
    public abstract Response createAssistant(CreateAssistantRequest createAssistantRequest
 ) throws NotFoundException;
    public abstract Response createAssistantFile(String assistantId
 ,CreateAssistantFileRequest createAssistantFileRequest
 ) throws NotFoundException;
    public abstract Response deleteAssistant(String assistantId
 ) throws NotFoundException;
    public abstract Response deleteAssistantFile(String assistantId
 ,String fileId
 ) throws NotFoundException;
    public abstract Response getAssistant(String assistantId
 ) throws NotFoundException;
    public abstract Response getAssistantFile(String assistantId
 ,String fileId
 ) throws NotFoundException;
    public abstract Response listAssistantFiles(String assistantId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response listAssistants(Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response modifyAssistant(String assistantId
 ,ModifyAssistantRequest modifyAssistantRequest
 ) throws NotFoundException;
}
