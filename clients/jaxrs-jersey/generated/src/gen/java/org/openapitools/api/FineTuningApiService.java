package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class FineTuningApiService {
    public abstract Response cancelFineTuningJob(String fineTuningJobId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFineTuningEvents(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFineTuningJobCheckpoints(String fineTuningJobId,String after,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listPaginatedFineTuningJobs(String after,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveFineTuningJob(String fineTuningJobId,SecurityContext securityContext) throws NotFoundException;
}
