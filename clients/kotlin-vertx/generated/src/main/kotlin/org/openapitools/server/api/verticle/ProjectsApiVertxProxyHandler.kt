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
import org.openapitools.server.api.model.ErrorResponse
import org.openapitools.server.api.model.Project
import org.openapitools.server.api.model.ProjectApiKey
import org.openapitools.server.api.model.ProjectApiKeyDeleteResponse
import org.openapitools.server.api.model.ProjectApiKeyListResponse
import org.openapitools.server.api.model.ProjectCreateRequest
import org.openapitools.server.api.model.ProjectListResponse
import org.openapitools.server.api.model.ProjectRateLimit
import org.openapitools.server.api.model.ProjectRateLimitListResponse
import org.openapitools.server.api.model.ProjectRateLimitUpdateRequest
import org.openapitools.server.api.model.ProjectServiceAccount
import org.openapitools.server.api.model.ProjectServiceAccountCreateRequest
import org.openapitools.server.api.model.ProjectServiceAccountCreateResponse
import org.openapitools.server.api.model.ProjectServiceAccountDeleteResponse
import org.openapitools.server.api.model.ProjectServiceAccountListResponse
import org.openapitools.server.api.model.ProjectUpdateRequest
import org.openapitools.server.api.model.ProjectUser
import org.openapitools.server.api.model.ProjectUserCreateRequest
import org.openapitools.server.api.model.ProjectUserDeleteResponse
import org.openapitools.server.api.model.ProjectUserListResponse
import org.openapitools.server.api.model.ProjectUserUpdateRequest

class ProjectsApiVertxProxyHandler(private val vertx: Vertx, private val service: ProjectsApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "archiveProject" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.archiveProject(projectId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createProject" -> {
                    val params = context.params
                    val projectCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectCreateRequestParam == null) {
                        throw IllegalArgumentException("projectCreateRequest is required")
                    }
                    val projectCreateRequest = Gson().fromJson(projectCreateRequestParam.encode(), ProjectCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createProject(projectCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createProjectServiceAccount" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val projectServiceAccountCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectServiceAccountCreateRequestParam == null) {
                        throw IllegalArgumentException("projectServiceAccountCreateRequest is required")
                    }
                    val projectServiceAccountCreateRequest = Gson().fromJson(projectServiceAccountCreateRequestParam.encode(), ProjectServiceAccountCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createProjectServiceAccount(projectId,projectServiceAccountCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "createProjectUser" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val projectUserCreateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectUserCreateRequestParam == null) {
                        throw IllegalArgumentException("projectUserCreateRequest is required")
                    }
                    val projectUserCreateRequest = Gson().fromJson(projectUserCreateRequestParam.encode(), ProjectUserCreateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.createProjectUser(projectId,projectUserCreateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteProjectApiKey" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val keyId = ApiHandlerUtils.searchStringInJson(params,"key_id")
                    if(keyId == null){
                        throw IllegalArgumentException("keyId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteProjectApiKey(projectId,keyId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteProjectServiceAccount" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val serviceAccountId = ApiHandlerUtils.searchStringInJson(params,"service_account_id")
                    if(serviceAccountId == null){
                        throw IllegalArgumentException("serviceAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteProjectServiceAccount(projectId,serviceAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "deleteProjectUser" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val userId = ApiHandlerUtils.searchStringInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.deleteProjectUser(projectId,userId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listProjectApiKeys" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listProjectApiKeys(projectId,limit,after,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listProjectRateLimits" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val before = ApiHandlerUtils.searchStringInJson(params,"before")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listProjectRateLimits(projectId,limit,after,before,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listProjectServiceAccounts" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listProjectServiceAccounts(projectId,limit,after,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listProjectUsers" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listProjectUsers(projectId,limit,after,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "listProjects" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val after = ApiHandlerUtils.searchStringInJson(params,"after")
                    val includeArchived = ApiHandlerUtils.searchStringInJson(params,"include_archived")?.toBoolean()
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.listProjects(limit,after,includeArchived,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyProject" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val projectUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectUpdateRequestParam == null) {
                        throw IllegalArgumentException("projectUpdateRequest is required")
                    }
                    val projectUpdateRequest = Gson().fromJson(projectUpdateRequestParam.encode(), ProjectUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyProject(projectId,projectUpdateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "modifyProjectUser" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val userId = ApiHandlerUtils.searchStringInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    val projectUserUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectUserUpdateRequestParam == null) {
                        throw IllegalArgumentException("projectUserUpdateRequest is required")
                    }
                    val projectUserUpdateRequest = Gson().fromJson(projectUserUpdateRequestParam.encode(), ProjectUserUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.modifyProjectUser(projectId,userId,projectUserUpdateRequest,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveProject" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveProject(projectId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveProjectApiKey" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val keyId = ApiHandlerUtils.searchStringInJson(params,"key_id")
                    if(keyId == null){
                        throw IllegalArgumentException("keyId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveProjectApiKey(projectId,keyId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveProjectServiceAccount" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val serviceAccountId = ApiHandlerUtils.searchStringInJson(params,"service_account_id")
                    if(serviceAccountId == null){
                        throw IllegalArgumentException("serviceAccountId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveProjectServiceAccount(projectId,serviceAccountId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "retrieveProjectUser" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val userId = ApiHandlerUtils.searchStringInJson(params,"user_id")
                    if(userId == null){
                        throw IllegalArgumentException("userId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.retrieveProjectUser(projectId,userId,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "updateProjectRateLimits" -> {
                    val params = context.params
                    val projectId = ApiHandlerUtils.searchStringInJson(params,"project_id")
                    if(projectId == null){
                        throw IllegalArgumentException("projectId is required")
                    }
                    val rateLimitId = ApiHandlerUtils.searchStringInJson(params,"rate_limit_id")
                    if(rateLimitId == null){
                        throw IllegalArgumentException("rateLimitId is required")
                    }
                    val projectRateLimitUpdateRequestParam = ApiHandlerUtils.searchJsonObjectInJson(params,"body")
                    if (projectRateLimitUpdateRequestParam == null) {
                        throw IllegalArgumentException("projectRateLimitUpdateRequest is required")
                    }
                    val projectRateLimitUpdateRequest = Gson().fromJson(projectRateLimitUpdateRequestParam.encode(), ProjectRateLimitUpdateRequest::class.java)
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.updateProjectRateLimits(projectId,rateLimitId,projectRateLimitUpdateRequest,context)
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
