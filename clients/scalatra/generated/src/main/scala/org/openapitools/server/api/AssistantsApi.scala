/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.AssistantFileObject
import org.openapitools.server.model.AssistantObject
import org.openapitools.server.model.CreateAssistantFileRequest
import org.openapitools.server.model.CreateAssistantRequest
import org.openapitools.server.model.CreateMessageRequest
import org.openapitools.server.model.CreateRunRequest
import org.openapitools.server.model.CreateThreadAndRunRequest
import org.openapitools.server.model.CreateThreadRequest
import org.openapitools.server.model.DeleteAssistantFileResponse
import org.openapitools.server.model.DeleteAssistantResponse
import org.openapitools.server.model.DeleteThreadResponse
import org.openapitools.server.model.ListAssistantFilesResponse
import org.openapitools.server.model.ListAssistantsResponse
import org.openapitools.server.model.ListMessageFilesResponse
import org.openapitools.server.model.ListMessagesResponse
import org.openapitools.server.model.ListRunStepsResponse
import org.openapitools.server.model.ListRunsResponse
import org.openapitools.server.model.MessageFileObject
import org.openapitools.server.model.MessageObject
import org.openapitools.server.model.ModifyAssistantRequest
import org.openapitools.server.model.ModifyMessageRequest
import org.openapitools.server.model.ModifyRunRequest
import org.openapitools.server.model.ModifyThreadRequest
import org.openapitools.server.model.RunObject
import org.openapitools.server.model.RunStepObject
import org.openapitools.server.model.SubmitToolOutputsRunRequest
import org.openapitools.server.model.ThreadObject

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class AssistantsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "AssistantsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val cancelRunOperation = (apiOperation[RunObject]("cancelRun")
    summary "Cancels a run that is `in_progress`."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""))
  )

  post("/threads/:thread_id/runs/:run_id/cancel", operation(cancelRunOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
  }

  

  val createAssistantOperation = (apiOperation[AssistantObject]("createAssistant")
    summary "Create an assistant with a model and instructions."
    parameters(bodyParam[CreateAssistantRequest]("createAssistantRequest").description(""))
  )

  post("/assistants", operation(createAssistantOperation)) {
    //println("createAssistantRequest: " + createAssistantRequest)
  }

  

  val createAssistantFileOperation = (apiOperation[AssistantFileObject]("createAssistantFile")
    summary "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)."
    parameters(pathParam[String]("assistantId").description(""), bodyParam[CreateAssistantFileRequest]("createAssistantFileRequest").description(""))
  )

  post("/assistants/:assistant_id/files", operation(createAssistantFileOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
    //println("createAssistantFileRequest: " + createAssistantFileRequest)
  }

  

  val createMessageOperation = (apiOperation[MessageObject]("createMessage")
    summary "Create a message."
    parameters(pathParam[String]("threadId").description(""), bodyParam[CreateMessageRequest]("createMessageRequest").description(""))
  )

  post("/threads/:thread_id/messages", operation(createMessageOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    //println("createMessageRequest: " + createMessageRequest)
  }

  

  val createRunOperation = (apiOperation[RunObject]("createRun")
    summary "Create a run."
    parameters(pathParam[String]("threadId").description(""), bodyParam[CreateRunRequest]("createRunRequest").description(""))
  )

  post("/threads/:thread_id/runs", operation(createRunOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    //println("createRunRequest: " + createRunRequest)
  }

  

  val createThreadOperation = (apiOperation[ThreadObject]("createThread")
    summary "Create a thread."
    parameters(bodyParam[CreateThreadRequest]("createThreadRequest").description("").optional)
  )

  post("/threads", operation(createThreadOperation)) {
    //println("createThreadRequest: " + createThreadRequest)
  }

  

  val createThreadAndRunOperation = (apiOperation[RunObject]("createThreadAndRun")
    summary "Create a thread and run it in one request."
    parameters(bodyParam[CreateThreadAndRunRequest]("createThreadAndRunRequest").description(""))
  )

  post("/threads/runs", operation(createThreadAndRunOperation)) {
    //println("createThreadAndRunRequest: " + createThreadAndRunRequest)
  }

  

  val deleteAssistantOperation = (apiOperation[DeleteAssistantResponse]("deleteAssistant")
    summary "Delete an assistant."
    parameters(pathParam[String]("assistantId").description(""))
  )

  delete("/assistants/:assistant_id", operation(deleteAssistantOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
  }

  

  val deleteAssistantFileOperation = (apiOperation[DeleteAssistantFileResponse]("deleteAssistantFile")
    summary "Delete an assistant file."
    parameters(pathParam[String]("assistantId").description(""), pathParam[String]("fileId").description(""))
  )

  delete("/assistants/:assistant_id/files/:file_id", operation(deleteAssistantFileOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
    val fileId = params.getOrElse("fileId", halt(400))
    //println("fileId: " + fileId)
  }

  

  val deleteThreadOperation = (apiOperation[DeleteThreadResponse]("deleteThread")
    summary "Delete a thread."
    parameters(pathParam[String]("threadId").description(""))
  )

  delete("/threads/:thread_id", operation(deleteThreadOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
  }

  

  val getAssistantOperation = (apiOperation[AssistantObject]("getAssistant")
    summary "Retrieves an assistant."
    parameters(pathParam[String]("assistantId").description(""))
  )

  get("/assistants/:assistant_id", operation(getAssistantOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
  }

  

  val getAssistantFileOperation = (apiOperation[AssistantFileObject]("getAssistantFile")
    summary "Retrieves an AssistantFile."
    parameters(pathParam[String]("assistantId").description(""), pathParam[String]("fileId").description(""))
  )

  get("/assistants/:assistant_id/files/:file_id", operation(getAssistantFileOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
    val fileId = params.getOrElse("fileId", halt(400))
    //println("fileId: " + fileId)
  }

  

  val getMessageOperation = (apiOperation[MessageObject]("getMessage")
    summary "Retrieve a message."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("messageId").description(""))
  )

  get("/threads/:thread_id/messages/:message_id", operation(getMessageOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val messageId = params.getOrElse("messageId", halt(400))
    //println("messageId: " + messageId)
  }

  

  val getMessageFileOperation = (apiOperation[MessageFileObject]("getMessageFile")
    summary "Retrieves a message file."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("messageId").description(""), pathParam[String]("fileId").description(""))
  )

  get("/threads/:thread_id/messages/:message_id/files/:file_id", operation(getMessageFileOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val messageId = params.getOrElse("messageId", halt(400))
    //println("messageId: " + messageId)
    val fileId = params.getOrElse("fileId", halt(400))
    //println("fileId: " + fileId)
  }

  

  val getRunOperation = (apiOperation[RunObject]("getRun")
    summary "Retrieves a run."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""))
  )

  get("/threads/:thread_id/runs/:run_id", operation(getRunOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
  }

  

  val getRunStepOperation = (apiOperation[RunStepObject]("getRunStep")
    summary "Retrieves a run step."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""), pathParam[String]("stepId").description(""))
  )

  get("/threads/:thread_id/runs/:run_id/steps/:step_id", operation(getRunStepOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
    val stepId = params.getOrElse("stepId", halt(400))
    //println("stepId: " + stepId)
  }

  

  val getThreadOperation = (apiOperation[ThreadObject]("getThread")
    summary "Retrieves a thread."
    parameters(pathParam[String]("threadId").description(""))
  )

  get("/threads/:thread_id", operation(getThreadOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
  }

  

  val listAssistantFilesOperation = (apiOperation[ListAssistantFilesResponse]("listAssistantFiles")
    summary "Returns a list of assistant files."
    parameters(pathParam[String]("assistantId").description(""), queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional)
  )

  get("/assistants/:assistant_id/files", operation(listAssistantFilesOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
  }

  

  val listAssistantsOperation = (apiOperation[ListAssistantsResponse]("listAssistants")
    summary "Returns a list of assistants."
    parameters(queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional)
  )

  get("/assistants", operation(listAssistantsOperation)) {
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
  }

  

  val listMessageFilesOperation = (apiOperation[ListMessageFilesResponse]("listMessageFiles")
    summary "Returns a list of message files."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("messageId").description(""), queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional)
  )

  get("/threads/:thread_id/messages/:message_id/files", operation(listMessageFilesOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val messageId = params.getOrElse("messageId", halt(400))
    //println("messageId: " + messageId)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
  }

  

  val listMessagesOperation = (apiOperation[ListMessagesResponse]("listMessages")
    summary "Returns a list of messages for a given thread."
    parameters(pathParam[String]("threadId").description(""), queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional, queryParam[String]("runId").description("").optional)
  )

  get("/threads/:thread_id/messages", operation(listMessagesOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
            val runId = params.getAs[String]("runId")

    //println("runId: " + runId)
  }

  

  val listRunStepsOperation = (apiOperation[ListRunStepsResponse]("listRunSteps")
    summary "Returns a list of run steps belonging to a run."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""), queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional)
  )

  get("/threads/:thread_id/runs/:run_id/steps", operation(listRunStepsOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
  }

  

  val listRunsOperation = (apiOperation[ListRunsResponse]("listRuns")
    summary "Returns a list of runs belonging to a thread."
    parameters(pathParam[String]("threadId").description(""), queryParam[Int]("limit").description("").optional.defaultValue(20), queryParam[String]("order").description("").optional.defaultValue(desc), queryParam[String]("after").description("").optional, queryParam[String]("before").description("").optional)
  )

  get("/threads/:thread_id/runs", operation(listRunsOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
            val limit = params.getAs[Int]("limit")

    //println("limit: " + limit)
            val order = params.getAs[String]("order")

    //println("order: " + order)
            val after = params.getAs[String]("after")

    //println("after: " + after)
            val before = params.getAs[String]("before")

    //println("before: " + before)
  }

  

  val modifyAssistantOperation = (apiOperation[AssistantObject]("modifyAssistant")
    summary "Modifies an assistant."
    parameters(pathParam[String]("assistantId").description(""), bodyParam[ModifyAssistantRequest]("modifyAssistantRequest").description(""))
  )

  post("/assistants/:assistant_id", operation(modifyAssistantOperation)) {
    val assistantId = params.getOrElse("assistantId", halt(400))
    //println("assistantId: " + assistantId)
    //println("modifyAssistantRequest: " + modifyAssistantRequest)
  }

  

  val modifyMessageOperation = (apiOperation[MessageObject]("modifyMessage")
    summary "Modifies a message."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("messageId").description(""), bodyParam[ModifyMessageRequest]("modifyMessageRequest").description(""))
  )

  post("/threads/:thread_id/messages/:message_id", operation(modifyMessageOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val messageId = params.getOrElse("messageId", halt(400))
    //println("messageId: " + messageId)
    //println("modifyMessageRequest: " + modifyMessageRequest)
  }

  

  val modifyRunOperation = (apiOperation[RunObject]("modifyRun")
    summary "Modifies a run."
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""), bodyParam[ModifyRunRequest]("modifyRunRequest").description(""))
  )

  post("/threads/:thread_id/runs/:run_id", operation(modifyRunOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
    //println("modifyRunRequest: " + modifyRunRequest)
  }

  

  val modifyThreadOperation = (apiOperation[ThreadObject]("modifyThread")
    summary "Modifies a thread."
    parameters(pathParam[String]("threadId").description(""), bodyParam[ModifyThreadRequest]("modifyThreadRequest").description(""))
  )

  post("/threads/:thread_id", operation(modifyThreadOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    //println("modifyThreadRequest: " + modifyThreadRequest)
  }

  

  val submitToolOuputsToRunOperation = (apiOperation[RunObject]("submitToolOuputsToRun")
    summary "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. "
    parameters(pathParam[String]("threadId").description(""), pathParam[String]("runId").description(""), bodyParam[SubmitToolOutputsRunRequest]("submitToolOutputsRunRequest").description(""))
  )

  post("/threads/:thread_id/runs/:run_id/submit_tool_outputs", operation(submitToolOuputsToRunOperation)) {
    val threadId = params.getOrElse("threadId", halt(400))
    //println("threadId: " + threadId)
    val runId = params.getOrElse("runId", halt(400))
    //println("runId: " + runId)
    //println("submitToolOutputsRunRequest: " + submitToolOutputsRunRequest)
  }

}
