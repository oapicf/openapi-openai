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

import org.openapitools.client.api.CreateEmbeddingRequest
import org.openapitools.client.api.CreateEmbeddingResponse

object EmbeddingsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}

class HttpServiceEmbeddingsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

}
