package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AdminApiKey
import org.openapitools.server.api.model.AdminApiKeysCreateRequest
import org.openapitools.server.api.model.AdminApiKeysDelete200Response
import org.openapitools.server.api.model.ApiKeyList
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


interface DefaultApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* adminApiKeysCreate
     * Create an organization admin API key */
    suspend fun adminApiKeysCreate(adminApiKeysCreateRequest:AdminApiKeysCreateRequest?,context:OperationRequest):Response<AdminApiKey>
    /* adminApiKeysDelete
     * Delete an organization admin API key */
    suspend fun adminApiKeysDelete(keyId:kotlin.String?,context:OperationRequest):Response<AdminApiKeysDelete200Response>
    /* adminApiKeysGet
     * Retrieve a single organization API key */
    suspend fun adminApiKeysGet(keyId:kotlin.String?,context:OperationRequest):Response<AdminApiKey>
    /* adminApiKeysList
     * List organization API keys */
    suspend fun adminApiKeysList(after:kotlin.String?,order:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<ApiKeyList>
    companion object {
        const val address = "DefaultApi-service"
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
            for (m in DefaultApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(DefaultApi::class.java, address)
            return routerFactory
        }
    }
}
