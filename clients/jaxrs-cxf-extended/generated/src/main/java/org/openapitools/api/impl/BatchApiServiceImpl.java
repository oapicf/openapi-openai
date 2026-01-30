package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

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
public class BatchApiServiceImpl implements BatchApi {
    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     *
     */
    @Override
    public Batch cancelBatch(String batchId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     *
     */
    @Override
    public Batch createBatch(CreateBatchRequest createBatchRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * List your organization&#39;s batches.
     *
     */
    @Override
    public ListBatchesResponse listBatches(String after, Integer limit) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves a batch.
     *
     */
    @Override
    public Batch retrieveBatch(String batchId) {
        // TODO: Implement...
        return null;
    }

}
