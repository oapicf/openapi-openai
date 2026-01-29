package org.openapitools.server.api.verticle

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
import org.openapitools.server.api.model.CreateFineTuningJobRequest
import org.openapitools.server.api.model.FineTuningJob
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse

class FineTuningApiVertxProxyHandler(private val vertx: Vertx, private val service: FineTuningApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private lateinit var timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "cancelFineTuningJob" -> {
                    val params = context.params
                    val fineTuningJobId = ApiHandlerUtils.searchStringInJson(params,"fine_tuning_job_id")
                    if(fineTuningJobId == null){
                        throw IllegalArgumentException("fineTuningJobId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelFineTuningJob(fineTuningJobId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createFineTuningJob" -> {
                    val params = context.params
                    val createFineTuningJobRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createFineTuningJobRequestParam == null) {
                        throw IllegalArgumentException("createFineTuningJobRequest is required")
                    }
                    val createFineTuningJobRequest = Gson().fromJson(createFineTuningJobRequestParam.encode(), CreateFineTuningJobRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createFineTuningJob(createFineTuningJobRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listFineTuningEvents" -> {
                    val params = context.params
                    val fineTuningJobId = ApiHandlerUtils.searchStringInJson(params,"fine_tuning_job_id")
                    if(fineTuningJobId == null){
                        throw IllegalArgumentException("fineTuningJobId is required")
                    }
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listFineTuningEvents(fineTuningJobId,after,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listFineTuningJobCheckpoints" -> {
                    val params = context.params
                    val fineTuningJobId = ApiHandlerUtils.searchStringInJson(params,"fine_tuning_job_id")
                    if(fineTuningJobId == null){
                        throw IllegalArgumentException("fineTuningJobId is required")
                    }
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listFineTuningJobCheckpoints(fineTuningJobId,after,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listPaginatedFineTuningJobs" -> {
                    val params = context.params
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listPaginatedFineTuningJobs(after,limit,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveFineTuningJob" -> {
                    val params = context.params
                    val fineTuningJobId = ApiHandlerUtils.searchStringInJson(params,"fine_tuning_job_id")
                    if(fineTuningJobId == null){
                        throw IllegalArgumentException("fineTuningJobId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveFineTuningJob(fineTuningJobId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
