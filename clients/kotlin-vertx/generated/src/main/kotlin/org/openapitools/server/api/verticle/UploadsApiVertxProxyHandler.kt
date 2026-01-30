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
import org.openapitools.server.api.model.CompleteUploadRequest
import org.openapitools.server.api.model.CreateUploadRequest
import org.openapitools.server.api.model.Upload
import org.openapitools.server.api.model.UploadPart

class UploadsApiVertxProxyHandler(private val vertx: Vertx, private val service: UploadsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "addUploadPart" -> {
                    val params = context.params
                    val uploadId = ApiHandlerUtils.searchStringInJson(params,"upload_id")
                    if(uploadId == null){
                        throw IllegalArgumentException("uploadId is required")
                    }
                    val &#x60;data&#x60;Param = context.extra.getJsonArray("files")
                    if (&#x60;data&#x60;Param == null) {
                         throw IllegalArgumentException("&#x60;data&#x60; is required")
                    }
                    val &#x60;data&#x60; = &#x60;data&#x60;Param.map{ java.io.File(it as String) }
                    if(&#x60;data&#x60; == null){
                        throw IllegalArgumentException("&#x60;data&#x60; is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.addUploadPart(uploadId,&#x60;data&#x60;,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "cancelUpload" -> {
                    val params = context.params
                    val uploadId = ApiHandlerUtils.searchStringInJson(params,"upload_id")
                    if(uploadId == null){
                        throw IllegalArgumentException("uploadId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelUpload(uploadId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "completeUpload" -> {
                    val params = context.params
                    val uploadId = ApiHandlerUtils.searchStringInJson(params,"upload_id")
                    if(uploadId == null){
                        throw IllegalArgumentException("uploadId is required")
                    }
                    val completeUploadRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (completeUploadRequestParam == null) {
                        throw IllegalArgumentException("completeUploadRequest is required")
                    }
                    val completeUploadRequest = Gson().fromJson(completeUploadRequestParam.encode(), CompleteUploadRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.completeUpload(uploadId,completeUploadRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createUpload" -> {
                    val params = context.params
                    val createUploadRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createUploadRequestParam == null) {
                        throw IllegalArgumentException("createUploadRequest is required")
                    }
                    val createUploadRequest = Gson().fromJson(createUploadRequestParam.encode(), CreateUploadRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createUpload(createUploadRequest,context)
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
