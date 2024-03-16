package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImagesApiServiceImpl implements ImagesApiService {
      @Override
      public Response createImage(CreateImageRequest createImageRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createImageEdit(InputStream imageInputStream, Attachment imageDetail, String prompt, InputStream maskInputStream, Attachment maskDetail, Integer n, String size, String responseFormat, String user, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createImageVariation(InputStream imageInputStream, Attachment imageDetail, Integer n, String size, String responseFormat, String user, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
