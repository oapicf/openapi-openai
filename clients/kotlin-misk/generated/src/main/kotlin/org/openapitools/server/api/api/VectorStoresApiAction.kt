package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.CreateVectorStoreFileBatchRequest
import org.openapitools.server.api.model.CreateVectorStoreFileRequest
import org.openapitools.server.api.model.CreateVectorStoreRequest
import org.openapitools.server.api.model.DeleteVectorStoreFileResponse
import org.openapitools.server.api.model.DeleteVectorStoreResponse
import org.openapitools.server.api.model.ListVectorStoreFilesResponse
import org.openapitools.server.api.model.ListVectorStoresResponse
import org.openapitools.server.api.model.UpdateVectorStoreRequest
import org.openapitools.server.api.model.VectorStoreFileBatchObject
import org.openapitools.server.api.model.VectorStoreFileObject
import org.openapitools.server.api.model.VectorStoreObject

/**
* @TODO("Fill out implementation")
*/
@Singleton
class VectorStoresApiAction @Inject constructor(
) : WebAction {

    @Post("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel")
    @Description("Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelVectorStoreFileBatch(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @PathParam("batch_id") batchId: kotlin.String
    ): VectorStoreFileBatchObject {
        TODO()
    }

    @Post("/vector_stores")
    @Description("Create a vector store.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createVectorStore(
        @Valid @RequestBody createVectorStoreRequest: CreateVectorStoreRequest
    ): VectorStoreObject {
        TODO()
    }

    @Post("/vector_stores/{vector_store_id}/files")
    @Description("Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createVectorStoreFile(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @Valid @RequestBody createVectorStoreFileRequest: CreateVectorStoreFileRequest
    ): VectorStoreFileObject {
        TODO()
    }

    @Post("/vector_stores/{vector_store_id}/file_batches")
    @Description("Create a vector store file batch.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createVectorStoreFileBatch(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @Valid @RequestBody createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest
    ): VectorStoreFileBatchObject {
        TODO()
    }

    @Delete("/vector_stores/{vector_store_id}")
    @Description("Delete a vector store.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteVectorStore(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String
    ): DeleteVectorStoreResponse {
        TODO()
    }

    @Delete("/vector_stores/{vector_store_id}/files/{file_id}")
    @Description("Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteVectorStoreFile(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @PathParam("file_id") fileId: kotlin.String
    ): DeleteVectorStoreFileResponse {
        TODO()
    }

    @Get("/vector_stores/{vector_store_id}")
    @Description("Retrieves a vector store.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getVectorStore(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String
    ): VectorStoreObject {
        TODO()
    }

    @Get("/vector_stores/{vector_store_id}/files/{file_id}")
    @Description("Retrieves a vector store file.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getVectorStoreFile(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @PathParam("file_id") fileId: kotlin.String
    ): VectorStoreFileObject {
        TODO()
    }

    @Get("/vector_stores/{vector_store_id}/file_batches/{batch_id}")
    @Description("Retrieves a vector store file batch.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getVectorStoreFileBatch(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @PathParam("batch_id") batchId: kotlin.String
    ): VectorStoreFileBatchObject {
        TODO()
    }

    @Get("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files")
    @Description("Returns a list of vector store files in a batch.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listFilesInVectorStoreBatch(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @PathParam("batch_id") batchId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?, 
         @QueryParam(value = "filter") filter: kotlin.String?
    ): ListVectorStoreFilesResponse {
        TODO()
    }

    @Get("/vector_stores/{vector_store_id}/files")
    @Description("Returns a list of vector store files.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listVectorStoreFiles(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?, 
         @QueryParam(value = "filter") filter: kotlin.String?
    ): ListVectorStoreFilesResponse {
        TODO()
    }

    @Get("/vector_stores")
    @Description("Returns a list of vector stores.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listVectorStores(
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?
    ): ListVectorStoresResponse {
        TODO()
    }

    @Post("/vector_stores/{vector_store_id}")
    @Description("Modifies a vector store.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyVectorStore(
        @PathParam("vector_store_id") vectorStoreId: kotlin.String, 
        @Valid @RequestBody updateVectorStoreRequest: UpdateVectorStoreRequest
    ): VectorStoreObject {
        TODO()
    }
}
