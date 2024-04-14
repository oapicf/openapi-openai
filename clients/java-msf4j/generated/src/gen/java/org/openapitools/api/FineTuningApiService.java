package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class FineTuningApiService {
    public abstract Response cancelFineTuningJob(String fineTuningJobId
 ) throws NotFoundException;
    public abstract Response createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest
 ) throws NotFoundException;
    public abstract Response listFineTuningEvents(String fineTuningJobId
 ,String after
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response listFineTuningJobCheckpoints(String fineTuningJobId
 ,String after
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response listPaginatedFineTuningJobs(String after
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response retrieveFineTuningJob(String fineTuningJobId
 ) throws NotFoundException;
}
