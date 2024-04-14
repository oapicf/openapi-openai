package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.DeleteFileResponse
import org.openapitools.server.api.model.ListFilesResponse
import org.openapitools.server.api.model.OpenAIFile
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


interface FilesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createFile
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  */
    suspend fun createFile(file:kotlin.collections.List<java.io.File>?,purpose:kotlin.String?,context:OperationRequest):Response<OpenAIFile>
    /* deleteFile
     * Delete a file. */
    suspend fun deleteFile(fileId:kotlin.String?,context:OperationRequest):Response<DeleteFileResponse>
    /* downloadFile
     * Returns the contents of the specified file. */
    suspend fun downloadFile(fileId:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* listFiles
     * Returns a list of files that belong to the user&#39;s organization. */
    suspend fun listFiles(purpose:kotlin.String?,context:OperationRequest):Response<ListFilesResponse>
    /* retrieveFile
     * Returns information about a specific file. */
    suspend fun retrieveFile(fileId:kotlin.String?,context:OperationRequest):Response<OpenAIFile>
    companion object {
        const val address = "FilesApi-service"
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
            for (m in FilesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(FilesApi::class.java, address)
            return routerFactory
        }
    }
}
