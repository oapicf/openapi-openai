package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class FineTuningApiServiceImpl implements FineTuningApi {
    /**
     * Immediately cancel a fine-tune job. 
     *
     */
    public FineTuningJob cancelFineTuningJob(String fineTuningJobId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    public FineTuningJob createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get status updates for a fine-tuning job. 
     *
     */
    public ListFineTuningJobEventsResponse listFineTuningEvents(String fineTuningJobId, String after, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * List checkpoints for a fine-tuning job. 
     *
     */
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     */
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(String after, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    public FineTuningJob retrieveFineTuningJob(String fineTuningJobId) {
        // TODO: Implement...

        return null;
    }

}
