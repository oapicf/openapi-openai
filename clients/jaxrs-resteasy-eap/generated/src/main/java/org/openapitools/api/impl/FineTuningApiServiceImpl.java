package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T11:08:59.005260670Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FineTuningApiServiceImpl implements FineTuningApi {
      public Response cancelFineTuningJob(String fineTuningJobId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listFineTuningEvents(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listFineTuningJobCheckpoints(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listPaginatedFineTuningJobs(String after,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveFineTuningJob(String fineTuningJobId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
