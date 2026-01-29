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
import org.openapitools.server.api.model.CreateSpeechRequest
import org.openapitools.server.api.model.CreateTranscription200Response
import org.openapitools.server.api.model.CreateTranscriptionRequestModel
import org.openapitools.server.api.model.CreateTranslation200Response

class AudioApiVertxProxyHandler(private val vertx: Vertx, private val service: AudioApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "createSpeech" -> {
                    val params = context.params
                    val createSpeechRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createSpeechRequestParam == null) {
                        throw IllegalArgumentException("createSpeechRequest is required")
                    }
                    val createSpeechRequest = Gson().fromJson(createSpeechRequestParam.encode(), CreateSpeechRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createSpeech(createSpeechRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createTranscription" -> {
                    val params = context.params
                    val fileParam = context.extra.getJsonArray("files")
                    if (fileParam == null) {
                         throw IllegalArgumentException("file is required")
                    }
                    val file = fileParam.map{ java.io.File(it as String) }
                    if(file == null){
                        throw IllegalArgumentException("file is required")
                    }
                    val modelParam = ApiHandlerUtils.searchJsonObjectInJson(params,"model")
                    if (modelParam == null) {
                        throw IllegalArgumentException("model is required")
                    }
                    val model = Gson().fromJson(modelParam.encode(), CreateTranscriptionRequestModel::class.java)
                    val language = ApiHandlerUtils.searchStringInJson(params,"language")
                    val prompt = ApiHandlerUtils.searchStringInJson(params,"prompt")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val temperature = ApiHandlerUtils.searchDoubleInJson(params,"temperature")
                    val timestampGranularitiesParam = ApiHandlerUtils.searchJsonArrayInJson(params,"timestamp_granularities[]")
                    val timestampGranularities:kotlin.Array<kotlin.String>? = if(timestampGranularitiesParam == null) null
                            else Gson().fromJson(timestampGranularitiesParam.encode(),
                            , object : TypeToken<kotlin.collections.List<kotlin.String>>(){}.type)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createTranscription(file,model,language,prompt,responseFormat,temperature,timestampGranularities,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createTranslation" -> {
                    val params = context.params
                    val fileParam = context.extra.getJsonArray("files")
                    if (fileParam == null) {
                         throw IllegalArgumentException("file is required")
                    }
                    val file = fileParam.map{ java.io.File(it as String) }
                    if(file == null){
                        throw IllegalArgumentException("file is required")
                    }
                    val modelParam = ApiHandlerUtils.searchJsonObjectInJson(params,"model")
                    if (modelParam == null) {
                        throw IllegalArgumentException("model is required")
                    }
                    val model = Gson().fromJson(modelParam.encode(), CreateTranscriptionRequestModel::class.java)
                    val prompt = ApiHandlerUtils.searchStringInJson(params,"prompt")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val temperature = ApiHandlerUtils.searchDoubleInJson(params,"temperature")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createTranslation(file,model,prompt,responseFormat,temperature,context)
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
