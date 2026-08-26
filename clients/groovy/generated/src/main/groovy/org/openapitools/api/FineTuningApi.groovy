package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateFineTuningJobRequest
import org.openapitools.model.FineTuningJob
import org.openapitools.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.model.ListFineTuningJobEventsResponse
import org.openapitools.model.ListPaginatedFineTuningJobsResponse

class FineTuningApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def cancelFineTuningJob ( String fineTuningJobId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs/${fine_tuning_job_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (fineTuningJobId == null) {
            throw new RuntimeException("missing required params fineTuningJobId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    FineTuningJob.class )

    }

    def createFineTuningJob ( CreateFineTuningJobRequest createFineTuningJobRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createFineTuningJobRequest == null) {
            throw new RuntimeException("missing required params createFineTuningJobRequest")
        }



        contentType = 'application/json';
        bodyParams = createFineTuningJobRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    FineTuningJob.class )

    }

    def listFineTuningEvents ( String fineTuningJobId, String after, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs/${fine_tuning_job_id}/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (fineTuningJobId == null) {
            throw new RuntimeException("missing required params fineTuningJobId")
        }

        if (after != null) {
            queryParams.put("after", after)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ListFineTuningJobEventsResponse.class )

    }

    def listFineTuningJobCheckpoints ( String fineTuningJobId, String after, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs/${fine_tuning_job_id}/checkpoints"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (fineTuningJobId == null) {
            throw new RuntimeException("missing required params fineTuningJobId")
        }

        if (after != null) {
            queryParams.put("after", after)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ListFineTuningJobCheckpointsResponse.class )

    }

    def listPaginatedFineTuningJobs ( String after, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (after != null) {
            queryParams.put("after", after)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ListPaginatedFineTuningJobsResponse.class )

    }

    def retrieveFineTuningJob ( String fineTuningJobId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine_tuning/jobs/${fine_tuning_job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (fineTuningJobId == null) {
            throw new RuntimeException("missing required params fineTuningJobId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FineTuningJob.class )

    }

}
