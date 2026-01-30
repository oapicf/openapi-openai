package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Invite
import org.openapitools.model.InviteDeleteResponse
import org.openapitools.model.InviteListResponse
import org.openapitools.model.InviteRequest

class InvitesApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteInvite ( String inviteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/invites/${invite_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (inviteId == null) {
            throw new RuntimeException("missing required params inviteId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    InviteDeleteResponse.class )

    }

    def inviteUser ( InviteRequest inviteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/invites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (inviteRequest == null) {
            throw new RuntimeException("missing required params inviteRequest")
        }



        contentType = 'application/json';
        bodyParams = inviteRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Invite.class )

    }

    def listInvites ( Integer limit, String after, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/invites"

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
                    InviteListResponse.class )

    }

    def retrieveInvite ( String inviteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/invites/${invite_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (inviteId == null) {
            throw new RuntimeException("missing required params inviteId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Invite.class )

    }

}
