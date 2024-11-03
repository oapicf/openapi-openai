package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-03T11:08:31.248726961Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface FineTuningApiService {
      public Response cancelFineTuningJob(String fineTuningJobId, SecurityContext securityContext);
      public Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest, SecurityContext securityContext);
      public Response listFineTuningEvents(String fineTuningJobId, String after, Integer limit, SecurityContext securityContext);
      public Response listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit, SecurityContext securityContext);
      public Response listPaginatedFineTuningJobs(String after, Integer limit, SecurityContext securityContext);
      public Response retrieveFineTuningJob(String fineTuningJobId, SecurityContext securityContext);
}
