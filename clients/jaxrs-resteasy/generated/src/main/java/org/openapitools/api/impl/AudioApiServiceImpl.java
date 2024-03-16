package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudioApiServiceImpl implements AudioApiService {
      public Response createTranscription(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createTranslation(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
