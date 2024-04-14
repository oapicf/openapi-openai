package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateFineTuningJobRequest;
import org.openapitools.server.api.model.FineTuningJob;
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse;
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.server.api.MainApiException;

public final class FineTuningApiException extends MainApiException {
    public FineTuningApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final FineTuningApiException FineTuning_cancelFineTuningJob_200_Exception = new FineTuningApiException(200, "OK");
    public static final FineTuningApiException FineTuning_createFineTuningJob_200_Exception = new FineTuningApiException(200, "OK");
    public static final FineTuningApiException FineTuning_listFineTuningEvents_200_Exception = new FineTuningApiException(200, "OK");
    public static final FineTuningApiException FineTuning_listFineTuningJobCheckpoints_200_Exception = new FineTuningApiException(200, "OK");
    public static final FineTuningApiException FineTuning_listPaginatedFineTuningJobs_200_Exception = new FineTuningApiException(200, "OK");
    public static final FineTuningApiException FineTuning_retrieveFineTuningJob_200_Exception = new FineTuningApiException(200, "OK");
    

}