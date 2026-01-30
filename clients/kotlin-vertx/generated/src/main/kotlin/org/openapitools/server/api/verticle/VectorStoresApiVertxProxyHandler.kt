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
import org.openapitools.server.api.model.CreateVectorStoreFileBatchRequest
import org.openapitools.server.api.model.CreateVectorStoreFileRequest
import org.openapitools.server.api.model.CreateVectorStoreRequest
import org.openapitools.server.api.model.DeleteVectorStoreFileResponse
import org.openapitools.server.api.model.DeleteVectorStoreResponse
import org.openapitools.server.api.model.ListVectorStoreFilesResponse
import org.openapitools.server.api.model.ListVectorStoresResponse
import org.openapitools.server.api.model.UpdateVectorStoreRequest
import org.openapitools.server.api.model.VectorStoreFileBatchObject
import org.openapitools.server.api.model.VectorStoreFileObject
import org.openapitools.server.api.model.VectorStoreObject

class VectorStoresApiVertxProxyHandler(private val vertx: Vertx, private val service: VectorStoresApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "cancelVectorStoreFileBatch" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.cancelVectorStoreFileBatch(vectorStoreId,batchId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createVectorStore" -> {
                    val params = context.params
                    val createVectorStoreRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createVectorStoreRequestParam == null) {
                        throw IllegalArgumentException("createVectorStoreRequest is required")
                    }
                    val createVectorStoreRequest = Gson().fromJson(createVectorStoreRequestParam.encode(), CreateVectorStoreRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createVectorStore(createVectorStoreRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createVectorStoreFile" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val createVectorStoreFileRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createVectorStoreFileRequestParam == null) {
                        throw IllegalArgumentException("createVectorStoreFileRequest is required")
                    }
                    val createVectorStoreFileRequest = Gson().fromJson(createVectorStoreFileRequestParam.encode(), CreateVectorStoreFileRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createVectorStoreFile(vectorStoreId,createVectorStoreFileRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createVectorStoreFileBatch" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val createVectorStoreFileBatchRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (createVectorStoreFileBatchRequestParam == null) {
                        throw IllegalArgumentException("createVectorStoreFileBatchRequest is required")
                    }
                    val createVectorStoreFileBatchRequest = Gson().fromJson(createVectorStoreFileBatchRequestParam.encode(), CreateVectorStoreFileBatchRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createVectorStoreFileBatch(vectorStoreId,createVectorStoreFileBatchRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteVectorStore" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteVectorStore(vectorStoreId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteVectorStoreFile" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteVectorStoreFile(vectorStoreId,fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getVectorStore" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getVectorStore(vectorStoreId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getVectorStoreFile" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val fileId = ApiHandlerUtils.searchStringInJson(params,"file_id")
                    if(fileId == null){
                        throw IllegalArgumentException("fileId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getVectorStoreFile(vectorStoreId,fileId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "getVectorStoreFileBatch" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.getVectorStoreFileBatch(vectorStoreId,batchId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listFilesInVectorStoreBatch" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val batchId = ApiHandlerUtils.searchStringInJson(params,"batch_id")
                    if(batchId == null){
                        throw IllegalArgumentException("batchId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    val filter = ApiHandlerUtils.searchStringInJson(params,"filter")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listFilesInVectorStoreBatch(vectorStoreId,batchId,limit,order,after,before,filter,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listVectorStoreFiles" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    val filter = ApiHandlerUtils.searchStringInJson(params,"filter")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listVectorStoreFiles(vectorStoreId,limit,order,after,before,filter,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listVectorStores" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val order = ApiHandlerUtils.searchStringInJson(params,"order")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listVectorStores(limit,order,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyVectorStore" -> {
                    val params = context.params
                    val vectorStoreId = ApiHandlerUtils.searchStringInJson(params,"vector_store_id")
                    if(vectorStoreId == null){
                        throw IllegalArgumentException("vectorStoreId is required")
                    }
                    val updateVectorStoreRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (updateVectorStoreRequestParam == null) {
                        throw IllegalArgumentException("updateVectorStoreRequest is required")
                    }
                    val updateVectorStoreRequest = Gson().fromJson(updateVectorStoreRequestParam.encode(), UpdateVectorStoreRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyVectorStore(vectorStoreId,updateVectorStoreRequest,context)
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
