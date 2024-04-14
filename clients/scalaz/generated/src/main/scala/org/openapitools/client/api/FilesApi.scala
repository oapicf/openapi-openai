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

import org.openapitools.client.api.DeleteFileResponse
import java.io.File
import org.openapitools.client.api.ListFilesResponse
import org.openapitools.client.api.OpenAIFile

object FilesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def listFiles(host: String, purpose: String)(implicit purposeQuery: QueryParam[String]): Task[ListFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]

    val path = "/files"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("purpose", Some(purposeQuery.toParamString(purpose))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFilesResponse](req)

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

}

class HttpServiceFilesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

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

  def listFiles(purpose: String)(implicit purposeQuery: QueryParam[String]): Task[ListFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]

    val path = "/files"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("purpose", Some(purposeQuery.toParamString(purpose))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFilesResponse](req)

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

}
