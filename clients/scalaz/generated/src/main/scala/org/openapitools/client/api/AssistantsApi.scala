package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AssistantObject
import org.openapitools.client.api.CreateAssistantRequest
import org.openapitools.client.api.CreateMessageRequest
import org.openapitools.client.api.CreateRunRequest
import org.openapitools.client.api.CreateThreadAndRunRequest
import org.openapitools.client.api.CreateThreadRequest
import org.openapitools.client.api.DeleteAssistantResponse
import org.openapitools.client.api.DeleteMessageResponse
import org.openapitools.client.api.DeleteThreadResponse
import org.openapitools.client.api.ListAssistantsResponse
import org.openapitools.client.api.ListMessagesResponse
import org.openapitools.client.api.ListRunStepsResponse
import org.openapitools.client.api.ListRunsResponse
import org.openapitools.client.api.MessageObject
import org.openapitools.client.api.ModifyAssistantRequest
import org.openapitools.client.api.ModifyMessageRequest
import org.openapitools.client.api.ModifyRunRequest
import org.openapitools.client.api.ModifyThreadRequest
import org.openapitools.client.api.RunObject
import org.openapitools.client.api.RunStepObject
import org.openapitools.client.api.SubmitToolOutputsRunRequest
import org.openapitools.client.api.ThreadObject

object AssistantsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelRun(host: String, threadId: String, runId: String): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}/cancel".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def createAssistant(host: String, createAssistantRequest: CreateAssistantRequest): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssistantRequest)
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def createMessage(host: String, threadId: String, createMessageRequest: CreateMessageRequest): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMessageRequest)
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def createRun(host: String, threadId: String, createRunRequest: CreateRunRequest, include: List[String] = List.empty[String] )(implicit includeQuery: QueryParam[List[String]]): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def createThread(host: String, createThreadRequest: CreateThreadRequest): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createThreadRequest)
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def createThreadAndRun(host: String, createThreadAndRunRequest: CreateThreadAndRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/runs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createThreadAndRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def deleteAssistant(host: String, assistantId: String): Task[DeleteAssistantResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteAssistantResponse] = jsonOf[DeleteAssistantResponse]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteAssistantResponse](req)

    } yield resp
  }

  def deleteMessage(host: String, threadId: String, messageId: String): Task[DeleteMessageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteMessageResponse] = jsonOf[DeleteMessageResponse]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteMessageResponse](req)

    } yield resp
  }

  def deleteThread(host: String, threadId: String): Task[DeleteThreadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteThreadResponse] = jsonOf[DeleteThreadResponse]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteThreadResponse](req)

    } yield resp
  }

  def getAssistant(host: String, assistantId: String): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def getMessage(host: String, threadId: String, messageId: String): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def getRun(host: String, threadId: String, runId: String): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def getRunStep(host: String, threadId: String, runId: String, stepId: String, include: List[String] = List.empty[String] )(implicit includeQuery: QueryParam[List[String]]): Task[RunStepObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunStepObject] = jsonOf[RunStepObject]

    val path = "/threads/{thread_id}/runs/{run_id}/steps/{step_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString)).replaceAll("\\{" + "step_id" + "\\}",escape(stepId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunStepObject](req)

    } yield resp
  }

  def getThread(host: String, threadId: String): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def listAssistants(host: String, limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListAssistantsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListAssistantsResponse] = jsonOf[ListAssistantsResponse]

    val path = "/assistants"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListAssistantsResponse](req)

    } yield resp
  }

  def listMessages(host: String, threadId: String, limit: Integer = 20, order: String = desc, after: String, before: String, runId: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], runIdQuery: QueryParam[String]): Task[ListMessagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListMessagesResponse] = jsonOf[ListMessagesResponse]

    val path = "/threads/{thread_id}/messages".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("runId", Some(run_idQuery.toParamString(run_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListMessagesResponse](req)

    } yield resp
  }

  def listRunSteps(host: String, threadId: String, runId: String, limit: Integer = 20, order: String = desc, after: String, before: String, include: List[String] = List.empty[String] )(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], includeQuery: QueryParam[List[String]]): Task[ListRunStepsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListRunStepsResponse] = jsonOf[ListRunStepsResponse]

    val path = "/threads/{thread_id}/runs/{run_id}/steps".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListRunStepsResponse](req)

    } yield resp
  }

  def listRuns(host: String, threadId: String, limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListRunsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListRunsResponse] = jsonOf[ListRunsResponse]

    val path = "/threads/{thread_id}/runs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListRunsResponse](req)

    } yield resp
  }

  def modifyAssistant(host: String, assistantId: String, modifyAssistantRequest: ModifyAssistantRequest): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyAssistantRequest)
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def modifyMessage(host: String, threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyMessageRequest)
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def modifyRun(host: String, threadId: String, runId: String, modifyRunRequest: ModifyRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def modifyThread(host: String, threadId: String, modifyThreadRequest: ModifyThreadRequest): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyThreadRequest)
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def submitToolOuputsToRun(host: String, threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(submitToolOutputsRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

}

class HttpServiceAssistantsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelRun(threadId: String, runId: String): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}/cancel".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def createAssistant(createAssistantRequest: CreateAssistantRequest): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createAssistantRequest)
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def createMessage(threadId: String, createMessageRequest: CreateMessageRequest): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createMessageRequest)
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def createRun(threadId: String, createRunRequest: CreateRunRequest, include: List[String] = List.empty[String] )(implicit includeQuery: QueryParam[List[String]]): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def createThread(createThreadRequest: CreateThreadRequest): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createThreadRequest)
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/runs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createThreadAndRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def deleteAssistant(assistantId: String): Task[DeleteAssistantResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteAssistantResponse] = jsonOf[DeleteAssistantResponse]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteAssistantResponse](req)

    } yield resp
  }

  def deleteMessage(threadId: String, messageId: String): Task[DeleteMessageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteMessageResponse] = jsonOf[DeleteMessageResponse]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteMessageResponse](req)

    } yield resp
  }

  def deleteThread(threadId: String): Task[DeleteThreadResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteThreadResponse] = jsonOf[DeleteThreadResponse]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[DeleteThreadResponse](req)

    } yield resp
  }

  def getAssistant(assistantId: String): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def getMessage(threadId: String, messageId: String): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def getRun(threadId: String, runId: String): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def getRunStep(threadId: String, runId: String, stepId: String, include: List[String] = List.empty[String] )(implicit includeQuery: QueryParam[List[String]]): Task[RunStepObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunStepObject] = jsonOf[RunStepObject]

    val path = "/threads/{thread_id}/runs/{run_id}/steps/{step_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString)).replaceAll("\\{" + "step_id" + "\\}",escape(stepId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[RunStepObject](req)

    } yield resp
  }

  def getThread(threadId: String): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def listAssistants(limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListAssistantsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListAssistantsResponse] = jsonOf[ListAssistantsResponse]

    val path = "/assistants"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListAssistantsResponse](req)

    } yield resp
  }

  def listMessages(threadId: String, limit: Integer = 20, order: String = desc, after: String, before: String, runId: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], runIdQuery: QueryParam[String]): Task[ListMessagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListMessagesResponse] = jsonOf[ListMessagesResponse]

    val path = "/threads/{thread_id}/messages".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("runId", Some(run_idQuery.toParamString(run_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListMessagesResponse](req)

    } yield resp
  }

  def listRunSteps(threadId: String, runId: String, limit: Integer = 20, order: String = desc, after: String, before: String, include: List[String] = List.empty[String] )(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], includeQuery: QueryParam[List[String]]): Task[ListRunStepsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListRunStepsResponse] = jsonOf[ListRunStepsResponse]

    val path = "/threads/{thread_id}/runs/{run_id}/steps".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("include", Some(include[]Query.toParamString(include[]))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListRunStepsResponse](req)

    } yield resp
  }

  def listRuns(threadId: String, limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListRunsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListRunsResponse] = jsonOf[ListRunsResponse]

    val path = "/threads/{thread_id}/runs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListRunsResponse](req)

    } yield resp
  }

  def modifyAssistant(assistantId: String, modifyAssistantRequest: ModifyAssistantRequest): Task[AssistantObject] = {
    implicit val returnTypeDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]

    val path = "/assistants/{assistant_id}".replaceAll("\\{" + "assistant_id" + "\\}",escape(assistantId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyAssistantRequest)
      resp          <- client.expect[AssistantObject](req)

    } yield resp
  }

  def modifyMessage(threadId: String, messageId: String, modifyMessageRequest: ModifyMessageRequest): Task[MessageObject] = {
    implicit val returnTypeDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]

    val path = "/threads/{thread_id}/messages/{message_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "message_id" + "\\}",escape(messageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyMessageRequest)
      resp          <- client.expect[MessageObject](req)

    } yield resp
  }

  def modifyRun(threadId: String, runId: String, modifyRunRequest: ModifyRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

  def modifyThread(threadId: String, modifyThreadRequest: ModifyThreadRequest): Task[ThreadObject] = {
    implicit val returnTypeDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]

    val path = "/threads/{thread_id}".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(modifyThreadRequest)
      resp          <- client.expect[ThreadObject](req)

    } yield resp
  }

  def submitToolOuputsToRun(threadId: String, runId: String, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest): Task[RunObject] = {
    implicit val returnTypeDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]

    val path = "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs".replaceAll("\\{" + "thread_id" + "\\}",escape(threadId.toString)).replaceAll("\\{" + "run_id" + "\\}",escape(runId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(submitToolOutputsRunRequest)
      resp          <- client.expect[RunObject](req)

    } yield resp
  }

}
