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
import org.openapitools.client.api.CreateSpeechRequest
import org.openapitools.client.api.CreateTranscription200Response
import org.openapitools.client.api.CreateTranscriptionRequestModel
import org.openapitools.client.api.CreateTranslation200Response
import java.io.File

object AudioApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createSpeech(host: String, createSpeechRequest: CreateSpeechRequest): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/audio/speech"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createSpeechRequest)
      resp          <- client.expect[File](req)

    } yield resp
  }

  def createTranscription(host: String, file: File, model: CreateTranscriptionRequestModel, language: String, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0, timestampGranularities: List[String]): Task[CreateTranscription200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranscription200Response] = jsonOf[CreateTranscription200Response]

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
      resp          <- client.expect[CreateTranscription200Response](req)

    } yield resp
  }

  def createTranslation(host: String, file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0): Task[CreateTranslation200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranslation200Response] = jsonOf[CreateTranslation200Response]

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
      resp          <- client.expect[CreateTranslation200Response](req)

    } yield resp
  }

}

class HttpServiceAudioApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def createSpeech(createSpeechRequest: CreateSpeechRequest): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/audio/speech"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createSpeechRequest)
      resp          <- client.expect[File](req)

    } yield resp
  }

  def createTranscription(file: File, model: CreateTranscriptionRequestModel, language: String, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0, timestampGranularities: List[String]): Task[CreateTranscription200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranscription200Response] = jsonOf[CreateTranscription200Response]

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
      resp          <- client.expect[CreateTranscription200Response](req)

    } yield resp
  }

  def createTranslation(file: File, model: CreateTranscriptionRequestModel, prompt: String, responseFormat: String = json, temperature: BigDecimal = 0): Task[CreateTranslation200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[CreateTranslation200Response] = jsonOf[CreateTranslation200Response]

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
      resp          <- client.expect[CreateTranslation200Response](req)

    } yield resp
  }

}
