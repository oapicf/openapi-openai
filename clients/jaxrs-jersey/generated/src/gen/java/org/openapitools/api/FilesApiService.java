package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class FilesApiService {
    public abstract Response createFile(FormDataBodyPart _fileBodypart,String purpose,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFile(String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response downloadFile(String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFiles(String purpose,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveFile(String fileId,SecurityContext securityContext) throws NotFoundException;
}
