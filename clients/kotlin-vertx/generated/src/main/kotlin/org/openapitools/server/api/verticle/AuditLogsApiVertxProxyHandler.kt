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
import org.openapitools.server.api.model.AuditLogEventType
import org.openapitools.server.api.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.server.api.model.ListAuditLogsResponse

class AuditLogsApiVertxProxyHandler(private val vertx: Vertx, private val service: AuditLogsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "listAuditLogs" -> {
                    val params = context.params
                    val effectiveAtParam = ApiHandlerUtils.searchJsonObjectInJson(params,"effective_at")
                    val effectiveAt = if(effectiveAtParam ==null) null else Gson().fromJson(effectiveAtParam.encode(), ListAuditLogsEffectiveAtParameter::class.java)
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids[]")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val eventTypesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"event_types[]")
                    val eventTypes:kotlin.Array<AuditLogEventType>? = if(eventTypesParam == null) null
                            else Gson().fromJson(eventTypesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<AuditLogEventType>>(){}.type)
                    val actorIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"actor_ids[]")
                    val actorIds:kotlin.Array<kotlin.String>? = if(actorIdsParam == null) null
                            else Gson().fromJson(actorIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val actorEmailsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"actor_emails[]")
                    val actorEmails:kotlin.Array<kotlin.String>? = if(actorEmailsParam == null) null
                            else Gson().fromJson(actorEmailsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val resourceIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"resource_ids[]")
                    val resourceIds:kotlin.Array<kotlin.String>? = if(resourceIdsParam == null) null
                            else Gson().fromJson(resourceIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listAuditLogs(effectiveAt,projectIds,eventTypes,actorIds,actorEmails,resourceIds,limit,after,before,context)
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
