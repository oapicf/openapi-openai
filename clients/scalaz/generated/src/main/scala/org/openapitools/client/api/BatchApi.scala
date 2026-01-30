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

import org.openapitools.client.api.Batch
import org.openapitools.client.api.CreateBatchRequest
import org.openapitools.client.api.ListBatchesResponse

object BatchApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelBatch(host: String, batchId: String): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches/{batch_id}/cancel".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[Batch](req)

    } yield resp
  }

  def createBatch(host: String, createBatchRequest: CreateBatchRequest): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createBatchRequest)
      resp          <- client.expect[Batch](req)

    } yield resp
  }

  def listBatches(host: String, after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListBatchesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListBatchesResponse] = jsonOf[ListBatchesResponse]

    val path = "/batches"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListBatchesResponse](req)

    } yield resp
  }

  def retrieveBatch(host: String, batchId: String): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[Batch](req)

    } yield resp
  }

}

class HttpServiceBatchApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelBatch(batchId: String): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches/{batch_id}/cancel".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[Batch](req)

    } yield resp
  }

  def createBatch(createBatchRequest: CreateBatchRequest): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createBatchRequest)
      resp          <- client.expect[Batch](req)

    } yield resp
  }

  def listBatches(after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListBatchesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListBatchesResponse] = jsonOf[ListBatchesResponse]

    val path = "/batches"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListBatchesResponse](req)

    } yield resp
  }

  def retrieveBatch(batchId: String): Task[Batch] = {
    implicit val returnTypeDecoder: EntityDecoder[Batch] = jsonOf[Batch]

    val path = "/batches/{batch_id}".replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[Batch](req)

    } yield resp
  }

}
