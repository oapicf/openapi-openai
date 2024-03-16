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

import org.openapitools.client.api.BigDecimal
import org.openapitools.client.api.CreateChatCompletionRequest
import org.openapitools.client.api.CreateChatCompletionResponse
import org.openapitools.client.api.CreateCompletionRequest
import org.openapitools.client.api.CreateCompletionResponse
import org.openapitools.client.api.CreateEditRequest
import org.openapitools.client.api.CreateEditResponse
import org.openapitools.client.api.CreateEmbeddingRequest
import org.openapitools.client.api.CreateEmbeddingResponse
import org.openapitools.client.api.CreateFineTuneRequest
import org.openapitools.client.api.CreateImageRequest
import org.openapitools.client.api.CreateModerationRequest
import org.openapitools.client.api.CreateModerationResponse
import org.openapitools.client.api.CreateTranscriptionRequestModel
import org.openapitools.client.api.CreateTranscriptionResponse
import org.openapitools.client.api.CreateTranslationResponse
import org.openapitools.client.api.DeleteFileResponse
import org.openapitools.client.api.DeleteModelResponse
import java.io.File
import org.openapitools.client.api.FineTune
import org.openapitools.client.api.ImagesResponse
import org.openapitools.client.api.ListFilesResponse
import org.openapitools.client.api.ListFineTuneEventsResponse
import org.openapitools.client.api.ListFineTunesResponse
import org.openapitools.client.api.ListModelsResponse
import org.openapitools.client.api.Model
import org.openapitools.client.api.OpenAIFile

object OpenAIApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelFineTune(host: String, fineTuneId: String): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes/{fine_tune_id}/cancel".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

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
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def createChatCompletion(host: String, createChatCompletionRequest: CreateChatCompletionRequest): Task[CreateChatCompletionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatCompletionResponse] = jsonOf[CreateChatCompletionResponse]

    val path = "/chat/completions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatCompletionRequest)
      resp          <- client.expect[CreateChatCompletionResponse](req)

    } yield resp
  }

  def createCompletion(host: String, createCompletionRequest: CreateCompletionRequest): Task[CreateCompletionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateCompletionResponse] = jsonOf[CreateCompletionResponse]

    val path = "/completions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createCompletionRequest)
      resp          <- client.expect[CreateCompletionResponse](req)

    } yield resp
  }

  def createEdit(host: String, createEditRequest: CreateEditRequest): Task[CreateEditResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateEditResponse] = jsonOf[CreateEditResponse]

    val path = "/edits"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createEditRequest)
      resp          <- client.expect[CreateEditResponse](req)

    } yield resp
  }

  def createEmbedding(host: String, createEmbeddingRequest: CreateEmbeddingRequest): Task[CreateEmbeddingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateEmbeddingResponse] = jsonOf[CreateEmbeddingResponse]

    val path = "/embeddings"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createEmbeddingRequest)
      resp          <- client.expect[CreateEmbeddingResponse](req)

    } yield resp
  }

  def createFile(host: String, file: File, purpose: String): Task[OpenAIFile] = {
    implicit val returnTypeDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]

    val path = "/files"

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
      resp          <- client.expect[OpenAIFile](req)

    } yield resp
  }

  def createFineTune(host: String, createFineTuneRequest: CreateFineTuneRequest): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createFineTuneRequest)
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def createImage(host: String, createImageRequest: CreateImageRequest): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/generations"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createImageRequest)
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createImageEdit(host: String, image: File, prompt: String, mask: File, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/edits"

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
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createImageVariation(host: String, image: File, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/variations"

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
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createModeration(host: String, createModerationRequest: CreateModerationRequest): Task[CreateModerationResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateModerationResponse] = jsonOf[CreateModerationResponse]

    val path = "/moderations"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createModerationRequest)
      resp          <- client.expect[CreateModerationResponse](req)

    } yield resp
  }

  def createTranscription(host: String, file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0, language: String): Task[CreateTranscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranscriptionResponse] = jsonOf[CreateTranscriptionResponse]

    val path = "/audio/transcriptions"

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
      resp          <- client.expect[CreateTranscriptionResponse](req)

    } yield resp
  }

  def createTranslation(host: String, file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0): Task[CreateTranslationResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranslationResponse] = jsonOf[CreateTranslationResponse]

    val path = "/audio/translations"

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
      resp          <- client.expect[CreateTranslationResponse](req)

    } yield resp
  }

  def deleteFile(host: String, fileId: String): Task[DeleteFileResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteFileResponse] = jsonOf[DeleteFileResponse]

    val path = "/files/{file_id}".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[DeleteFileResponse](req)

    } yield resp
  }

  def deleteModel(host: String, model: String): Task[DeleteModelResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteModelResponse] = jsonOf[DeleteModelResponse]

    val path = "/models/{model}".replaceAll("\\{" + "model" + "\\}",escape(model.toString))

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
      resp          <- client.expect[DeleteModelResponse](req)

    } yield resp
  }

  def downloadFile(host: String, fileId: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/files/{file_id}/content".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[String](req)

    } yield resp
  }

  def listFiles(host: String): Task[ListFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]

    val path = "/files"

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
      resp          <- client.expect[ListFilesResponse](req)

    } yield resp
  }

  def listFineTuneEvents(host: String, fineTuneId: String, stream: Boolean = false)(implicit streamQuery: QueryParam[Boolean]): Task[ListFineTuneEventsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuneEventsResponse] = jsonOf[ListFineTuneEventsResponse]

    val path = "/fine-tunes/{fine_tune_id}/events".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuneEventsResponse](req)

    } yield resp
  }

  def listFineTunes(host: String): Task[ListFineTunesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTunesResponse] = jsonOf[ListFineTunesResponse]

    val path = "/fine-tunes"

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
      resp          <- client.expect[ListFineTunesResponse](req)

    } yield resp
  }

  def listModels(host: String): Task[ListModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListModelsResponse] = jsonOf[ListModelsResponse]

    val path = "/models"

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
      resp          <- client.expect[ListModelsResponse](req)

    } yield resp
  }

  def retrieveFile(host: String, fileId: String): Task[OpenAIFile] = {
    implicit val returnTypeDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]

    val path = "/files/{file_id}".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[OpenAIFile](req)

    } yield resp
  }

  def retrieveFineTune(host: String, fineTuneId: String): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes/{fine_tune_id}".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

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
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def retrieveModel(host: String, model: String): Task[Model] = {
    implicit val returnTypeDecoder: EntityDecoder[Model] = jsonOf[Model]

    val path = "/models/{model}".replaceAll("\\{" + "model" + "\\}",escape(model.toString))

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
      resp          <- client.expect[Model](req)

    } yield resp
  }

}

class HttpServiceOpenAIApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelFineTune(fineTuneId: String): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes/{fine_tune_id}/cancel".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

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
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): Task[CreateChatCompletionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateChatCompletionResponse] = jsonOf[CreateChatCompletionResponse]

    val path = "/chat/completions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createChatCompletionRequest)
      resp          <- client.expect[CreateChatCompletionResponse](req)

    } yield resp
  }

  def createCompletion(createCompletionRequest: CreateCompletionRequest): Task[CreateCompletionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateCompletionResponse] = jsonOf[CreateCompletionResponse]

    val path = "/completions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createCompletionRequest)
      resp          <- client.expect[CreateCompletionResponse](req)

    } yield resp
  }

  def createEdit(createEditRequest: CreateEditRequest): Task[CreateEditResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateEditResponse] = jsonOf[CreateEditResponse]

    val path = "/edits"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createEditRequest)
      resp          <- client.expect[CreateEditResponse](req)

    } yield resp
  }

  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): Task[CreateEmbeddingResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateEmbeddingResponse] = jsonOf[CreateEmbeddingResponse]

    val path = "/embeddings"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createEmbeddingRequest)
      resp          <- client.expect[CreateEmbeddingResponse](req)

    } yield resp
  }

  def createFile(file: File, purpose: String): Task[OpenAIFile] = {
    implicit val returnTypeDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]

    val path = "/files"

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
      resp          <- client.expect[OpenAIFile](req)

    } yield resp
  }

  def createFineTune(createFineTuneRequest: CreateFineTuneRequest): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createFineTuneRequest)
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def createImage(createImageRequest: CreateImageRequest): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/generations"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createImageRequest)
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createImageEdit(image: File, prompt: String, mask: File, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/edits"

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
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createImageVariation(image: File, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ImagesResponse] = jsonOf[ImagesResponse]

    val path = "/images/variations"

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
      resp          <- client.expect[ImagesResponse](req)

    } yield resp
  }

  def createModeration(createModerationRequest: CreateModerationRequest): Task[CreateModerationResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateModerationResponse] = jsonOf[CreateModerationResponse]

    val path = "/moderations"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createModerationRequest)
      resp          <- client.expect[CreateModerationResponse](req)

    } yield resp
  }

  def createTranscription(file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0, language: String): Task[CreateTranscriptionResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranscriptionResponse] = jsonOf[CreateTranscriptionResponse]

    val path = "/audio/transcriptions"

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
      resp          <- client.expect[CreateTranscriptionResponse](req)

    } yield resp
  }

  def createTranslation(file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0): Task[CreateTranslationResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranslationResponse] = jsonOf[CreateTranslationResponse]

    val path = "/audio/translations"

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
      resp          <- client.expect[CreateTranslationResponse](req)

    } yield resp
  }

  def deleteFile(fileId: String): Task[DeleteFileResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteFileResponse] = jsonOf[DeleteFileResponse]

    val path = "/files/{file_id}".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[DeleteFileResponse](req)

    } yield resp
  }

  def deleteModel(model: String): Task[DeleteModelResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteModelResponse] = jsonOf[DeleteModelResponse]

    val path = "/models/{model}".replaceAll("\\{" + "model" + "\\}",escape(model.toString))

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
      resp          <- client.expect[DeleteModelResponse](req)

    } yield resp
  }

  def downloadFile(fileId: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/files/{file_id}/content".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[String](req)

    } yield resp
  }

  def listFiles(): Task[ListFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]

    val path = "/files"

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
      resp          <- client.expect[ListFilesResponse](req)

    } yield resp
  }

  def listFineTuneEvents(fineTuneId: String, stream: Boolean = false)(implicit streamQuery: QueryParam[Boolean]): Task[ListFineTuneEventsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuneEventsResponse] = jsonOf[ListFineTuneEventsResponse]

    val path = "/fine-tunes/{fine_tune_id}/events".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("stream", Some(streamQuery.toParamString(stream))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuneEventsResponse](req)

    } yield resp
  }

  def listFineTunes(): Task[ListFineTunesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTunesResponse] = jsonOf[ListFineTunesResponse]

    val path = "/fine-tunes"

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
      resp          <- client.expect[ListFineTunesResponse](req)

    } yield resp
  }

  def listModels(): Task[ListModelsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListModelsResponse] = jsonOf[ListModelsResponse]

    val path = "/models"

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
      resp          <- client.expect[ListModelsResponse](req)

    } yield resp
  }

  def retrieveFile(fileId: String): Task[OpenAIFile] = {
    implicit val returnTypeDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]

    val path = "/files/{file_id}".replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[OpenAIFile](req)

    } yield resp
  }

  def retrieveFineTune(fineTuneId: String): Task[FineTune] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTune] = jsonOf[FineTune]

    val path = "/fine-tunes/{fine_tune_id}".replaceAll("\\{" + "fine_tune_id" + "\\}",escape(fineTuneId.toString))

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
      resp          <- client.expect[FineTune](req)

    } yield resp
  }

  def retrieveModel(model: String): Task[Model] = {
    implicit val returnTypeDecoder: EntityDecoder[Model] = jsonOf[Model]

    val path = "/models/{model}".replaceAll("\\{" + "model" + "\\}",escape(model.toString))

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
      resp          <- client.expect[Model](req)

    } yield resp
  }

}
