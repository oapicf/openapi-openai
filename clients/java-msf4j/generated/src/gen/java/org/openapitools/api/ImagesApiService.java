package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class ImagesApiService {
    public abstract Response createImage(CreateImageRequest createImageRequest
 ) throws NotFoundException;
    public abstract Response createImageEdit(InputStream imageInputStream, FileInfo imageDetail
 ,String prompt
 ,InputStream maskInputStream, FileInfo maskDetail
 ,CreateImageEditRequestModel model
 ,Integer n
 ,String size
 ,String responseFormat
 ,String user
 ) throws NotFoundException;
    public abstract Response createImageVariation(InputStream imageInputStream, FileInfo imageDetail
 ,CreateImageEditRequestModel model
 ,Integer n
 ,String responseFormat
 ,String size
 ,String user
 ) throws NotFoundException;
}
