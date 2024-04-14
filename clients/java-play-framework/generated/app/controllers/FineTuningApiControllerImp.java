package controllers;

import apimodels.CreateFineTuningJobRequest;
import apimodels.FineTuningJob;
import apimodels.ListFineTuningJobCheckpointsResponse;
import apimodels.ListFineTuningJobEventsResponse;
import apimodels.ListPaginatedFineTuningJobsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTuningApiControllerImp extends FineTuningApiControllerImpInterface {
    @Override
    public FineTuningJob cancelFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception {
        //Do your magic!!!
        return new FineTuningJob();
    }

    @Override
    public FineTuningJob createFineTuningJob(Http.Request request, CreateFineTuningJobRequest createFineTuningJobRequest) throws Exception {
        //Do your magic!!!
        return new FineTuningJob();
    }

    @Override
    public ListFineTuningJobEventsResponse listFineTuningEvents(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception {
        //Do your magic!!!
        return new ListFineTuningJobEventsResponse();
    }

    @Override
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception {
        //Do your magic!!!
        return new ListFineTuningJobCheckpointsResponse();
    }

    @Override
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(Http.Request request, String after, Integer limit) throws Exception {
        //Do your magic!!!
        return new ListPaginatedFineTuningJobsResponse();
    }

    @Override
    public FineTuningJob retrieveFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception {
        //Do your magic!!!
        return new FineTuningJob();
    }

}
