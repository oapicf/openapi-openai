package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-26T05:16:14.314804265Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface ModerationsApiService {
      Response createModeration(CreateModerationRequest createModerationRequest,SecurityContext securityContext)
      throws NotFoundException;


}
