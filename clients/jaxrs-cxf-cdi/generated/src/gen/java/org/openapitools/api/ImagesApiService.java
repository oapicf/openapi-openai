package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface ImagesApiService {
      public Response createImage(CreateImageRequest createImageRequest, SecurityContext securityContext);
      public Response createImageEdit(InputStream imageInputStream, Attachment imageDetail, String prompt, InputStream maskInputStream, Attachment maskDetail, Integer n, String size, String responseFormat, String user, SecurityContext securityContext);
      public Response createImageVariation(InputStream imageInputStream, Attachment imageDetail, Integer n, String size, String responseFormat, String user, SecurityContext securityContext);
}