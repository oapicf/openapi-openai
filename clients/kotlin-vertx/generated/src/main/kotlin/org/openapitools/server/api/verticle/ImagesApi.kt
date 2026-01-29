package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CreateImageEditRequestModel
import org.openapitools.server.api.model.CreateImageRequest
import org.openapitools.server.api.model.ImagesResponse
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


interface ImagesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createImage
     * Creates an image given a prompt. */
    suspend fun createImage(createImageRequest:CreateImageRequest?,context:OperationRequest):Response<ImagesResponse>
    /* createImageEdit
     * Creates an edited or extended image given an original image and a prompt. */
    suspend fun createImageEdit(image:kotlin.collections.List<java.io.File>?,prompt:kotlin.String?,mask:kotlin.collections.List<java.io.File>?,model:CreateImageEditRequestModel?,n:kotlin.Int?,size:kotlin.String?,responseFormat:kotlin.String?,user:kotlin.String?,context:OperationRequest):Response<ImagesResponse>
    /* createImageVariation
     * Creates a variation of a given image. */
    suspend fun createImageVariation(image:kotlin.collections.List<java.io.File>?,model:CreateImageEditRequestModel?,n:kotlin.Int?,responseFormat:kotlin.String?,size:kotlin.String?,user:kotlin.String?,context:OperationRequest):Response<ImagesResponse>
    companion object {
        const val address = "ImagesApi-service"
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
            for (m in ImagesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ImagesApi::class.java, address)
            return routerFactory
        }
    }
}
