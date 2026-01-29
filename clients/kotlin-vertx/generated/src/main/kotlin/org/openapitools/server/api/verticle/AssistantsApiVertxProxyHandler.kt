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
import org.openapitools.server.api.model.AssistantFileObject
import org.openapitools.server.api.model.AssistantObject
import org.openapitools.server.api.model.CreateAssistantFileRequest
import org.openapitools.server.api.model.CreateAssistantRequest
import org.openapitools.server.api.model.CreateMessageRequest
import org.openapitools.server.api.model.CreateRunRequest
import org.openapitools.server.api.model.CreateThreadAndRunRequest
import org.openapitools.server.api.model.CreateThreadRequest
import org.openapitools.server.api.model.DeleteAssistantFileResponse
import org.openapitools.server.api.model.DeleteAssistantResponse
import org.openapitools.server.api.model.DeleteThreadResponse
import org.openapitools.server.api.model.ListAssistantFilesResponse
import org.openapitools.server.api.model.ListAssistantsResponse
import org.openapitools.server.api.model.ListMessageFilesResponse
import org.openapitools.server.api.model.ListMessagesResponse
import org.openapitools.server.api.model.ListRunStepsResponse
import org.openapitools.server.api.model.ListRunsResponse
import org.openapitools.server.api.model.MessageFileObject
import org.openapitools.server.api.model.MessageObject
import org.openapitools.server.api.model.ModifyAssistantRequest
import org.openapitools.server.api.model.ModifyMessageRequest
import org.openapitools.server.api.model.ModifyRunRequest
import org.openapitools.server.api.model.ModifyThreadRequest
import org.openapitools.server.api.model.RunObject
import org.openapitools.server.api.model.RunStepObject
import org.openapitools.server.api.model.SubmitToolOutputsRunRequest
import org.openapitools.server.api.model.ThreadObject

class AssistantsApiVertxProxyHandler(private val vertx: Vertx, private val service: AssistantsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "cancelRun" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelRun(threadId,runId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createAssistant" -> {
                    val params = context.params
                    val createAssistantRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createAssistantRequestParam == null) {
                        throw IllegalArgumentException("createAssistantRequest is required")
                    }
                    val createAssistantRequest = Gson().fromJson(createAssistantRequestParam.encode(), CreateAssistantRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createAssistant(createAssistantRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createAssistantFile" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    val createAssistantFileRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createAssistantFileRequestParam == null) {
                        throw IllegalArgumentException("createAssistantFileRequest is required")
                    }
                    val createAssistantFileRequest = Gson().fromJson(createAssistantFileRequestParam.encode(), CreateAssistantFileRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createAssistantFile(assistantId,createAssistantFileRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createMessage" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val createMessageRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createMessageRequestParam == null) {
                        throw IllegalArgumentException("createMessageRequest is required")
                    }
                    val createMessageRequest = Gson().fromJson(createMessageRequestParam.encode(), CreateMessageRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createMessage(threadId,createMessageRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createRun" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val createRunRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createRunRequestParam == null) {
                        throw IllegalArgumentException("createRunRequest is required")
                    }
                    val createRunRequest = Gson().fromJson(createRunRequestParam.encode(), CreateRunRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createRun(threadId,createRunRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createThread" -> {
                    val params = context.params
                    val createThreadRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    val createThreadRequest = if(createThreadRequestParam ==null) null else Gson().fromJson(createThreadRequestParam.encode(), CreateThreadRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createThread(createThreadRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createThreadAndRun" -> {
                    val params = context.params
                    val createThreadAndRunRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createThreadAndRunRequestParam == null) {
                        throw IllegalArgumentException("createThreadAndRunRequest is required")
                    }
                    val createThreadAndRunRequest = Gson().fromJson(createThreadAndRunRequestParam.encode(), CreateThreadAndRunRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createThreadAndRun(createThreadAndRunRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteAssistant" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteAssistant(assistantId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteAssistantFile" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteAssistantFile(assistantId,fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteThread" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteThread(threadId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAssistant" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAssistant(assistantId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getAssistantFile" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getAssistantFile(assistantId,fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getMessage" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val messageId = ApiHandlerUtils.searchStringInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getMessage(threadId,messageId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getMessageFile" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val messageId = ApiHandlerUtils.searchStringInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getMessageFile(threadId,messageId,fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getRun" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getRun(threadId,runId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getRunStep" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    val stepId = ApiHandlerUtils.searchStringInJson(params,"step_id")
                    if(stepId == null){
                        throw IllegalArgumentException("stepId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getRunStep(threadId,runId,stepId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getThread" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getThread(threadId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listAssistantFiles" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listAssistantFiles(assistantId,limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listAssistants" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listAssistants(limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listMessageFiles" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val messageId = ApiHandlerUtils.searchStringInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listMessageFiles(threadId,messageId,limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listMessages" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listMessages(threadId,limit,order,after,before,runId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listRunSteps" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listRunSteps(threadId,runId,limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listRuns" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listRuns(threadId,limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyAssistant" -> {
                    val params = context.params
                    val assistantId = ApiHandlerUtils.searchStringInJson(params,"assistant_id")
                    if(assistantId == null){
                        throw IllegalArgumentException("assistantId is required")
                    }
                    val modifyAssistantRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (modifyAssistantRequestParam == null) {
                        throw IllegalArgumentException("modifyAssistantRequest is required")
                    }
                    val modifyAssistantRequest = Gson().fromJson(modifyAssistantRequestParam.encode(), ModifyAssistantRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyAssistant(assistantId,modifyAssistantRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyMessage" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val messageId = ApiHandlerUtils.searchStringInJson(params,"message_id")
                    if(messageId == null){
                        throw IllegalArgumentException("messageId is required")
                    }
                    val modifyMessageRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (modifyMessageRequestParam == null) {
                        throw IllegalArgumentException("modifyMessageRequest is required")
                    }
                    val modifyMessageRequest = Gson().fromJson(modifyMessageRequestParam.encode(), ModifyMessageRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyMessage(threadId,messageId,modifyMessageRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyRun" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    val modifyRunRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (modifyRunRequestParam == null) {
                        throw IllegalArgumentException("modifyRunRequest is required")
                    }
                    val modifyRunRequest = Gson().fromJson(modifyRunRequestParam.encode(), ModifyRunRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyRun(threadId,runId,modifyRunRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyThread" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val modifyThreadRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (modifyThreadRequestParam == null) {
                        throw IllegalArgumentException("modifyThreadRequest is required")
                    }
                    val modifyThreadRequest = Gson().fromJson(modifyThreadRequestParam.encode(), ModifyThreadRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyThread(threadId,modifyThreadRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "submitToolOuputsToRun" -> {
                    val params = context.params
                    val threadId = ApiHandlerUtils.searchStringInJson(params,"thread_id")
                    if(threadId == null){
                        throw IllegalArgumentException("threadId is required")
                    }
                    val runId = ApiHandlerUtils.searchStringInJson(params,"run_id")
                    if(runId == null){
                        throw IllegalArgumentException("runId is required")
                    }
                    val submitToolOutputsRunRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (submitToolOutputsRunRequestParam == null) {
                        throw IllegalArgumentException("submitToolOutputsRunRequest is required")
                    }
                    val submitToolOutputsRunRequest = Gson().fromJson(submitToolOutputsRunRequestParam.encode(), SubmitToolOutputsRunRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.submitToolOuputsToRun(threadId,runId,submitToolOutputsRunRequest,context)
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
