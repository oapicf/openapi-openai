package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.UsageResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UsageApi  {
    Future<ApiResponse<UsageResponse>> usageAudioSpeeches(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageAudioTranscriptions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageCodeInterpreterSessions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageCompletions(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageCosts(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageEmbeddings(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageImages(Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageModerations(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page);
    Future<ApiResponse<UsageResponse>> usageVectorStores(Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page);
}
