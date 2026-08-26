package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.RealtimeSessionCreateRequest
import org.openapitools.model.RealtimeSessionCreateResponse

class RealtimeApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createRealtimeSession ( RealtimeSessionCreateRequest realtimeSessionCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/realtime/sessions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (realtimeSessionCreateRequest == null) {
            throw new RuntimeException("missing required params realtimeSessionCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = realtimeSessionCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    RealtimeSessionCreateResponse.class )

    }

}
