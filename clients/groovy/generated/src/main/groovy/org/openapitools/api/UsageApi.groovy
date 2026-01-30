package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.UsageResponse

class UsageApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def usageAudioSpeeches ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/audio_speeches"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageAudioTranscriptions ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/audio_transcriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageCodeInterpreterSessions ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/code_interpreter_sessions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageCompletions ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/completions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (batch != null) {
            queryParams.put("batch", batch)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageCosts ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/costs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageEmbeddings ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/embeddings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageImages ( Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/images"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (sources != null) {
            queryParams.put("sources", sources)
        }
        if (sizes != null) {
            queryParams.put("sizes", sizes)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageModerations ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/moderations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (userIds != null) {
            queryParams.put("user_ids", userIds)
        }
        if (apiKeyIds != null) {
            queryParams.put("api_key_ids", apiKeyIds)
        }
        if (models != null) {
            queryParams.put("models", models)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

    def usageVectorStores ( Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/usage/vector_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startTime == null) {
            throw new RuntimeException("missing required params startTime")
        }

        if (startTime != null) {
            queryParams.put("start_time", startTime)
        }
        if (endTime != null) {
            queryParams.put("end_time", endTime)
        }
        if (bucketWidth != null) {
            queryParams.put("bucket_width", bucketWidth)
        }
        if (projectIds != null) {
            queryParams.put("project_ids", projectIds)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UsageResponse.class )

    }

}
