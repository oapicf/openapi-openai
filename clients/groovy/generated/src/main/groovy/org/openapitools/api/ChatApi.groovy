package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateChatCompletionRequest
import org.openapitools.model.CreateChatCompletionResponse

class ChatApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createChatCompletion ( CreateChatCompletionRequest createChatCompletionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chat/completions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createChatCompletionRequest == null) {
            throw new RuntimeException("missing required params createChatCompletionRequest")
        }



        contentType = 'application/json';
        bodyParams = createChatCompletionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateChatCompletionResponse.class )

    }

}
