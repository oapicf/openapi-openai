package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-26T05:16:14.314804265Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface ModelsApiService {
      Response deleteModel(String model,SecurityContext securityContext)
      throws NotFoundException;
      Response listModels(SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveModel(String model,SecurityContext securityContext)
      throws NotFoundException;


}
