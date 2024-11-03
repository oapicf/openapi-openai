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

import org.openapitools.client.api.CreateImageEditRequestModel
import org.openapitools.client.api.CreateImageRequest
import java.io.File
import org.openapitools.client.api.ImagesResponse

object ImagesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def createImageEdit(host: String, image: File, prompt: String, mask: File, model: CreateImageEditRequestModel, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
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

  def createImageVariation(host: String, image: File, model: CreateImageEditRequestModel, n: Integer = 1, responseFormat: String = url, size: String = 1024x1024, user: String): Task[ImagesResponse] = {
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

}

class HttpServiceImagesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def createImageEdit(image: File, prompt: String, mask: File, model: CreateImageEditRequestModel, n: Integer = 1, size: String = 1024x1024, responseFormat: String = url, user: String): Task[ImagesResponse] = {
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

  def createImageVariation(image: File, model: CreateImageEditRequestModel, n: Integer = 1, responseFormat: String = url, size: String = 1024x1024, user: String): Task[ImagesResponse] = {
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

}
