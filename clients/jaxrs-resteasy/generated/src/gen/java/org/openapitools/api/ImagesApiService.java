package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface ImagesApiService {
      Response createImage(CreateImageRequest createImageRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createImageEdit(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;
      Response createImageVariation(MultipartFormDataInput input,SecurityContext securityContext)
      throws NotFoundException;
}
