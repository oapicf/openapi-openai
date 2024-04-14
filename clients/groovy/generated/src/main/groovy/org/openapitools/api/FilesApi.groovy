package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeleteFileResponse
import org.openapitools.model.ListFilesResponse
import org.openapitools.model.OpenAIFile

class FilesApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createFile ( File _file, String purpose, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (_file == null) {
            throw new RuntimeException("missing required params _file")
        }
        // verify required params are set
        if (purpose == null) {
            throw new RuntimeException("missing required params purpose")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("file", _file)
        bodyParams.put("purpose", purpose)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    OpenAIFile.class )

    }

    def deleteFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteFileResponse.class )

    }

    def downloadFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}/content"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def listFiles ( String purpose, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (purpose != null) {
            queryParams.put("purpose", purpose)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListFilesResponse.class )

    }

    def retrieveFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    OpenAIFile.class )

    }

}
