package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AssistantObject
import org.openapitools.models.CreateAssistantRequest
import org.openapitools.models.CreateMessageRequest
import org.openapitools.models.CreateRunRequest
import org.openapitools.models.CreateThreadAndRunRequest
import org.openapitools.models.CreateThreadRequest
import org.openapitools.models.DeleteAssistantResponse
import org.openapitools.models.DeleteMessageResponse
import org.openapitools.models.DeleteThreadResponse
import org.openapitools.models.ListAssistantsResponse
import org.openapitools.models.ListMessagesResponse
import org.openapitools.models.ListRunStepsResponse
import org.openapitools.models.ListRunsResponse
import org.openapitools.models.MessageObject
import org.openapitools.models.ModifyAssistantRequest
import org.openapitools.models.ModifyMessageRequest
import org.openapitools.models.ModifyRunRequest
import org.openapitools.models.ModifyThreadRequest
import org.openapitools.models.RunObject
import org.openapitools.models.RunStepObject
import scala.collection.immutable.Seq
import org.openapitools.models.SubmitToolOutputsRunRequest
import org.openapitools.models.ThreadObject
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object AssistantsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        cancelRun(da) :+:
        createAssistant(da) :+:
        createMessage(da) :+:
        createRun(da) :+:
        createThread(da) :+:
        createThreadAndRun(da) :+:
        deleteAssistant(da) :+:
        deleteMessage(da) :+:
        deleteThread(da) :+:
        getAssistant(da) :+:
        getMessage(da) :+:
        getRun(da) :+:
        getRunStep(da) :+:
        getThread(da) :+:
        listAssistants(da) :+:
        listMessages(da) :+:
        listRunSteps(da) :+:
        listRuns(da) :+:
        modifyAssistant(da) :+:
        modifyMessage(da) :+:
        modifyRun(da) :+:
        modifyThread(da) :+:
        submitToolOuputsToRun(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def cancelRun(da: DataAccessor): Endpoint[RunObject] =
        post("threads" :: string :: "runs" :: string :: "cancel") { (threadId: String, runId: String) =>
          da.Assistants_cancelRun(threadId, runId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AssistantObject
        */
        private def createAssistant(da: DataAccessor): Endpoint[AssistantObject] =
        post("assistants" :: jsonBody[CreateAssistantRequest]) { (createAssistantRequest: CreateAssistantRequest) =>
          da.Assistants_createAssistant(createAssistantRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MessageObject
        */
        private def createMessage(da: DataAccessor): Endpoint[MessageObject] =
        post("threads" :: string :: "messages" :: jsonBody[CreateMessageRequest]) { (threadId: String, createMessageRequest: CreateMessageRequest) =>
          da.Assistants_createMessage(threadId, createMessageRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def createRun(da: DataAccessor): Endpoint[RunObject] =
        post("threads" :: string :: "runs" :: jsonBody[CreateRunRequest] :: params("include[]")) { (threadId: String, createRunRequest: CreateRunRequest, includeLeft_Square_BracketRight_Square_Bracket: Seq[String]) =>
          da.Assistants_createRun(threadId, createRunRequest, includeLeft_Square_BracketRight_Square_Bracket) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ThreadObject
        */
        private def createThread(da: DataAccessor): Endpoint[ThreadObject] =
        post("threads" :: jsonBody[CreateThreadRequest]) { (createThreadRequest: CreateThreadRequest) =>
          da.Assistants_createThread(createThreadRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def createThreadAndRun(da: DataAccessor): Endpoint[RunObject] =
        post("threads" :: "runs" :: jsonBody[CreateThreadAndRunRequest]) { (createThreadAndRunRequest: CreateThreadAndRunRequest) =>
          da.Assistants_createThreadAndRun(createThreadAndRunRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteAssistantResponse
        */
        private def deleteAssistant(da: DataAccessor): Endpoint[DeleteAssistantResponse] =
        delete("assistants" :: string) { (assistantId: String) =>
          da.Assistants_deleteAssistant(assistantId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteMessageResponse
        */
        private def deleteMessage(da: DataAccessor): Endpoint[DeleteMessageResponse] =
        delete("threads" :: string :: "messages" :: string) { (threadId: String, messageId: String) =>
          da.Assistants_deleteMessage(threadId, messageId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteThreadResponse
        */
        private def deleteThread(da: DataAccessor): Endpoint[DeleteThreadResponse] =
        delete("threads" :: string) { (threadId: String) =>
          da.Assistants_deleteThread(threadId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AssistantObject
        */
        private def getAssistant(da: DataAccessor): Endpoint[AssistantObject] =
        get("assistants" :: string) { (assistantId: String) =>
          da.Assistants_getAssistant(assistantId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MessageObject
        */
        private def getMessage(da: DataAccessor): Endpoint[MessageObject] =
        get("threads" :: string :: "messages" :: string) { (threadId: String, messageId: String) =>
          da.Assistants_getMessage(threadId, messageId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def getRun(da: DataAccessor): Endpoint[RunObject] =
        get("threads" :: string :: "runs" :: string) { (threadId: String, runId: String) =>
          da.Assistants_getRun(threadId, runId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunStepObject
        */
        private def getRunStep(da: DataAccessor): Endpoint[RunStepObject] =
        get("threads" :: string :: "runs" :: string :: "steps" :: string :: params("include[]")) { (threadId: String, runId: String, stepId: String, includeLeft_Square_BracketRight_Square_Bracket: Seq[String]) =>
          da.Assistants_getRunStep(threadId, runId, stepId, includeLeft_Square_BracketRight_Square_Bracket) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ThreadObject
        */
        private def getThread(da: DataAccessor): Endpoint[ThreadObject] =
        get("threads" :: string) { (threadId: String) =>
          da.Assistants_getThread(threadId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListAssistantsResponse
        */
        private def listAssistants(da: DataAccessor): Endpoint[ListAssistantsResponse] =
        get("assistants" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before")) { (limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]) =>
          da.Assistants_listAssistants(limit, order, after, before) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListMessagesResponse
        */
        private def listMessages(da: DataAccessor): Endpoint[ListMessagesResponse] =
        get("threads" :: string :: "messages" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before") :: paramOption("run_id")) { (threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], runId: Option[String]) =>
          da.Assistants_listMessages(threadId, limit, order, after, before, runId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListRunStepsResponse
        */
        private def listRunSteps(da: DataAccessor): Endpoint[ListRunStepsResponse] =
        get("threads" :: string :: "runs" :: string :: "steps" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before") :: params("include[]")) { (threadId: String, runId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], includeLeft_Square_BracketRight_Square_Bracket: Seq[String]) =>
          da.Assistants_listRunSteps(threadId, runId, limit, order, after, before, includeLeft_Square_BracketRight_Square_Bracket) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListRunsResponse
        */
        private def listRuns(da: DataAccessor): Endpoint[ListRunsResponse] =
        get("threads" :: string :: "runs" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before")) { (threadId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]) =>
          da.Assistants_listRuns(threadId, limit, order, after, before) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AssistantObject
        */
        private def modifyAssistant(da: DataAccessor): Endpoint[AssistantObject] =
        post("assistants" :: string :: jsonBody[ModifyAssistantRequest]) { (assistantId: String, modifyAssistantRequest: ModifyAssistantRequest) =>
          da.Assistants_modifyAssistant(assistantId, modifyAssistantRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a MessageObject
        */
        private def modifyMessage(da: DataAccessor): Endpoint[MessageObject] =
        post("threads" :: string :: "messages" :: string :: jsonBody[ModifyMessageRequest]) { (threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest) =>
          da.Assistants_modifyMessage(threadId, messageId, modifyMessageRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def modifyRun(da: DataAccessor): Endpoint[RunObject] =
        post("threads" :: string :: "runs" :: string :: jsonBody[ModifyRunRequest]) { (threadId: String, runId: String, modifyRunRequest: ModifyRunRequest) =>
          da.Assistants_modifyRun(threadId, runId, modifyRunRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ThreadObject
        */
        private def modifyThread(da: DataAccessor): Endpoint[ThreadObject] =
        post("threads" :: string :: jsonBody[ModifyThreadRequest]) { (threadId: String, modifyThreadRequest: ModifyThreadRequest) =>
          da.Assistants_modifyThread(threadId, modifyThreadRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RunObject
        */
        private def submitToolOuputsToRun(da: DataAccessor): Endpoint[RunObject] =
        post("threads" :: string :: "runs" :: string :: "submit_tool_outputs" :: jsonBody[SubmitToolOutputsRunRequest]) { (threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest) =>
          da.Assistants_submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpAssistantsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
