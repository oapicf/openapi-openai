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
import org.openapitools.server.api.model.CreateChatCompletionRequest
import org.openapitools.server.api.model.CreateChatCompletionResponse
import org.openapitools.server.api.model.CreateCompletionRequest
import org.openapitools.server.api.model.CreateCompletionResponse
import org.openapitools.server.api.model.CreateEditRequest
import org.openapitools.server.api.model.CreateEditResponse
import org.openapitools.server.api.model.CreateEmbeddingRequest
import org.openapitools.server.api.model.CreateEmbeddingResponse
import org.openapitools.server.api.model.CreateFineTuneRequest
import org.openapitools.server.api.model.CreateImageRequest
import org.openapitools.server.api.model.CreateModerationRequest
import org.openapitools.server.api.model.CreateModerationResponse
import org.openapitools.server.api.model.CreateTranscriptionRequestModel
import org.openapitools.server.api.model.CreateTranscriptionResponse
import org.openapitools.server.api.model.CreateTranslationResponse
import org.openapitools.server.api.model.DeleteFileResponse
import org.openapitools.server.api.model.DeleteModelResponse
import org.openapitools.server.api.model.FineTune
import org.openapitools.server.api.model.ImagesResponse
import org.openapitools.server.api.model.ListFilesResponse
import org.openapitools.server.api.model.ListFineTuneEventsResponse
import org.openapitools.server.api.model.ListFineTunesResponse
import org.openapitools.server.api.model.ListModelsResponse
import org.openapitools.server.api.model.Model
import org.openapitools.server.api.model.OpenAIFile

class OpenAIApiVertxProxyHandler(private val vertx: Vertx, private val service: OpenAIApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "cancelFineTune" -> {
                    val params = context.params
                    val fineTuneId = ApiHandlerUtils.searchStringInJson(params,"fine_tune_id")
                    if(fineTuneId == null){
                        throw IllegalArgumentException("fineTuneId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelFineTune(fineTuneId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createChatCompletion" -> {
                    val params = context.params
                    val createChatCompletionRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createChatCompletionRequestParam == null) {
                        throw IllegalArgumentException("createChatCompletionRequest is required")
                    }
                    val createChatCompletionRequest = Gson().fromJson(createChatCompletionRequestParam.encode(), CreateChatCompletionRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createChatCompletion(createChatCompletionRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createCompletion" -> {
                    val params = context.params
                    val createCompletionRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createCompletionRequestParam == null) {
                        throw IllegalArgumentException("createCompletionRequest is required")
                    }
                    val createCompletionRequest = Gson().fromJson(createCompletionRequestParam.encode(), CreateCompletionRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createCompletion(createCompletionRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createEdit" -> {
                    val params = context.params
                    val createEditRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createEditRequestParam == null) {
                        throw IllegalArgumentException("createEditRequest is required")
                    }
                    val createEditRequest = Gson().fromJson(createEditRequestParam.encode(), CreateEditRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createEdit(createEditRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createEmbedding" -> {
                    val params = context.params
                    val createEmbeddingRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createEmbeddingRequestParam == null) {
                        throw IllegalArgumentException("createEmbeddingRequest is required")
                    }
                    val createEmbeddingRequest = Gson().fromJson(createEmbeddingRequestParam.encode(), CreateEmbeddingRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createEmbedding(createEmbeddingRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createFile" -> {
                    val params = context.params
                    val fileParam = context.extra.getJsonArray("files")
                    if (fileParam == null) {
                         throw IllegalArgumentException("file is required")
                    }
                    val file = fileParam.map{ java.io.File(it as String) }
                    if(file == null){
                        throw IllegalArgumentException("file is required")
                    }
                    val purpose = ApiHandlerUtils.searchStringInJson(params,"purpose")
                    if(purpose == null){
                        throw IllegalArgumentException("purpose is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createFile(file,purpose,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createFineTune" -> {
                    val params = context.params
                    val createFineTuneRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createFineTuneRequestParam == null) {
                        throw IllegalArgumentException("createFineTuneRequest is required")
                    }
                    val createFineTuneRequest = Gson().fromJson(createFineTuneRequestParam.encode(), CreateFineTuneRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createFineTune(createFineTuneRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
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
                    val n = ApiHandlerUtils.searchIntegerInJson(params,"n")
                    val size = ApiHandlerUtils.searchStringInJson(params,"size")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val user = ApiHandlerUtils.searchStringInJson(params,"user")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createImageEdit(image,prompt,mask,n,size,responseFormat,user,context)
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
                    val n = ApiHandlerUtils.searchIntegerInJson(params,"n")
                    val size = ApiHandlerUtils.searchStringInJson(params,"size")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val user = ApiHandlerUtils.searchStringInJson(params,"user")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createImageVariation(image,n,size,responseFormat,user,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createModeration" -> {
                    val params = context.params
                    val createModerationRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createModerationRequestParam == null) {
                        throw IllegalArgumentException("createModerationRequest is required")
                    }
                    val createModerationRequest = Gson().fromJson(createModerationRequestParam.encode(), CreateModerationRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createModeration(createModerationRequest,context)
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
                    val prompt = ApiHandlerUtils.searchStringInJson(params,"prompt")
                    val responseFormat = ApiHandlerUtils.searchStringInJson(params,"response_format")
                    val temperature = ApiHandlerUtils.searchDoubleInJson(params,"temperature")
                    val language = ApiHandlerUtils.searchStringInJson(params,"language")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createTranscription(file,model,prompt,responseFormat,temperature,language,context)
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
        
                "deleteFile" -> {
                    val params = context.params
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteFile(fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteModel" -> {
                    val params = context.params
                    val model = ApiHandlerUtils.searchStringInJson(params,"model")
                    if(model == null){
                        throw IllegalArgumentException("model is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteModel(model,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "downloadFile" -> {
                    val params = context.params
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.downloadFile(fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listFiles" -> {
                }
        
                "listFineTuneEvents" -> {
                    val params = context.params
                    val fineTuneId = ApiHandlerUtils.searchStringInJson(params,"fine_tune_id")
                    if(fineTuneId == null){
                        throw IllegalArgumentException("fineTuneId is required")
                    }
                    val stream = ApiHandlerUtils.searchStringInJson(params,"stream")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listFineTuneEvents(fineTuneId,stream,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listFineTunes" -> {
                }
        
                "listModels" -> {
                }
        
                "retrieveFile" -> {
                    val params = context.params
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveFile(fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveFineTune" -> {
                    val params = context.params
                    val fineTuneId = ApiHandlerUtils.searchStringInJson(params,"fine_tune_id")
                    if(fineTuneId == null){
                        throw IllegalArgumentException("fineTuneId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveFineTune(fineTuneId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveModel" -> {
                    val params = context.params
                    val model = ApiHandlerUtils.searchStringInJson(params,"model")
                    if(model == null){
                        throw IllegalArgumentException("model is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveModel(model,context)
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
