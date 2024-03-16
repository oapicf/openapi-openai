package org.openapitools.server.api.verticle

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


interface OpenAIApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* cancelFineTune
     * Immediately cancel a fine-tune job.  */
    suspend fun cancelFineTune(fineTuneId:kotlin.String?,context:OperationRequest):Response<FineTune>
    /* createChatCompletion
     * Creates a model response for the given chat conversation. */
    suspend fun createChatCompletion(createChatCompletionRequest:CreateChatCompletionRequest?,context:OperationRequest):Response<CreateChatCompletionResponse>
    /* createCompletion
     * Creates a completion for the provided prompt and parameters. */
    suspend fun createCompletion(createCompletionRequest:CreateCompletionRequest?,context:OperationRequest):Response<CreateCompletionResponse>
    /* createEdit
     * Creates a new edit for the provided input, instruction, and parameters. */
    suspend fun createEdit(createEditRequest:CreateEditRequest?,context:OperationRequest):Response<CreateEditResponse>
    /* createEmbedding
     * Creates an embedding vector representing the input text. */
    suspend fun createEmbedding(createEmbeddingRequest:CreateEmbeddingRequest?,context:OperationRequest):Response<CreateEmbeddingResponse>
    /* createFile
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  */
    suspend fun createFile(file:kotlin.collections.List<java.io.File>?,purpose:kotlin.String?,context:OperationRequest):Response<OpenAIFile>
    /* createFineTune
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  */
    suspend fun createFineTune(createFineTuneRequest:CreateFineTuneRequest?,context:OperationRequest):Response<FineTune>
    /* createImage
     * Creates an image given a prompt. */
    suspend fun createImage(createImageRequest:CreateImageRequest?,context:OperationRequest):Response<ImagesResponse>
    /* createImageEdit
     * Creates an edited or extended image given an original image and a prompt. */
    suspend fun createImageEdit(image:kotlin.collections.List<java.io.File>?,prompt:kotlin.String?,mask:kotlin.collections.List<java.io.File>?,n:kotlin.Int?,size:kotlin.String?,responseFormat:kotlin.String?,user:kotlin.String?,context:OperationRequest):Response<ImagesResponse>
    /* createImageVariation
     * Creates a variation of a given image. */
    suspend fun createImageVariation(image:kotlin.collections.List<java.io.File>?,n:kotlin.Int?,size:kotlin.String?,responseFormat:kotlin.String?,user:kotlin.String?,context:OperationRequest):Response<ImagesResponse>
    /* createModeration
     * Classifies if text violates OpenAI&#39;s Content Policy */
    suspend fun createModeration(createModerationRequest:CreateModerationRequest?,context:OperationRequest):Response<CreateModerationResponse>
    /* createTranscription
     * Transcribes audio into the input language. */
    suspend fun createTranscription(file:kotlin.collections.List<java.io.File>?,model:CreateTranscriptionRequestModel?,prompt:kotlin.String?,responseFormat:kotlin.String?,temperature:java.math.BigDecimal?,language:kotlin.String?,context:OperationRequest):Response<CreateTranscriptionResponse>
    /* createTranslation
     * Translates audio into English. */
    suspend fun createTranslation(file:kotlin.collections.List<java.io.File>?,model:CreateTranscriptionRequestModel?,prompt:kotlin.String?,responseFormat:kotlin.String?,temperature:java.math.BigDecimal?,context:OperationRequest):Response<CreateTranslationResponse>
    /* deleteFile
     * Delete a file. */
    suspend fun deleteFile(fileId:kotlin.String?,context:OperationRequest):Response<DeleteFileResponse>
    /* deleteModel
     * Delete a fine-tuned model. You must have the Owner role in your organization. */
    suspend fun deleteModel(model:kotlin.String?,context:OperationRequest):Response<DeleteModelResponse>
    /* downloadFile
     * Returns the contents of the specified file */
    suspend fun downloadFile(fileId:kotlin.String?,context:OperationRequest):Response<kotlin.String>
    /* listFiles
     * Returns a list of files that belong to the user&#39;s organization. */
    suspend fun listFiles(context:OperationRequest):Response<ListFilesResponse>
    /* listFineTuneEvents
     * Get fine-grained status updates for a fine-tune job.  */
    suspend fun listFineTuneEvents(fineTuneId:kotlin.String?,stream:kotlin.Boolean?,context:OperationRequest):Response<ListFineTuneEventsResponse>
    /* listFineTunes
     * List your organization&#39;s fine-tuning jobs  */
    suspend fun listFineTunes(context:OperationRequest):Response<ListFineTunesResponse>
    /* listModels
     * Lists the currently available models, and provides basic information about each one such as the owner and availability. */
    suspend fun listModels(context:OperationRequest):Response<ListModelsResponse>
    /* retrieveFile
     * Returns information about a specific file. */
    suspend fun retrieveFile(fileId:kotlin.String?,context:OperationRequest):Response<OpenAIFile>
    /* retrieveFineTune
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  */
    suspend fun retrieveFineTune(fineTuneId:kotlin.String?,context:OperationRequest):Response<FineTune>
    /* retrieveModel
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning. */
    suspend fun retrieveModel(model:kotlin.String?,context:OperationRequest):Response<Model>
    companion object {
        const val address = "OpenAIApi-service"
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
            for (m in OpenAIApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(OpenAIApi::class.java, address)
            return routerFactory
        }
    }
}
