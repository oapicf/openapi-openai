package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Batch
import org.openapitools.model.CreateBatchRequest
import org.openapitools.model.ListBatchesResponse

class BatchApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def cancelBatch ( String batchId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/batches/${batch_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Batch.class )

    }

    def createBatch ( CreateBatchRequest createBatchRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/batches"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createBatchRequest == null) {
            throw new RuntimeException("missing required params createBatchRequest")
        }



        contentType = 'application/json';
        bodyParams = createBatchRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Batch.class )

    }

    def listBatches ( String after, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/batches"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (after != null) {
            queryParams.put("after", after)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListBatchesResponse.class )

    }

    def retrieveBatch ( String batchId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/batches/${batch_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Batch.class )

    }

}
