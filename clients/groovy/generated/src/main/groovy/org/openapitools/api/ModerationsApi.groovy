package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateModerationRequest
import org.openapitools.model.CreateModerationResponse

class ModerationsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createModeration ( CreateModerationRequest createModerationRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/moderations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createModerationRequest == null) {
            throw new RuntimeException("missing required params createModerationRequest")
        }



        contentType = 'application/json';
        bodyParams = createModerationRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateModerationResponse.class )

    }

}
