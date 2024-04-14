package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-04-14T13:41:51.736364282Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface FineTuningApiService {
      Response cancelFineTuningJob(String fineTuningJobId,SecurityContext securityContext)
      throws NotFoundException;
      Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response listFineTuningEvents(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response listFineTuningJobCheckpoints(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response listPaginatedFineTuningJobs(String after,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveFineTuningJob(String fineTuningJobId,SecurityContext securityContext)
      throws NotFoundException;
}
