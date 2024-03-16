package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class ImagesApiService {
    public abstract Response createImage(CreateImageRequest createImageRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createImageEdit(FormDataBodyPart imageBodypart,String prompt,FormDataBodyPart maskBodypart,Integer n,String size,String responseFormat,String user,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createImageVariation(FormDataBodyPart imageBodypart,Integer n,String size,String responseFormat,String user,SecurityContext securityContext) throws NotFoundException;
}
