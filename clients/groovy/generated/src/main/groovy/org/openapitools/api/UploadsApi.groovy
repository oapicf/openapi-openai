package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CompleteUploadRequest
import org.openapitools.model.CreateUploadRequest
import org.openapitools.model.Upload
import org.openapitools.model.UploadPart

class UploadsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addUploadPart ( String uploadId, File data, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uploads/${upload_id}/parts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadId == null) {
            throw new RuntimeException("missing required params uploadId")
        }
        // verify required params are set
        if (data == null) {
            throw new RuntimeException("missing required params data")
        }




        contentType = 'multipart/form-data';
        bodyParams = data

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UploadPart.class )

    }

    def cancelUpload ( String uploadId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uploads/${upload_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadId == null) {
            throw new RuntimeException("missing required params uploadId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Upload.class )

    }

    def completeUpload ( String uploadId, CompleteUploadRequest completeUploadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uploads/${upload_id}/complete"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uploadId == null) {
            throw new RuntimeException("missing required params uploadId")
        }
        // verify required params are set
        if (completeUploadRequest == null) {
            throw new RuntimeException("missing required params completeUploadRequest")
        }



        contentType = 'application/json';
        bodyParams = completeUploadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Upload.class )

    }

    def createUpload ( CreateUploadRequest createUploadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/uploads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createUploadRequest == null) {
            throw new RuntimeException("missing required params createUploadRequest")
        }



        contentType = 'application/json';
        bodyParams = createUploadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Upload.class )

    }

}
