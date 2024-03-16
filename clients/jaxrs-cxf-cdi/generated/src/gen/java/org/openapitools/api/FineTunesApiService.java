package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface FineTunesApiService {
      public Response cancelFineTune(String fineTuneId, SecurityContext securityContext);
      public Response createFineTune(CreateFineTuneRequest createFineTuneRequest, SecurityContext securityContext);
      public Response listFineTuneEvents(String fineTuneId, Boolean stream, SecurityContext securityContext);
      public Response listFineTunes(SecurityContext securityContext);
      public Response retrieveFineTune(String fineTuneId, SecurityContext securityContext);
}
