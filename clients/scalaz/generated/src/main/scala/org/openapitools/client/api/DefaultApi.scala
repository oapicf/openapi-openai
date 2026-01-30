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

import org.openapitools.client.api.AdminApiKey
import org.openapitools.client.api.AdminApiKeysCreateRequest
import org.openapitools.client.api.AdminApiKeysDelete200Response
import org.openapitools.client.api.ApiKeyList

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adminApiKeysCreate(host: String, adminApiKeysCreateRequest: AdminApiKeysCreateRequest): Task[AdminApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKey] = jsonOf[AdminApiKey]

    val path = "/organization/admin_api_keys"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adminApiKeysCreateRequest)
      resp          <- client.expect[AdminApiKey](req)

    } yield resp
  }

  def adminApiKeysDelete(host: String, keyId: String): Task[AdminApiKeysDelete200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKeysDelete200Response] = jsonOf[AdminApiKeysDelete200Response]

    val path = "/organization/admin_api_keys/{key_id}".replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

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
      resp          <- client.expect[AdminApiKeysDelete200Response](req)

    } yield resp
  }

  def adminApiKeysGet(host: String, keyId: String): Task[AdminApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKey] = jsonOf[AdminApiKey]

    val path = "/organization/admin_api_keys/{key_id}".replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

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
      resp          <- client.expect[AdminApiKey](req)

    } yield resp
  }

  def adminApiKeysList(host: String, after: String, order: String = asc, limit: Integer = 20)(implicit afterQuery: QueryParam[String], orderQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ApiKeyList] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyList] = jsonOf[ApiKeyList]

    val path = "/organization/admin_api_keys"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("order", Some(orderQuery.toParamString(order))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyList](req)

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest): Task[AdminApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKey] = jsonOf[AdminApiKey]

    val path = "/organization/admin_api_keys"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(adminApiKeysCreateRequest)
      resp          <- client.expect[AdminApiKey](req)

    } yield resp
  }

  def adminApiKeysDelete(keyId: String): Task[AdminApiKeysDelete200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKeysDelete200Response] = jsonOf[AdminApiKeysDelete200Response]

    val path = "/organization/admin_api_keys/{key_id}".replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

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
      resp          <- client.expect[AdminApiKeysDelete200Response](req)

    } yield resp
  }

  def adminApiKeysGet(keyId: String): Task[AdminApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[AdminApiKey] = jsonOf[AdminApiKey]

    val path = "/organization/admin_api_keys/{key_id}".replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

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
      resp          <- client.expect[AdminApiKey](req)

    } yield resp
  }

  def adminApiKeysList(after: String, order: String = asc, limit: Integer = 20)(implicit afterQuery: QueryParam[String], orderQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ApiKeyList] = {
    implicit val returnTypeDecoder: EntityDecoder[ApiKeyList] = jsonOf[ApiKeyList]

    val path = "/organization/admin_api_keys"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("order", Some(orderQuery.toParamString(order))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ApiKeyList](req)

    } yield resp
  }

}
