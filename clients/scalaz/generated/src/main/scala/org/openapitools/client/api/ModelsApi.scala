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

import org.openapitools.client.api.DeleteModelResponse
import org.openapitools.client.api.ListModelsResponse
import org.openapitools.client.api.Model

object ModelsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

class HttpServiceModelsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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
