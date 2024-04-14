package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.DeleteModelResponse
import org.openapitools.server.api.model.ListModelsResponse
import org.openapitools.server.api.model.Model
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


interface ModelsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteModel
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. */
    suspend fun deleteModel(model:kotlin.String?,context:OperationRequest):Response<DeleteModelResponse>
    /* listModels
     * Lists the currently available models, and provides basic information about each one such as the owner and availability. */
    suspend fun listModels(context:OperationRequest):Response<ListModelsResponse>
    /* retrieveModel
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning. */
    suspend fun retrieveModel(model:kotlin.String?,context:OperationRequest):Response<Model>
    companion object {
        const val address = "ModelsApi-service"
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
            for (m in ModelsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ModelsApi::class.java, address)
            return routerFactory
        }
    }
}
