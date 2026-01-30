package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AssistantObject
import model.CreateAssistantRequest
import model.CreateMessageRequest
import model.CreateRunRequest
import model.CreateThreadAndRunRequest
import model.CreateThreadRequest
import model.DeleteAssistantResponse
import model.DeleteMessageResponse
import model.DeleteThreadResponse
import model.ListAssistantsResponse
import model.ListMessagesResponse
import model.ListRunStepsResponse
import model.ListRunsResponse
import model.MessageObject
import model.ModifyAssistantRequest
import model.ModifyMessageRequest
import model.ModifyRunRequest
import model.ModifyThreadRequest
import model.RunObject
import model.RunStepObject
import model.SubmitToolOutputsRunRequest
import model.ThreadObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class AssistantsApiController @Inject()(cc: ControllerComponents, api: AssistantsApi) extends AbstractController(cc) {
  /**
    * POST /v1/threads/:threadId/runs/:runId/cancel
    * @param threadId The ID of the thread to which this run belongs.
    * @param runId The ID of the run to cancel.
    */
  def cancelRun(threadId: String, runId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      api.cancelRun(threadId, runId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/assistants
    */
  def createAssistant(): Action[AnyContent] = Action { request =>
    def executeApi(): AssistantObject = {
      val createAssistantRequest = request.body.asJson.map(_.as[CreateAssistantRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createAssistantRequest")
      }
      api.createAssistant(createAssistantRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId/messages
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
    */
  def createMessage(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MessageObject = {
      val createMessageRequest = request.body.asJson.map(_.as[CreateMessageRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createMessageRequest")
      }
      api.createMessage(threadId, createMessageRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId/runs?includeLeft_Square_BracketRight_Square_Bracket=[value]
    * @param threadId The ID of the thread to run.
    */
  def createRun(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      val createRunRequest = request.body.asJson.map(_.as[CreateRunRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createRunRequest")
      }
      val includeLeft_Square_BracketRight_Square_Bracket = request.queryString.get("include[]")
        .map(_.toList)
        
      api.createRun(threadId, createRunRequest, includeLeft_Square_BracketRight_Square_Bracket)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads
    */
  def createThread(): Action[AnyContent] = Action { request =>
    def executeApi(): ThreadObject = {
      val createThreadRequest = request.body.asJson.map(_.as[CreateThreadRequest])
      api.createThread(createThreadRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/runs
    */
  def createThreadAndRun(): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      val createThreadAndRunRequest = request.body.asJson.map(_.as[CreateThreadAndRunRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createThreadAndRunRequest")
      }
      api.createThreadAndRun(createThreadAndRunRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/assistants/:assistantId
    * @param assistantId The ID of the assistant to delete.
    */
  def deleteAssistant(assistantId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteAssistantResponse = {
      api.deleteAssistant(assistantId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/threads/:threadId/messages/:messageId
    * @param threadId The ID of the thread to which this message belongs.
    * @param messageId The ID of the message to delete.
    */
  def deleteMessage(threadId: String, messageId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteMessageResponse = {
      api.deleteMessage(threadId, messageId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/threads/:threadId
    * @param threadId The ID of the thread to delete.
    */
  def deleteThread(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteThreadResponse = {
      api.deleteThread(threadId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/assistants/:assistantId
    * @param assistantId The ID of the assistant to retrieve.
    */
  def getAssistant(assistantId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AssistantObject = {
      api.getAssistant(assistantId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/messages/:messageId
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    * @param messageId The ID of the message to retrieve.
    */
  def getMessage(threadId: String, messageId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MessageObject = {
      api.getMessage(threadId, messageId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/runs/:runId
    * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
    * @param runId The ID of the run to retrieve.
    */
  def getRun(threadId: String, runId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      api.getRun(threadId, runId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/runs/:runId/steps/:stepId?includeLeft_Square_BracketRight_Square_Bracket=[value]
    * @param threadId The ID of the thread to which the run and run step belongs.
    * @param runId The ID of the run to which the run step belongs.
    * @param stepId The ID of the run step to retrieve.
    */
  def getRunStep(threadId: String, runId: String, stepId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunStepObject = {
      val includeLeft_Square_BracketRight_Square_Bracket = request.queryString.get("include[]")
        .map(_.toList)
        
      api.getRunStep(threadId, runId, stepId, includeLeft_Square_BracketRight_Square_Bracket)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId
    * @param threadId The ID of the thread to retrieve.
    */
  def getThread(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ThreadObject = {
      api.getThread(threadId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/assistants?limit=[value]&order=[value]&after=[value]&before=[value]
    */
  def listAssistants(): Action[AnyContent] = Action { request =>
    def executeApi(): ListAssistantsResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      api.listAssistants(limit, order, after, before)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/messages?limit=[value]&order=[value]&after=[value]&before=[value]&runId=[value]
    * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
    */
  def listMessages(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListMessagesResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      val runId = request.getQueryString("run_id")
        
      api.listMessages(threadId, limit, order, after, before, runId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/runs/:runId/steps?limit=[value]&order=[value]&after=[value]&before=[value]&includeLeft_Square_BracketRight_Square_Bracket=[value]
    * @param threadId The ID of the thread the run and run steps belong to.
    * @param runId The ID of the run the run steps belong to.
    */
  def listRunSteps(threadId: String, runId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListRunStepsResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      val includeLeft_Square_BracketRight_Square_Bracket = request.queryString.get("include[]")
        .map(_.toList)
        
      api.listRunSteps(threadId, runId, limit, order, after, before, includeLeft_Square_BracketRight_Square_Bracket)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/threads/:threadId/runs?limit=[value]&order=[value]&after=[value]&before=[value]
    * @param threadId The ID of the thread the run belongs to.
    */
  def listRuns(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListRunsResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      api.listRuns(threadId, limit, order, after, before)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/assistants/:assistantId
    * @param assistantId The ID of the assistant to modify.
    */
  def modifyAssistant(assistantId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AssistantObject = {
      val modifyAssistantRequest = request.body.asJson.map(_.as[ModifyAssistantRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "modifyAssistantRequest")
      }
      api.modifyAssistant(assistantId, modifyAssistantRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId/messages/:messageId
    * @param threadId The ID of the thread to which this message belongs.
    * @param messageId The ID of the message to modify.
    */
  def modifyMessage(threadId: String, messageId: String): Action[AnyContent] = Action { request =>
    def executeApi(): MessageObject = {
      val modifyMessageRequest = request.body.asJson.map(_.as[ModifyMessageRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "modifyMessageRequest")
      }
      api.modifyMessage(threadId, messageId, modifyMessageRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId/runs/:runId
    * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
    * @param runId The ID of the run to modify.
    */
  def modifyRun(threadId: String, runId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      val modifyRunRequest = request.body.asJson.map(_.as[ModifyRunRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "modifyRunRequest")
      }
      api.modifyRun(threadId, runId, modifyRunRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId
    * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
    */
  def modifyThread(threadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ThreadObject = {
      val modifyThreadRequest = request.body.asJson.map(_.as[ModifyThreadRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "modifyThreadRequest")
      }
      api.modifyThread(threadId, modifyThreadRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/threads/:threadId/runs/:runId/submit_tool_outputs
    * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    * @param runId The ID of the run that requires the tool output submission.
    */
  def submitToolOuputsToRun(threadId: String, runId: String): Action[AnyContent] = Action { request =>
    def executeApi(): RunObject = {
      val submitToolOutputsRunRequest = request.body.asJson.map(_.as[SubmitToolOutputsRunRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "submitToolOutputsRunRequest")
      }
      api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
