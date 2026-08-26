package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.AssistantObject
import org.openapitools.server.api.model.CreateAssistantRequest
import org.openapitools.server.api.model.CreateMessageRequest
import org.openapitools.server.api.model.CreateRunRequest
import org.openapitools.server.api.model.CreateThreadAndRunRequest
import org.openapitools.server.api.model.CreateThreadRequest
import org.openapitools.server.api.model.DeleteAssistantResponse
import org.openapitools.server.api.model.DeleteMessageResponse
import org.openapitools.server.api.model.DeleteThreadResponse
import org.openapitools.server.api.model.ListAssistantsResponse
import org.openapitools.server.api.model.ListMessagesResponse
import org.openapitools.server.api.model.ListRunStepsResponse
import org.openapitools.server.api.model.ListRunsResponse
import org.openapitools.server.api.model.MessageObject
import org.openapitools.server.api.model.ModifyAssistantRequest
import org.openapitools.server.api.model.ModifyMessageRequest
import org.openapitools.server.api.model.ModifyRunRequest
import org.openapitools.server.api.model.ModifyThreadRequest
import org.openapitools.server.api.model.RunObject
import org.openapitools.server.api.model.RunStepObject
import org.openapitools.server.api.model.SubmitToolOutputsRunRequest
import org.openapitools.server.api.model.ThreadObject

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AssistantsApiAction @Inject constructor(
) : WebAction {

    @Post("/threads/{thread_id}/runs/{run_id}/cancel")
    @Description("Cancels a run that is `in_progress`.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun cancelRun(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String
    ): RunObject {
        TODO()
    }

    @Post("/assistants")
    @Description("Create an assistant with a model and instructions.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createAssistant(
        @Valid @RequestBody createAssistantRequest: CreateAssistantRequest
    ): AssistantObject {
        TODO()
    }

    @Post("/threads/{thread_id}/messages")
    @Description("Create a message.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createMessage(
        @PathParam("thread_id") threadId: kotlin.String, 
        @Valid @RequestBody createMessageRequest: CreateMessageRequest
    ): MessageObject {
        TODO()
    }

    @Post("/threads/{thread_id}/runs")
    @Description("Create a run.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createRun(
        @PathParam("thread_id") threadId: kotlin.String, 
        @Valid @RequestBody createRunRequest: CreateRunRequest, 
         @QueryParam(value = "include[]") include: kotlin.collections.List<kotlin.String>?
    ): RunObject {
        TODO()
    }

    @Post("/threads")
    @Description("Create a thread.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createThread(
        @Valid @RequestBody createThreadRequest: CreateThreadRequest?
    ): ThreadObject {
        TODO()
    }

    @Post("/threads/runs")
    @Description("Create a thread and run it in one request.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createThreadAndRun(
        @Valid @RequestBody createThreadAndRunRequest: CreateThreadAndRunRequest
    ): RunObject {
        TODO()
    }

    @Delete("/assistants/{assistant_id}")
    @Description("Delete an assistant.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteAssistant(
        @PathParam("assistant_id") assistantId: kotlin.String
    ): DeleteAssistantResponse {
        TODO()
    }

    @Delete("/threads/{thread_id}/messages/{message_id}")
    @Description("Deletes a message.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteMessage(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("message_id") messageId: kotlin.String
    ): DeleteMessageResponse {
        TODO()
    }

    @Delete("/threads/{thread_id}")
    @Description("Delete a thread.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun deleteThread(
        @PathParam("thread_id") threadId: kotlin.String
    ): DeleteThreadResponse {
        TODO()
    }

    @Get("/assistants/{assistant_id}")
    @Description("Retrieves an assistant.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAssistant(
        @PathParam("assistant_id") assistantId: kotlin.String
    ): AssistantObject {
        TODO()
    }

    @Get("/threads/{thread_id}/messages/{message_id}")
    @Description("Retrieve a message.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getMessage(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("message_id") messageId: kotlin.String
    ): MessageObject {
        TODO()
    }

    @Get("/threads/{thread_id}/runs/{run_id}")
    @Description("Retrieves a run.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getRun(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String
    ): RunObject {
        TODO()
    }

    @Get("/threads/{thread_id}/runs/{run_id}/steps/{step_id}")
    @Description("Retrieves a run step.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getRunStep(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String, 
        @PathParam("step_id") stepId: kotlin.String, 
         @QueryParam(value = "include[]") include: kotlin.collections.List<kotlin.String>?
    ): RunStepObject {
        TODO()
    }

    @Get("/threads/{thread_id}")
    @Description("Retrieves a thread.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getThread(
        @PathParam("thread_id") threadId: kotlin.String
    ): ThreadObject {
        TODO()
    }

    @Get("/assistants")
    @Description("Returns a list of assistants.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listAssistants(
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?
    ): ListAssistantsResponse {
        TODO()
    }

    @Get("/threads/{thread_id}/messages")
    @Description("Returns a list of messages for a given thread.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listMessages(
        @PathParam("thread_id") threadId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?, 
         @QueryParam(value = "run_id") runId: kotlin.String?
    ): ListMessagesResponse {
        TODO()
    }

    @Get("/threads/{thread_id}/runs/{run_id}/steps")
    @Description("Returns a list of run steps belonging to a run.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listRunSteps(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?, 
         @QueryParam(value = "include[]") include: kotlin.collections.List<kotlin.String>?
    ): ListRunStepsResponse {
        TODO()
    }

    @Get("/threads/{thread_id}/runs")
    @Description("Returns a list of runs belonging to a thread.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listRuns(
        @PathParam("thread_id") threadId: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "order") order: kotlin.String, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?
    ): ListRunsResponse {
        TODO()
    }

    @Post("/assistants/{assistant_id}")
    @Description("Modifies an assistant.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyAssistant(
        @PathParam("assistant_id") assistantId: kotlin.String, 
        @Valid @RequestBody modifyAssistantRequest: ModifyAssistantRequest
    ): AssistantObject {
        TODO()
    }

    @Post("/threads/{thread_id}/messages/{message_id}")
    @Description("Modifies a message.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyMessage(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("message_id") messageId: kotlin.String, 
        @Valid @RequestBody modifyMessageRequest: ModifyMessageRequest
    ): MessageObject {
        TODO()
    }

    @Post("/threads/{thread_id}/runs/{run_id}")
    @Description("Modifies a run.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyRun(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String, 
        @Valid @RequestBody modifyRunRequest: ModifyRunRequest
    ): RunObject {
        TODO()
    }

    @Post("/threads/{thread_id}")
    @Description("Modifies a thread.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun modifyThread(
        @PathParam("thread_id") threadId: kotlin.String, 
        @Valid @RequestBody modifyThreadRequest: ModifyThreadRequest
    ): ThreadObject {
        TODO()
    }

    @Post("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Description("When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun submitToolOuputsToRun(
        @PathParam("thread_id") threadId: kotlin.String, 
        @PathParam("run_id") runId: kotlin.String, 
        @Valid @RequestBody submitToolOutputsRunRequest: SubmitToolOutputsRunRequest
    ): RunObject {
        TODO()
    }
}
