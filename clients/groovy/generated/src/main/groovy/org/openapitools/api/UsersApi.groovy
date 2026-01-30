package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.User
import org.openapitools.model.UserDeleteResponse
import org.openapitools.model.UserListResponse
import org.openapitools.model.UserRoleUpdateRequest

class UsersApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteUser ( String userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    UserDeleteResponse.class )

    }

    def listUsers ( Integer limit, String after, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UserListResponse.class )

    }

    def modifyUser ( String userId, UserRoleUpdateRequest userRoleUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (userRoleUpdateRequest == null) {
            throw new RuntimeException("missing required params userRoleUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = userRoleUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    User.class )

    }

    def retrieveUser ( String userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    User.class )

    }

}
