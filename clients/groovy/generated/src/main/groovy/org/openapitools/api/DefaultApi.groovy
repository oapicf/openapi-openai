package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdminApiKey
import org.openapitools.model.AdminApiKeysCreateRequest
import org.openapitools.model.AdminApiKeysDelete200Response
import org.openapitools.model.ApiKeyList

class DefaultApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adminApiKeysCreate ( AdminApiKeysCreateRequest adminApiKeysCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/admin_api_keys"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adminApiKeysCreateRequest == null) {
            throw new RuntimeException("missing required params adminApiKeysCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = adminApiKeysCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdminApiKey.class )

    }

    def adminApiKeysDelete ( String keyId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/admin_api_keys/${key_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (keyId == null) {
            throw new RuntimeException("missing required params keyId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    AdminApiKeysDelete200Response.class )

    }

    def adminApiKeysGet ( String keyId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/admin_api_keys/${key_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (keyId == null) {
            throw new RuntimeException("missing required params keyId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdminApiKey.class )

    }

    def adminApiKeysList ( String after, String order, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/admin_api_keys"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (after != null) {
            queryParams.put("after", after)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ApiKeyList.class )

    }

}
