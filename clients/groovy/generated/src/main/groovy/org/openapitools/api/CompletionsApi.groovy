package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateCompletionRequest
import org.openapitools.model.CreateCompletionResponse

class CompletionsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createCompletion ( CreateCompletionRequest createCompletionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/completions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createCompletionRequest == null) {
            throw new RuntimeException("missing required params createCompletionRequest")
        }



        contentType = 'application/json';
        bodyParams = createCompletionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateCompletionResponse.class )

    }

}
