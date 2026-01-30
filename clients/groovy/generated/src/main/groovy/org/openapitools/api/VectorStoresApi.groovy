package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateVectorStoreFileBatchRequest
import org.openapitools.model.CreateVectorStoreFileRequest
import org.openapitools.model.CreateVectorStoreRequest
import org.openapitools.model.DeleteVectorStoreFileResponse
import org.openapitools.model.DeleteVectorStoreResponse
import org.openapitools.model.ListVectorStoreFilesResponse
import org.openapitools.model.ListVectorStoresResponse
import org.openapitools.model.UpdateVectorStoreRequest
import org.openapitools.model.VectorStoreFileBatchObject
import org.openapitools.model.VectorStoreFileObject
import org.openapitools.model.VectorStoreObject

class VectorStoresApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def cancelVectorStoreFileBatch ( String vectorStoreId, String batchId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/file_batches/${batch_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    VectorStoreFileBatchObject.class )

    }

    def createVectorStore ( CreateVectorStoreRequest createVectorStoreRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createVectorStoreRequest == null) {
            throw new RuntimeException("missing required params createVectorStoreRequest")
        }



        contentType = 'application/json';
        bodyParams = createVectorStoreRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    VectorStoreObject.class )

    }

    def createVectorStoreFile ( String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (createVectorStoreFileRequest == null) {
            throw new RuntimeException("missing required params createVectorStoreFileRequest")
        }



        contentType = 'application/json';
        bodyParams = createVectorStoreFileRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    VectorStoreFileObject.class )

    }

    def createVectorStoreFileBatch ( String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/file_batches"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (createVectorStoreFileBatchRequest == null) {
            throw new RuntimeException("missing required params createVectorStoreFileBatchRequest")
        }



        contentType = 'application/json';
        bodyParams = createVectorStoreFileBatchRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    VectorStoreFileBatchObject.class )

    }

    def deleteVectorStore ( String vectorStoreId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteVectorStoreResponse.class )

    }

    def deleteVectorStoreFile ( String vectorStoreId, String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteVectorStoreFileResponse.class )

    }

    def getVectorStore ( String vectorStoreId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    VectorStoreObject.class )

    }

    def getVectorStoreFile ( String vectorStoreId, String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    VectorStoreFileObject.class )

    }

    def getVectorStoreFileBatch ( String vectorStoreId, String batchId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/file_batches/${batch_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    VectorStoreFileBatchObject.class )

    }

    def listFilesInVectorStoreBatch ( String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/file_batches/${batch_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (batchId == null) {
            throw new RuntimeException("missing required params batchId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }
        if (filter != null) {
            queryParams.put("filter", filter)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListVectorStoreFilesResponse.class )

    }

    def listVectorStoreFiles ( String vectorStoreId, Integer limit, String order, String after, String before, String filter, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }
        if (filter != null) {
            queryParams.put("filter", filter)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListVectorStoreFilesResponse.class )

    }

    def listVectorStores ( Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListVectorStoresResponse.class )

    }

    def modifyVectorStore ( String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/vector_stores/${vector_store_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (vectorStoreId == null) {
            throw new RuntimeException("missing required params vectorStoreId")
        }
        // verify required params are set
        if (updateVectorStoreRequest == null) {
            throw new RuntimeException("missing required params updateVectorStoreRequest")
        }



        contentType = 'application/json';
        bodyParams = updateVectorStoreRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    VectorStoreObject.class )

    }

}
