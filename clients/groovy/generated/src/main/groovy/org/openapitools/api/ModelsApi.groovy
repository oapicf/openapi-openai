package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeleteModelResponse
import org.openapitools.model.ListModelsResponse
import org.openapitools.model.Model

class ModelsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteModel ( String model, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${model}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    DeleteModelResponse.class )

    }

    def listModels ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ListModelsResponse.class )

    }

    def retrieveModel ( String model, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${model}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Model.class )

    }

}
