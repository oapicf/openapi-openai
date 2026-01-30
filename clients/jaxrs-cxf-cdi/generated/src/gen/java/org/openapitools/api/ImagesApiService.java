package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface ImagesApiService {
      public Response createImage(CreateImageRequest createImageRequest, SecurityContext securityContext);
      public Response createImageEdit(Attachment imageDetail, String prompt, Attachment maskDetail, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, SecurityContext securityContext);
      public Response createImageVariation(Attachment imageDetail, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, SecurityContext securityContext);
}
