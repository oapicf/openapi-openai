package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningApiServiceImpl implements FineTuningApiService {
      @Override
      public Response cancelFineTuningJob(String fineTuningJobId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response listFineTuningEvents(String fineTuningJobId, String after, Integer limit, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response listPaginatedFineTuningJobs(String after, Integer limit, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response retrieveFineTuningJob(String fineTuningJobId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
