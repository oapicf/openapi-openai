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

import org.openapitools.client.api.CompleteUploadRequest
import org.openapitools.client.api.CreateUploadRequest
import java.io.File
import org.openapitools.client.api.Upload
import org.openapitools.client.api.UploadPart

object UploadsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addUploadPart(host: String, uploadId: String, data: File): Task[UploadPart] = {
    implicit val returnTypeDecoder: EntityDecoder[UploadPart] = jsonOf[UploadPart]

    val path = "/uploads/{upload_id}/parts".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

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
      resp          <- client.expect[UploadPart](req)

    } yield resp
  }

  def cancelUpload(host: String, uploadId: String): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads/{upload_id}/cancel".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

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
      resp          <- client.expect[Upload](req)

    } yield resp
  }

  def completeUpload(host: String, uploadId: String, completeUploadRequest: CompleteUploadRequest): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads/{upload_id}/complete".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(completeUploadRequest)
      resp          <- client.expect[Upload](req)

    } yield resp
  }

  def createUpload(host: String, createUploadRequest: CreateUploadRequest): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createUploadRequest)
      resp          <- client.expect[Upload](req)

    } yield resp
  }

}

class HttpServiceUploadsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def addUploadPart(uploadId: String, data: File): Task[UploadPart] = {
    implicit val returnTypeDecoder: EntityDecoder[UploadPart] = jsonOf[UploadPart]

    val path = "/uploads/{upload_id}/parts".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

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
      resp          <- client.expect[UploadPart](req)

    } yield resp
  }

  def cancelUpload(uploadId: String): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads/{upload_id}/cancel".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

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
      resp          <- client.expect[Upload](req)

    } yield resp
  }

  def completeUpload(uploadId: String, completeUploadRequest: CompleteUploadRequest): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads/{upload_id}/complete".replaceAll("\\{" + "upload_id" + "\\}",escape(uploadId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(completeUploadRequest)
      resp          <- client.expect[Upload](req)

    } yield resp
  }

  def createUpload(createUploadRequest: CreateUploadRequest): Task[Upload] = {
    implicit val returnTypeDecoder: EntityDecoder[Upload] = jsonOf[Upload]

    val path = "/uploads"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createUploadRequest)
      resp          <- client.expect[Upload](req)

    } yield resp
  }

}
