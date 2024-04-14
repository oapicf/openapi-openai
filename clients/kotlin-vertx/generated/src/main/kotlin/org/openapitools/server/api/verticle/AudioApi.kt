package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CreateSpeechRequest
import org.openapitools.server.api.model.CreateTranscription200Response
import org.openapitools.server.api.model.CreateTranscriptionRequestModel
import org.openapitools.server.api.model.CreateTranslation200Response
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


interface AudioApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* createSpeech
     * Generates audio from the input text. */
    suspend fun createSpeech(createSpeechRequest:CreateSpeechRequest?,context:OperationRequest):Response<java.io.File>
    /* createTranscription
     * Transcribes audio into the input language. */
    suspend fun createTranscription(file:kotlin.collections.List<java.io.File>?,model:CreateTranscriptionRequestModel?,language:kotlin.String?,prompt:kotlin.String?,responseFormat:kotlin.String?,temperature:java.math.BigDecimal?,timestampGranularities:kotlin.Array<kotlin.String>?,context:OperationRequest):Response<CreateTranscription200Response>
    /* createTranslation
     * Translates audio into English. */
    suspend fun createTranslation(file:kotlin.collections.List<java.io.File>?,model:CreateTranscriptionRequestModel?,prompt:kotlin.String?,responseFormat:kotlin.String?,temperature:java.math.BigDecimal?,context:OperationRequest):Response<CreateTranslation200Response>
    companion object {
        const val address = "AudioApi-service"
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
            for (m in AudioApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AudioApi::class.java, address)
            return routerFactory
        }
    }
}
