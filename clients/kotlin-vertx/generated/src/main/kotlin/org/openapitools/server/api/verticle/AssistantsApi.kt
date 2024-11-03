package org.openapitools.server.api.verticle

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
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface AssistantsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* cancelRun
     * Cancels a run that is &#x60;in_progress&#x60;. */
    suspend fun cancelRun(threadId:kotlin.String?,runId:kotlin.String?,context:OperationRequest):Response<RunObject>
    /* createAssistant
     * Create an assistant with a model and instructions. */
    suspend fun createAssistant(createAssistantRequest:CreateAssistantRequest?,context:OperationRequest):Response<AssistantObject>
    /* createAssistantFile
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants). */
    suspend fun createAssistantFile(assistantId:kotlin.String?,createAssistantFileRequest:CreateAssistantFileRequest?,context:OperationRequest):Response<AssistantFileObject>
    /* createMessage
     * Create a message. */
    suspend fun createMessage(threadId:kotlin.String?,createMessageRequest:CreateMessageRequest?,context:OperationRequest):Response<MessageObject>
    /* createRun
     * Create a run. */
    suspend fun createRun(threadId:kotlin.String?,createRunRequest:CreateRunRequest?,context:OperationRequest):Response<RunObject>
    /* createThread
     * Create a thread. */
    suspend fun createThread(createThreadRequest:CreateThreadRequest?,context:OperationRequest):Response<ThreadObject>
    /* createThreadAndRun
     * Create a thread and run it in one request. */
    suspend fun createThreadAndRun(createThreadAndRunRequest:CreateThreadAndRunRequest?,context:OperationRequest):Response<RunObject>
    /* deleteAssistant
     * Delete an assistant. */
    suspend fun deleteAssistant(assistantId:kotlin.String?,context:OperationRequest):Response<DeleteAssistantResponse>
    /* deleteAssistantFile
     * Delete an assistant file. */
    suspend fun deleteAssistantFile(assistantId:kotlin.String?,fileId:kotlin.String?,context:OperationRequest):Response<DeleteAssistantFileResponse>
    /* deleteThread
     * Delete a thread. */
    suspend fun deleteThread(threadId:kotlin.String?,context:OperationRequest):Response<DeleteThreadResponse>
    /* getAssistant
     * Retrieves an assistant. */
    suspend fun getAssistant(assistantId:kotlin.String?,context:OperationRequest):Response<AssistantObject>
    /* getAssistantFile
     * Retrieves an AssistantFile. */
    suspend fun getAssistantFile(assistantId:kotlin.String?,fileId:kotlin.String?,context:OperationRequest):Response<AssistantFileObject>
    /* getMessage
     * Retrieve a message. */
    suspend fun getMessage(threadId:kotlin.String?,messageId:kotlin.String?,context:OperationRequest):Response<MessageObject>
    /* getMessageFile
     * Retrieves a message file. */
    suspend fun getMessageFile(threadId:kotlin.String?,messageId:kotlin.String?,fileId:kotlin.String?,context:OperationRequest):Response<MessageFileObject>
    /* getRun
     * Retrieves a run. */
    suspend fun getRun(threadId:kotlin.String?,runId:kotlin.String?,context:OperationRequest):Response<RunObject>
    /* getRunStep
     * Retrieves a run step. */
    suspend fun getRunStep(threadId:kotlin.String?,runId:kotlin.String?,stepId:kotlin.String?,context:OperationRequest):Response<RunStepObject>
    /* getThread
     * Retrieves a thread. */
    suspend fun getThread(threadId:kotlin.String?,context:OperationRequest):Response<ThreadObject>
    /* listAssistantFiles
     * Returns a list of assistant files. */
    suspend fun listAssistantFiles(assistantId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListAssistantFilesResponse>
    /* listAssistants
     * Returns a list of assistants. */
    suspend fun listAssistants(limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListAssistantsResponse>
    /* listMessageFiles
     * Returns a list of message files. */
    suspend fun listMessageFiles(threadId:kotlin.String?,messageId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListMessageFilesResponse>
    /* listMessages
     * Returns a list of messages for a given thread. */
    suspend fun listMessages(threadId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,runId:kotlin.String?,context:OperationRequest):Response<ListMessagesResponse>
    /* listRunSteps
     * Returns a list of run steps belonging to a run. */
    suspend fun listRunSteps(threadId:kotlin.String?,runId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListRunStepsResponse>
    /* listRuns
     * Returns a list of runs belonging to a thread. */
    suspend fun listRuns(threadId:kotlin.String?,limit:kotlin.Int?,order:kotlin.String?,after:kotlin.String?,before:kotlin.String?,context:OperationRequest):Response<ListRunsResponse>
    /* modifyAssistant
     * Modifies an assistant. */
    suspend fun modifyAssistant(assistantId:kotlin.String?,modifyAssistantRequest:ModifyAssistantRequest?,context:OperationRequest):Response<AssistantObject>
    /* modifyMessage
     * Modifies a message. */
    suspend fun modifyMessage(threadId:kotlin.String?,messageId:kotlin.String?,modifyMessageRequest:ModifyMessageRequest?,context:OperationRequest):Response<MessageObject>
    /* modifyRun
     * Modifies a run. */
    suspend fun modifyRun(threadId:kotlin.String?,runId:kotlin.String?,modifyRunRequest:ModifyRunRequest?,context:OperationRequest):Response<RunObject>
    /* modifyThread
     * Modifies a thread. */
    suspend fun modifyThread(threadId:kotlin.String?,modifyThreadRequest:ModifyThreadRequest?,context:OperationRequest):Response<ThreadObject>
    /* submitToolOuputsToRun
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.  */
    suspend fun submitToolOuputsToRun(threadId:kotlin.String?,runId:kotlin.String?,submitToolOutputsRunRequest:SubmitToolOutputsRunRequest?,context:OperationRequest):Response<RunObject>
    companion object {
        const val address = "AssistantsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in AssistantsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(AssistantsApi::class.java, address)
            return routerFactory
        }
    }
}
