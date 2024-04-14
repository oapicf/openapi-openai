package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateEmbeddingRequest
import org.openapitools.model.CreateEmbeddingResponse

class EmbeddingsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createEmbedding ( CreateEmbeddingRequest createEmbeddingRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/embeddings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createEmbeddingRequest == null) {
            throw new RuntimeException("missing required params createEmbeddingRequest")
        }



        contentType = 'application/json';
        bodyParams = createEmbeddingRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateEmbeddingResponse.class )

    }

}
