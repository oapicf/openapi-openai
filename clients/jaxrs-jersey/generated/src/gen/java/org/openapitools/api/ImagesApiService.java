package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class ImagesApiService {
    public abstract Response createImage(CreateImageRequest createImageRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createImageEdit(FormDataBodyPart imageBodypart,String prompt,FormDataBodyPart maskBodypart,CreateImageEditRequestModel model,Integer n,String size,String responseFormat,String user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createImageVariation(FormDataBodyPart imageBodypart,CreateImageEditRequestModel model,Integer n,String responseFormat,String size,String user,SecurityContext securityContext) throws NotFoundException;
}
