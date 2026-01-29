package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CreateFineTuningJobRequest
import org.openapitools.server.api.model.FineTuningJob
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse
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


interface FineTuningApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* cancelFineTuningJob
     * Immediately cancel a fine-tune job.  */
    suspend fun cancelFineTuningJob(fineTuningJobId:kotlin.String?,context:OperationRequest):Response<FineTuningJob>
    /* createFineTuningJob
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  */
    suspend fun createFineTuningJob(createFineTuningJobRequest:CreateFineTuningJobRequest?,context:OperationRequest):Response<FineTuningJob>
    /* listFineTuningEvents
     * Get status updates for a fine-tuning job.  */
    suspend fun listFineTuningEvents(fineTuningJobId:kotlin.String?,after:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<ListFineTuningJobEventsResponse>
    /* listFineTuningJobCheckpoints
     * List checkpoints for a fine-tuning job.  */
    suspend fun listFineTuningJobCheckpoints(fineTuningJobId:kotlin.String?,after:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<ListFineTuningJobCheckpointsResponse>
    /* listPaginatedFineTuningJobs
     * List your organization&#39;s fine-tuning jobs  */
    suspend fun listPaginatedFineTuningJobs(after:kotlin.String?,limit:kotlin.Int?,context:OperationRequest):Response<ListPaginatedFineTuningJobsResponse>
    /* retrieveFineTuningJob
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  */
    suspend fun retrieveFineTuningJob(fineTuningJobId:kotlin.String?,context:OperationRequest):Response<FineTuningJob>
    companion object {
        const val address = "FineTuningApi-service"
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
            for (m in FineTuningApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(FineTuningApi::class.java, address)
            return routerFactory
        }
    }
}
