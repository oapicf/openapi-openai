package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface FineTunesApiService {
      Response cancelFineTune(String fineTuneId,SecurityContext securityContext)
      throws NotFoundException;
      Response createFineTune(CreateFineTuneRequest createFineTuneRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response listFineTuneEvents(String fineTuneId,Boolean stream,SecurityContext securityContext)
      throws NotFoundException;
      Response listFineTunes(SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveFineTune(String fineTuneId,SecurityContext securityContext)
      throws NotFoundException;
}
