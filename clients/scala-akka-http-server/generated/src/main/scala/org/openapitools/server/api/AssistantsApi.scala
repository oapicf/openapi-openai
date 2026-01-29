package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
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


class AssistantsApi(
    assistantsService: AssistantsApiService,
    assistantsMarshaller: AssistantsApiMarshaller
) {

  
  import assistantsMarshaller._

  lazy val route: Route =
    path("threads" / Segment / "runs" / Segment / "cancel") { (threadId, runId) => 
      post {  
            assistantsService.cancelRun(threadId = threadId, runId = runId)
      }
    } ~
    path("assistants") { 
      post {  
            entity(as[CreateAssistantRequest]){ createAssistantRequest =>
              assistantsService.createAssistant(createAssistantRequest = createAssistantRequest)
            }
      }
    } ~
    path("assistants" / Segment / "files") { (assistantId) => 
      post {  
            entity(as[CreateAssistantFileRequest]){ createAssistantFileRequest =>
              assistantsService.createAssistantFile(assistantId = assistantId, createAssistantFileRequest = createAssistantFileRequest)
            }
      }
    } ~
    path("threads" / Segment / "messages") { (threadId) => 
      post {  
            entity(as[CreateMessageRequest]){ createMessageRequest =>
              assistantsService.createMessage(threadId = threadId, createMessageRequest = createMessageRequest)
            }
      }
    } ~
    path("threads" / Segment / "runs") { (threadId) => 
      post {  
            entity(as[CreateRunRequest]){ createRunRequest =>
              assistantsService.createRun(threadId = threadId, createRunRequest = createRunRequest)
            }
      }
    } ~
    path("threads") { 
      post {  
            entity(as[CreateThreadRequest]){ createThreadRequest =>
              assistantsService.createThread(createThreadRequest = createThreadRequest)
            }
      }
    } ~
    path("threads" / "runs") { 
      post {  
            entity(as[CreateThreadAndRunRequest]){ createThreadAndRunRequest =>
              assistantsService.createThreadAndRun(createThreadAndRunRequest = createThreadAndRunRequest)
            }
      }
    } ~
    path("assistants" / Segment) { (assistantId) => 
      delete {  
            assistantsService.deleteAssistant(assistantId = assistantId)
      }
    } ~
    path("assistants" / Segment / "files" / Segment) { (assistantId, fileId) => 
      delete {  
            assistantsService.deleteAssistantFile(assistantId = assistantId, fileId = fileId)
      }
    } ~
    path("threads" / Segment) { (threadId) => 
      delete {  
            assistantsService.deleteThread(threadId = threadId)
      }
    } ~
    path("assistants" / Segment) { (assistantId) => 
      get {  
            assistantsService.getAssistant(assistantId = assistantId)
      }
    } ~
    path("assistants" / Segment / "files" / Segment) { (assistantId, fileId) => 
      get {  
            assistantsService.getAssistantFile(assistantId = assistantId, fileId = fileId)
      }
    } ~
    path("threads" / Segment / "messages" / Segment) { (threadId, messageId) => 
      get {  
            assistantsService.getMessage(threadId = threadId, messageId = messageId)
      }
    } ~
    path("threads" / Segment / "messages" / Segment / "files" / Segment) { (threadId, messageId, fileId) => 
      get {  
            assistantsService.getMessageFile(threadId = threadId, messageId = messageId, fileId = fileId)
      }
    } ~
    path("threads" / Segment / "runs" / Segment) { (threadId, runId) => 
      get {  
            assistantsService.getRun(threadId = threadId, runId = runId)
      }
    } ~
    path("threads" / Segment / "runs" / Segment / "steps" / Segment) { (threadId, runId, stepId) => 
      get {  
            assistantsService.getRunStep(threadId = threadId, runId = runId, stepId = stepId)
      }
    } ~
    path("threads" / Segment) { (threadId) => 
      get {  
            assistantsService.getThread(threadId = threadId)
      }
    } ~
    path("assistants" / Segment / "files") { (assistantId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            assistantsService.listAssistantFiles(assistantId = assistantId, limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("assistants") { 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            assistantsService.listAssistants(limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("threads" / Segment / "messages" / Segment / "files") { (threadId, messageId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            assistantsService.listMessageFiles(threadId = threadId, messageId = messageId, limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("threads" / Segment / "messages") { (threadId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?, "run_id".as[String].?) { (limit, order, after, before, runId) => 
            assistantsService.listMessages(threadId = threadId, limit = limit, order = order, after = after, before = before, runId = runId)
        }
      }
    } ~
    path("threads" / Segment / "runs" / Segment / "steps") { (threadId, runId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            assistantsService.listRunSteps(threadId = threadId, runId = runId, limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("threads" / Segment / "runs") { (threadId) => 
      get { 
        parameters("limit".as[Int].?(20), "order".as[String].?("desc"), "after".as[String].?, "before".as[String].?) { (limit, order, after, before) => 
            assistantsService.listRuns(threadId = threadId, limit = limit, order = order, after = after, before = before)
        }
      }
    } ~
    path("assistants" / Segment) { (assistantId) => 
      post {  
            entity(as[ModifyAssistantRequest]){ modifyAssistantRequest =>
              assistantsService.modifyAssistant(assistantId = assistantId, modifyAssistantRequest = modifyAssistantRequest)
            }
      }
    } ~
    path("threads" / Segment / "messages" / Segment) { (threadId, messageId) => 
      post {  
            entity(as[ModifyMessageRequest]){ modifyMessageRequest =>
              assistantsService.modifyMessage(threadId = threadId, messageId = messageId, modifyMessageRequest = modifyMessageRequest)
            }
      }
    } ~
    path("threads" / Segment / "runs" / Segment) { (threadId, runId) => 
      post {  
            entity(as[ModifyRunRequest]){ modifyRunRequest =>
              assistantsService.modifyRun(threadId = threadId, runId = runId, modifyRunRequest = modifyRunRequest)
            }
      }
    } ~
    path("threads" / Segment) { (threadId) => 
      post {  
            entity(as[ModifyThreadRequest]){ modifyThreadRequest =>
              assistantsService.modifyThread(threadId = threadId, modifyThreadRequest = modifyThreadRequest)
            }
      }
    } ~
    path("threads" / Segment / "runs" / Segment / "submit_tool_outputs") { (threadId, runId) => 
      post {  
            entity(as[SubmitToolOutputsRunRequest]){ submitToolOutputsRunRequest =>
              assistantsService.submitToolOuputsToRun(threadId = threadId, runId = runId, submitToolOutputsRunRequest = submitToolOutputsRunRequest)
            }
      }
    }
}


trait AssistantsApiService {

  def cancelRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def cancelRun(threadId: String, runId: String)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

  def createAssistant200(responseAssistantObject: AssistantObject)(implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route =
    complete((200, responseAssistantObject))
  /**
   * Code: 200, Message: OK, DataType: AssistantObject
   */
  def createAssistant(createAssistantRequest: CreateAssistantRequest)
      (implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route

  def createAssistantFile200(responseAssistantFileObject: AssistantFileObject)(implicit toEntityMarshallerAssistantFileObject: ToEntityMarshaller[AssistantFileObject]): Route =
    complete((200, responseAssistantFileObject))
  /**
   * Code: 200, Message: OK, DataType: AssistantFileObject
   */
  def createAssistantFile(assistantId: String, createAssistantFileRequest: CreateAssistantFileRequest)
      (implicit toEntityMarshallerAssistantFileObject: ToEntityMarshaller[AssistantFileObject]): Route

  def createMessage200(responseMessageObject: MessageObject)(implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route =
    complete((200, responseMessageObject))
  /**
   * Code: 200, Message: OK, DataType: MessageObject
   */
  def createMessage(threadId: String, createMessageRequest: CreateMessageRequest)
      (implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route

  def createRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def createRun(threadId: String, createRunRequest: CreateRunRequest)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

  def createThread200(responseThreadObject: ThreadObject)(implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route =
    complete((200, responseThreadObject))
  /**
   * Code: 200, Message: OK, DataType: ThreadObject
   */
  def createThread(createThreadRequest: Option[CreateThreadRequest])
      (implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route

  def createThreadAndRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

  def deleteAssistant200(responseDeleteAssistantResponse: DeleteAssistantResponse)(implicit toEntityMarshallerDeleteAssistantResponse: ToEntityMarshaller[DeleteAssistantResponse]): Route =
    complete((200, responseDeleteAssistantResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteAssistantResponse
   */
  def deleteAssistant(assistantId: String)
      (implicit toEntityMarshallerDeleteAssistantResponse: ToEntityMarshaller[DeleteAssistantResponse]): Route

  def deleteAssistantFile200(responseDeleteAssistantFileResponse: DeleteAssistantFileResponse)(implicit toEntityMarshallerDeleteAssistantFileResponse: ToEntityMarshaller[DeleteAssistantFileResponse]): Route =
    complete((200, responseDeleteAssistantFileResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteAssistantFileResponse
   */
  def deleteAssistantFile(assistantId: String, fileId: String)
      (implicit toEntityMarshallerDeleteAssistantFileResponse: ToEntityMarshaller[DeleteAssistantFileResponse]): Route

  def deleteThread200(responseDeleteThreadResponse: DeleteThreadResponse)(implicit toEntityMarshallerDeleteThreadResponse: ToEntityMarshaller[DeleteThreadResponse]): Route =
    complete((200, responseDeleteThreadResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteThreadResponse
   */
  def deleteThread(threadId: String)
      (implicit toEntityMarshallerDeleteThreadResponse: ToEntityMarshaller[DeleteThreadResponse]): Route

  def getAssistant200(responseAssistantObject: AssistantObject)(implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route =
    complete((200, responseAssistantObject))
  /**
   * Code: 200, Message: OK, DataType: AssistantObject
   */
  def getAssistant(assistantId: String)
      (implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route

  def getAssistantFile200(responseAssistantFileObject: AssistantFileObject)(implicit toEntityMarshallerAssistantFileObject: ToEntityMarshaller[AssistantFileObject]): Route =
    complete((200, responseAssistantFileObject))
  /**
   * Code: 200, Message: OK, DataType: AssistantFileObject
   */
  def getAssistantFile(assistantId: String, fileId: String)
      (implicit toEntityMarshallerAssistantFileObject: ToEntityMarshaller[AssistantFileObject]): Route

  def getMessage200(responseMessageObject: MessageObject)(implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route =
    complete((200, responseMessageObject))
  /**
   * Code: 200, Message: OK, DataType: MessageObject
   */
  def getMessage(threadId: String, messageId: String)
      (implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route

  def getMessageFile200(responseMessageFileObject: MessageFileObject)(implicit toEntityMarshallerMessageFileObject: ToEntityMarshaller[MessageFileObject]): Route =
    complete((200, responseMessageFileObject))
  /**
   * Code: 200, Message: OK, DataType: MessageFileObject
   */
  def getMessageFile(threadId: String, messageId: String, fileId: String)
      (implicit toEntityMarshallerMessageFileObject: ToEntityMarshaller[MessageFileObject]): Route

  def getRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def getRun(threadId: String, runId: String)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

  def getRunStep200(responseRunStepObject: RunStepObject)(implicit toEntityMarshallerRunStepObject: ToEntityMarshaller[RunStepObject]): Route =
    complete((200, responseRunStepObject))
  /**
   * Code: 200, Message: OK, DataType: RunStepObject
   */
  def getRunStep(threadId: String, runId: String, stepId: String)
      (implicit toEntityMarshallerRunStepObject: ToEntityMarshaller[RunStepObject]): Route

  def getThread200(responseThreadObject: ThreadObject)(implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route =
    complete((200, responseThreadObject))
  /**
   * Code: 200, Message: OK, DataType: ThreadObject
   */
  def getThread(threadId: String)
      (implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route

  def listAssistantFiles200(responseListAssistantFilesResponse: ListAssistantFilesResponse)(implicit toEntityMarshallerListAssistantFilesResponse: ToEntityMarshaller[ListAssistantFilesResponse]): Route =
    complete((200, responseListAssistantFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListAssistantFilesResponse
   */
  def listAssistantFiles(assistantId: String, limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListAssistantFilesResponse: ToEntityMarshaller[ListAssistantFilesResponse]): Route

  def listAssistants200(responseListAssistantsResponse: ListAssistantsResponse)(implicit toEntityMarshallerListAssistantsResponse: ToEntityMarshaller[ListAssistantsResponse]): Route =
    complete((200, responseListAssistantsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListAssistantsResponse
   */
  def listAssistants(limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListAssistantsResponse: ToEntityMarshaller[ListAssistantsResponse]): Route

  def listMessageFiles200(responseListMessageFilesResponse: ListMessageFilesResponse)(implicit toEntityMarshallerListMessageFilesResponse: ToEntityMarshaller[ListMessageFilesResponse]): Route =
    complete((200, responseListMessageFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListMessageFilesResponse
   */
  def listMessageFiles(threadId: String, messageId: String, limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListMessageFilesResponse: ToEntityMarshaller[ListMessageFilesResponse]): Route

  def listMessages200(responseListMessagesResponse: ListMessagesResponse)(implicit toEntityMarshallerListMessagesResponse: ToEntityMarshaller[ListMessagesResponse]): Route =
    complete((200, responseListMessagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListMessagesResponse
   */
  def listMessages(threadId: String, limit: Int, order: String, after: Option[String], before: Option[String], runId: Option[String])
      (implicit toEntityMarshallerListMessagesResponse: ToEntityMarshaller[ListMessagesResponse]): Route

  def listRunSteps200(responseListRunStepsResponse: ListRunStepsResponse)(implicit toEntityMarshallerListRunStepsResponse: ToEntityMarshaller[ListRunStepsResponse]): Route =
    complete((200, responseListRunStepsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListRunStepsResponse
   */
  def listRunSteps(threadId: String, runId: String, limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListRunStepsResponse: ToEntityMarshaller[ListRunStepsResponse]): Route

  def listRuns200(responseListRunsResponse: ListRunsResponse)(implicit toEntityMarshallerListRunsResponse: ToEntityMarshaller[ListRunsResponse]): Route =
    complete((200, responseListRunsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListRunsResponse
   */
  def listRuns(threadId: String, limit: Int, order: String, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListRunsResponse: ToEntityMarshaller[ListRunsResponse]): Route

  def modifyAssistant200(responseAssistantObject: AssistantObject)(implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route =
    complete((200, responseAssistantObject))
  /**
   * Code: 200, Message: OK, DataType: AssistantObject
   */
  def modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest)
      (implicit toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]): Route

  def modifyMessage200(responseMessageObject: MessageObject)(implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route =
    complete((200, responseMessageObject))
  /**
   * Code: 200, Message: OK, DataType: MessageObject
   */
  def modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest)
      (implicit toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]): Route

  def modifyRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

  def modifyThread200(responseThreadObject: ThreadObject)(implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route =
    complete((200, responseThreadObject))
  /**
   * Code: 200, Message: OK, DataType: ThreadObject
   */
  def modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest)
      (implicit toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]): Route

  def submitToolOuputsToRun200(responseRunObject: RunObject)(implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route =
    complete((200, responseRunObject))
  /**
   * Code: 200, Message: OK, DataType: RunObject
   */
  def submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest)
      (implicit toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]): Route

}

trait AssistantsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateAssistantFileRequest: FromEntityUnmarshaller[CreateAssistantFileRequest]

  implicit def fromEntityUnmarshallerCreateRunRequest: FromEntityUnmarshaller[CreateRunRequest]

  implicit def fromEntityUnmarshallerSubmitToolOutputsRunRequest: FromEntityUnmarshaller[SubmitToolOutputsRunRequest]

  implicit def fromEntityUnmarshallerCreateThreadRequest: FromEntityUnmarshaller[CreateThreadRequest]

  implicit def fromEntityUnmarshallerCreateAssistantRequest: FromEntityUnmarshaller[CreateAssistantRequest]

  implicit def fromEntityUnmarshallerModifyRunRequest: FromEntityUnmarshaller[ModifyRunRequest]

  implicit def fromEntityUnmarshallerCreateMessageRequest: FromEntityUnmarshaller[CreateMessageRequest]

  implicit def fromEntityUnmarshallerModifyThreadRequest: FromEntityUnmarshaller[ModifyThreadRequest]

  implicit def fromEntityUnmarshallerCreateThreadAndRunRequest: FromEntityUnmarshaller[CreateThreadAndRunRequest]

  implicit def fromEntityUnmarshallerModifyAssistantRequest: FromEntityUnmarshaller[ModifyAssistantRequest]

  implicit def fromEntityUnmarshallerModifyMessageRequest: FromEntityUnmarshaller[ModifyMessageRequest]



  implicit def toEntityMarshallerListMessageFilesResponse: ToEntityMarshaller[ListMessageFilesResponse]

  implicit def toEntityMarshallerRunObject: ToEntityMarshaller[RunObject]

  implicit def toEntityMarshallerAssistantFileObject: ToEntityMarshaller[AssistantFileObject]

  implicit def toEntityMarshallerDeleteAssistantFileResponse: ToEntityMarshaller[DeleteAssistantFileResponse]

  implicit def toEntityMarshallerListAssistantFilesResponse: ToEntityMarshaller[ListAssistantFilesResponse]

  implicit def toEntityMarshallerMessageObject: ToEntityMarshaller[MessageObject]

  implicit def toEntityMarshallerDeleteAssistantResponse: ToEntityMarshaller[DeleteAssistantResponse]

  implicit def toEntityMarshallerMessageFileObject: ToEntityMarshaller[MessageFileObject]

  implicit def toEntityMarshallerAssistantObject: ToEntityMarshaller[AssistantObject]

  implicit def toEntityMarshallerDeleteThreadResponse: ToEntityMarshaller[DeleteThreadResponse]

  implicit def toEntityMarshallerListMessagesResponse: ToEntityMarshaller[ListMessagesResponse]

  implicit def toEntityMarshallerListRunStepsResponse: ToEntityMarshaller[ListRunStepsResponse]

  implicit def toEntityMarshallerListRunsResponse: ToEntityMarshaller[ListRunsResponse]

  implicit def toEntityMarshallerListAssistantsResponse: ToEntityMarshaller[ListAssistantsResponse]

  implicit def toEntityMarshallerRunStepObject: ToEntityMarshaller[RunStepObject]

  implicit def toEntityMarshallerThreadObject: ToEntityMarshaller[ThreadObject]

}

