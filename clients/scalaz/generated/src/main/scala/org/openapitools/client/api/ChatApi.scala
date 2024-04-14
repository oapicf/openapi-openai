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

import org.openapitools.client.api.CreateChatCompletionRequest
import org.openapitools.client.api.CreateChatCompletionResponse

object ChatApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceChatApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
