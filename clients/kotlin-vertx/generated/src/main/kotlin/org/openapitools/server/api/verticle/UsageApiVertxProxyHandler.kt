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
import org.openapitools.server.api.model.UsageResponse

class UsageApiVertxProxyHandler(private val vertx: Vertx, private val service: UsageApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "usageAudioSpeeches" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageAudioSpeeches(startTime,endTime,bucketWidth,projectIds,userIds,apiKeyIds,models,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageAudioTranscriptions" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageAudioTranscriptions(startTime,endTime,bucketWidth,projectIds,userIds,apiKeyIds,models,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageCodeInterpreterSessions" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageCodeInterpreterSessions(startTime,endTime,bucketWidth,projectIds,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageCompletions" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val batch = ApiHandlerUtils.searchStringInJson(params,"batch")?.toBoolean()
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageCompletions(startTime,endTime,bucketWidth,projectIds,userIds,apiKeyIds,models,batch,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageCosts" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageCosts(startTime,endTime,bucketWidth,projectIds,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageEmbeddings" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageEmbeddings(startTime,endTime,bucketWidth,projectIds,userIds,apiKeyIds,models,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageImages" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val sourcesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"sources")
                    val sources:kotlin.Array<kotlin.String>? = if(sourcesParam == null) null
                            else Gson().fromJson(sourcesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val sizesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"sizes")
                    val sizes:kotlin.Array<kotlin.String>? = if(sizesParam == null) null
                            else Gson().fromJson(sizesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageImages(startTime,endTime,bucketWidth,sources,sizes,projectIds,userIds,apiKeyIds,models,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageModerations" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val userIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"user_ids")
                    val userIds:kotlin.Array<kotlin.String>? = if(userIdsParam == null) null
                            else Gson().fromJson(userIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val apiKeyIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"api_key_ids")
                    val apiKeyIds:kotlin.Array<kotlin.String>? = if(apiKeyIdsParam == null) null
                            else Gson().fromJson(apiKeyIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val modelsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"models")
                    val models:kotlin.Array<kotlin.String>? = if(modelsParam == null) null
                            else Gson().fromJson(modelsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageModerations(startTime,endTime,bucketWidth,projectIds,userIds,apiKeyIds,models,groupBy,limit,page,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "usageVectorStores" -> {
                    val params = context.params
                    val startTime = ApiHandlerUtils.searchIntegerInJson(params,"start_time")
                    if(startTime == null){
                        throw IllegalArgumentException("startTime is required")
                    }
                    val endTime = ApiHandlerUtils.searchIntegerInJson(params,"end_time")
                    val bucketWidth = ApiHandlerUtils.searchStringInJson(params,"bucket_width")
                    val projectIdsParam = ApiHandlerUtils.searchJsonArrayInJson(params,"project_ids")
                    val projectIds:kotlin.Array<kotlin.String>? = if(projectIdsParam == null) null
                            else Gson().fromJson(projectIdsParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val groupByParam = ApiHandlerUtils.searchJsonArrayInJson(params,"group_by")
                    val groupBy:kotlin.Array<kotlin.String>? = if(groupByParam == null) null
                            else Gson().fromJson(groupByParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val page = ApiHandlerUtils.searchStringInJson(params,"page")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.usageVectorStores(startTime,endTime,bucketWidth,projectIds,groupBy,limit,page,context)
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
