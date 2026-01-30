package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.UsageResponse
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


interface UsageApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* usageAudioSpeeches
     * Get audio speeches usage details for the organization. */
    suspend fun usageAudioSpeeches(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageAudioTranscriptions
     * Get audio transcriptions usage details for the organization. */
    suspend fun usageAudioTranscriptions(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageCodeInterpreterSessions
     * Get code interpreter sessions usage details for the organization. */
    suspend fun usageCodeInterpreterSessions(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageCompletions
     * Get completions usage details for the organization. */
    suspend fun usageCompletions(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,batch:kotlin.Boolean?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageCosts
     * Get costs details for the organization. */
    suspend fun usageCosts(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageEmbeddings
     * Get embeddings usage details for the organization. */
    suspend fun usageEmbeddings(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageImages
     * Get images usage details for the organization. */
    suspend fun usageImages(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,sources:kotlin.Array<kotlin.String>?,sizes:kotlin.Array<kotlin.String>?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageModerations
     * Get moderations usage details for the organization. */
    suspend fun usageModerations(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,userIds:kotlin.Array<kotlin.String>?,apiKeyIds:kotlin.Array<kotlin.String>?,models:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    /* usageVectorStores
     * Get vector stores usage details for the organization. */
    suspend fun usageVectorStores(startTime:kotlin.Int?,endTime:kotlin.Int?,bucketWidth:kotlin.String?,projectIds:kotlin.Array<kotlin.String>?,groupBy:kotlin.Array<kotlin.String>?,limit:kotlin.Int?,page:kotlin.String?,context:OperationRequest):Response<UsageResponse>
    companion object {
        const val address = "UsageApi-service"
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
            for (m in UsageApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(UsageApi::class.java, address)
            return routerFactory
        }
    }
}
