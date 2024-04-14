package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateImageEditRequestModel
import org.openapitools.model.CreateImageRequest
import org.openapitools.model.ImagesResponse

class ImagesApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createImage ( CreateImageRequest createImageRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/generations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createImageRequest == null) {
            throw new RuntimeException("missing required params createImageRequest")
        }



        contentType = 'application/json';
        bodyParams = createImageRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

    def createImageEdit ( File image, String prompt, File mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/edits"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (image == null) {
            throw new RuntimeException("missing required params image")
        }
        // verify required params are set
        if (prompt == null) {
            throw new RuntimeException("missing required params prompt")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("image", image)
        bodyParams.put("prompt", prompt)
        bodyParams.put("mask", mask)
        bodyParams.put("model", model)
        bodyParams.put("n", n)
        bodyParams.put("size", size)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("user", user)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

    def createImageVariation ( File image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/variations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (image == null) {
            throw new RuntimeException("missing required params image")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("image", image)
        bodyParams.put("model", model)
        bodyParams.put("n", n)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("size", size)
        bodyParams.put("user", user)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

}
