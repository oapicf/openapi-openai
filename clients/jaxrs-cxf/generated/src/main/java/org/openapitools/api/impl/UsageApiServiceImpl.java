package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.UsageResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class UsageApiServiceImpl implements UsageApi {
    /**
     * Get audio speeches usage details for the organization.
     *
     */
    public UsageResponse usageAudioSpeeches(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get audio transcriptions usage details for the organization.
     *
     */
    public UsageResponse usageAudioTranscriptions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     *
     */
    public UsageResponse usageCodeInterpreterSessions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get completions usage details for the organization.
     *
     */
    public UsageResponse usageCompletions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get costs details for the organization.
     *
     */
    public UsageResponse usageCosts(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get embeddings usage details for the organization.
     *
     */
    public UsageResponse usageEmbeddings(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get images usage details for the organization.
     *
     */
    public UsageResponse usageImages(Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get moderations usage details for the organization.
     *
     */
    public UsageResponse usageModerations(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get vector stores usage details for the organization.
     *
     */
    public UsageResponse usageVectorStores(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) {
        // TODO: Implement...

        return null;
    }

}
