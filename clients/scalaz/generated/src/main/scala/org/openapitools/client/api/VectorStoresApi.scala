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

import org.openapitools.client.api.CreateVectorStoreFileBatchRequest
import org.openapitools.client.api.CreateVectorStoreFileRequest
import org.openapitools.client.api.CreateVectorStoreRequest
import org.openapitools.client.api.DeleteVectorStoreFileResponse
import org.openapitools.client.api.DeleteVectorStoreResponse
import org.openapitools.client.api.ListVectorStoreFilesResponse
import org.openapitools.client.api.ListVectorStoresResponse
import org.openapitools.client.api.UpdateVectorStoreRequest
import org.openapitools.client.api.VectorStoreFileBatchObject
import org.openapitools.client.api.VectorStoreFileObject
import org.openapitools.client.api.VectorStoreObject

object VectorStoresApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelVectorStoreFileBatch(host: String, vectorStoreId: String, batchId: String): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def createVectorStore(host: String, createVectorStoreRequest: CreateVectorStoreRequest): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreRequest)
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

  def createVectorStoreFile(host: String, vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest): Task[VectorStoreFileObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileObject] = jsonOf[VectorStoreFileObject]

    val path = "/vector_stores/{vector_store_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreFileRequest)
      resp          <- client.expect[VectorStoreFileObject](req)

    } yield resp
  }

  def createVectorStoreFileBatch(host: String, vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreFileBatchRequest)
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def deleteVectorStore(host: String, vectorStoreId: String): Task[DeleteVectorStoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteVectorStoreResponse] = jsonOf[DeleteVectorStoreResponse]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

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
      resp          <- client.expect[DeleteVectorStoreResponse](req)

    } yield resp
  }

  def deleteVectorStoreFile(host: String, vectorStoreId: String, fileId: String): Task[DeleteVectorStoreFileResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteVectorStoreFileResponse] = jsonOf[DeleteVectorStoreFileResponse]

    val path = "/vector_stores/{vector_store_id}/files/{file_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[DeleteVectorStoreFileResponse](req)

    } yield resp
  }

  def getVectorStore(host: String, vectorStoreId: String): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

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
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

  def getVectorStoreFile(host: String, vectorStoreId: String, fileId: String): Task[VectorStoreFileObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileObject] = jsonOf[VectorStoreFileObject]

    val path = "/vector_stores/{vector_store_id}/files/{file_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[VectorStoreFileObject](req)

    } yield resp
  }

  def getVectorStoreFileBatch(host: String, vectorStoreId: String, batchId: String): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def listFilesInVectorStoreBatch(host: String, vectorStoreId: String, batchId: String, limit: Integer = 20, order: String = desc, after: String, before: String, filter: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], filterQuery: QueryParam[String]): Task[ListVectorStoreFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoreFilesResponse] = jsonOf[ListVectorStoreFilesResponse]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListVectorStoreFilesResponse](req)

    } yield resp
  }

  def listVectorStoreFiles(host: String, vectorStoreId: String, limit: Integer = 20, order: String = desc, after: String, before: String, filter: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], filterQuery: QueryParam[String]): Task[ListVectorStoreFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoreFilesResponse] = jsonOf[ListVectorStoreFilesResponse]

    val path = "/vector_stores/{vector_store_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListVectorStoreFilesResponse](req)

    } yield resp
  }

  def listVectorStores(host: String, limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListVectorStoresResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoresResponse] = jsonOf[ListVectorStoresResponse]

    val path = "/vector_stores"

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
      resp          <- client.expect[ListVectorStoresResponse](req)

    } yield resp
  }

  def modifyVectorStore(host: String, vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateVectorStoreRequest)
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

}

class HttpServiceVectorStoresApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreRequest)
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

  def createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest): Task[VectorStoreFileObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileObject] = jsonOf[VectorStoreFileObject]

    val path = "/vector_stores/{vector_store_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreFileRequest)
      resp          <- client.expect[VectorStoreFileObject](req)

    } yield resp
  }

  def createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createVectorStoreFileBatchRequest)
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def deleteVectorStore(vectorStoreId: String): Task[DeleteVectorStoreResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteVectorStoreResponse] = jsonOf[DeleteVectorStoreResponse]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

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
      resp          <- client.expect[DeleteVectorStoreResponse](req)

    } yield resp
  }

  def deleteVectorStoreFile(vectorStoreId: String, fileId: String): Task[DeleteVectorStoreFileResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[DeleteVectorStoreFileResponse] = jsonOf[DeleteVectorStoreFileResponse]

    val path = "/vector_stores/{vector_store_id}/files/{file_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[DeleteVectorStoreFileResponse](req)

    } yield resp
  }

  def getVectorStore(vectorStoreId: String): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

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
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

  def getVectorStoreFile(vectorStoreId: String, fileId: String): Task[VectorStoreFileObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileObject] = jsonOf[VectorStoreFileObject]

    val path = "/vector_stores/{vector_store_id}/files/{file_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "file_id" + "\\}",escape(fileId.toString))

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
      resp          <- client.expect[VectorStoreFileObject](req)

    } yield resp
  }

  def getVectorStoreFileBatch(vectorStoreId: String, batchId: String): Task[VectorStoreFileBatchObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreFileBatchObject] = jsonOf[VectorStoreFileBatchObject]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

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
      resp          <- client.expect[VectorStoreFileBatchObject](req)

    } yield resp
  }

  def listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Integer = 20, order: String = desc, after: String, before: String, filter: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], filterQuery: QueryParam[String]): Task[ListVectorStoreFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoreFilesResponse] = jsonOf[ListVectorStoreFilesResponse]

    val path = "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString)).replaceAll("\\{" + "batch_id" + "\\}",escape(batchId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListVectorStoreFilesResponse](req)

    } yield resp
  }

  def listVectorStoreFiles(vectorStoreId: String, limit: Integer = 20, order: String = desc, after: String, before: String, filter: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String], filterQuery: QueryParam[String]): Task[ListVectorStoreFilesResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoreFilesResponse] = jsonOf[ListVectorStoreFilesResponse]

    val path = "/vector_stores/{vector_store_id}/files".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("order", Some(orderQuery.toParamString(order))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))), ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListVectorStoreFilesResponse](req)

    } yield resp
  }

  def listVectorStores(limit: Integer = 20, order: String = desc, after: String, before: String)(implicit limitQuery: QueryParam[Integer], orderQuery: QueryParam[String], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListVectorStoresResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListVectorStoresResponse] = jsonOf[ListVectorStoresResponse]

    val path = "/vector_stores"

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
      resp          <- client.expect[ListVectorStoresResponse](req)

    } yield resp
  }

  def modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest): Task[VectorStoreObject] = {
    implicit val returnTypeDecoder: EntityDecoder[VectorStoreObject] = jsonOf[VectorStoreObject]

    val path = "/vector_stores/{vector_store_id}".replaceAll("\\{" + "vector_store_id" + "\\}",escape(vectorStoreId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(updateVectorStoreRequest)
      resp          <- client.expect[VectorStoreObject](req)

    } yield resp
  }

}
