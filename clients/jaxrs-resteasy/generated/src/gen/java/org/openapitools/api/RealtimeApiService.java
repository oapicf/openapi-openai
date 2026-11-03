package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-03T06:34:07.738556030Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface RealtimeApiService {
      Response createRealtimeSession(RealtimeSessionCreateRequest realtimeSessionCreateRequest,SecurityContext securityContext)
      throws NotFoundException;


}
