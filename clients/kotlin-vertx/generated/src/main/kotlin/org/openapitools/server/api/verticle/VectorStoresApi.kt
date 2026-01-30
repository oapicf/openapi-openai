package org.openapitools.server.api.verticle

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
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface VectorStoresApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* cancelVectorStoreFileBatch
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. */
    suspend fun cancelVectorStoreFileBatch(vectorStoreId:kotlin.String?,batchId:kotlin.String?,context:OperationRequest):Response<VectorStoreFileBatchObject>
    /* createVectorStore
     * Create a vector store. */
    suspend fun createVectorStore(createVectorStoreRequest:CreateVectorStoreRequest?,context:OperationRequest):Response<VectorStoreObject>
    /* createVectorStoreFile
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). */
    suspend fun createVectorStoreFile(vectorStoreId:kotlin.String?,createVectorStoreFileRequest:CreateVectorStoreFileRequest?,context:OperationRequest):Response<VectorStoreFileObject>
    /* createVectorStoreFileBatch
     * Create a vector store file batch. */
    suspend fun createVectorStoreFileBatch(vectorStoreId:kotlin.String?,createVectorStoreFileBatchRequest:CreateVectorStoreFileBatchRequest?,context:OperationRequest):Response<VectorStoreFileBatchObject>
    /* deleteVectorStore
     * Delete a vector store. */
    suspend fun deleteVectorStore(vectorStoreId:kotlin.String?,context:OperationRequest):Response<DeleteVectorStoreResponse>
    /* deleteVectorStoreFile
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. */
    suspend fun deleteVectorStoreFile(vectorStoreId:kotlin.String?,fileId:kotlin.String?,context:OperationRequest):Response<DeleteVectorStoreFileResponse>
    /* getVectorStore
     * Retrieves a vector store. */
    suspend fun getVectorStore(vectorStoreId:kotlin.String?,context:OperationRequest):Response<VectorStoreObject>
    /* getVectorStoreFile
     * Retrieves a vector store file. */
    suspend fun getVectorStoreFile(vectorStoreId:kotlin.String?,fileId:kotlin.String?,context:OperationRequest):Response<VectorStoreFileObject>
    /* getVectorStoreFileBatch
     * Retrieves a vector store file batch. */
    suspend fun getVectorStoreFileBatch(vectorStoreId:kotlin.String?,batchId:kotlin.String?,context:OperationRequest):Response<VectorStoreFileBatchObject>
    /* listFilesInVectorStoreBatch
     * Returns a list of vector store files in a batch. */
    suspend fun listFilesInVectorStoreBatch(vectorStoreId:kotlin.String?,batchId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,filter:kotlin.String?,context:OperationRequest):Response<ListVectorStoreFilesResponse>
    /* listVectorStoreFiles
     * Returns a list of vector store files. */
    suspend fun listVectorStoreFiles(vectorStoreId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,filter:kotlin.String?,context:OperationRequest):Response<ListVectorStoreFilesResponse>
    /* listVectorStores
     * Returns a list of vector stores. */
    suspend fun listVectorStores(limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListVectorStoresResponse>
    /* modifyVectorStore
     * Modifies a vector store. */
    suspend fun modifyVectorStore(vectorStoreId:kotlin.String?,updateVectorStoreRequest:UpdateVectorStoreRequest?,context:OperationRequest):Response<VectorStoreObject>
    companion object {
        const val address = "VectorStoresApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in VectorStoresApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(VectorStoresApi::class.java, address)
            return routerFactory
        }
    }
}
