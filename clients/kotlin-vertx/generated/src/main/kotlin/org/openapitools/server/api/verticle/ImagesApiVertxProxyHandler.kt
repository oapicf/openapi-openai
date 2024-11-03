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
import org.openapitools.server.api.model.CreateImageEditRequestModel
import org.openapitools.server.api.model.CreateImageRequest
import org.openapitools.server.api.model.ImagesResponse

class ImagesApiVertxProxyHandler(private val vertx: Vertx, private val service: ImagesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "createImage" -> {
                    val params = context.params
                    val createImageRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createImageRequestParam == null) {
                        throw IllegalArgumentException("createImageRequest is required")
                    }
                    val createImageRequest = Gson().fromJson(createImageRequestParam.encode(), CreateImageRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createImage(createImageRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createImageEdit" -> {
                    val params = context.params
                    val imageParam = context.extra.getJsonArray("files")
                    if (imageParam == null) {
                         throw IllegalArgumentException("image is required")
                    }
                    val image = imageParam.map{ java.io.File(it as String) }
                    if(image == null){
                        throw IllegalArgumentException("image is required")
                    }
                    val prompt = ApiHandlerUtils.searchStringInJson(params,"prompt")
                    if(prompt == null){
                        throw IllegalArgumentException("prompt is required")
                    }
                    val maskParam = context.extra.getJsonArray("files")
                    val mask = maskParam?.map{ java.io.File(it as String) }
                    val modelParam = ApiHandlerUtils.searchJsonObjectInJson(params,"model")
                    val model = if(modelParam ==null) null else Gson().fromJson(modelParam.encode(), CreateImageEditRequestModel::class.java)
                    val n = ApiHandlerUtils.searchIntegerInJson(params,"n")
                    val size = ApiHandlerUtils.searchStringInJson(params,"size")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val user = ApiHandlerUtils.searchStringInJson(params,"user")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createImageEdit(image,prompt,mask,model,n,size,responseFormat,user,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createImageVariation" -> {
                    val params = context.params
                    val imageParam = context.extra.getJsonArray("files")
                    if (imageParam == null) {
                         throw IllegalArgumentException("image is required")
                    }
                    val image = imageParam.map{ java.io.File(it as String) }
                    if(image == null){
                        throw IllegalArgumentException("image is required")
                    }
                    val modelParam = ApiHandlerUtils.searchJsonObjectInJson(params,"model")
                    val model = if(modelParam ==null) null else Gson().fromJson(modelParam.encode(), CreateImageEditRequestModel::class.java)
                    val n = ApiHandlerUtils.searchIntegerInJson(params,"n")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val size = ApiHandlerUtils.searchStringInJson(params,"size")
                    val user = ApiHandlerUtils.searchStringInJson(params,"user")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createImageVariation(image,model,n,responseFormat,size,user,context)
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
