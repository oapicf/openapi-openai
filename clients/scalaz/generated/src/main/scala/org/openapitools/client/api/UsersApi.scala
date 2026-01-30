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

import org.openapitools.client.api.User
import org.openapitools.client.api.UserDeleteResponse
import org.openapitools.client.api.UserListResponse
import org.openapitools.client.api.UserRoleUpdateRequest

object UsersApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteUser(host: String, userId: String): Task[UserDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UserDeleteResponse] = jsonOf[UserDeleteResponse]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

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
      resp          <- client.expect[UserDeleteResponse](req)

    } yield resp
  }

  def listUsers(host: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[UserListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UserListResponse] = jsonOf[UserListResponse]

    val path = "/organization/users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserListResponse](req)

    } yield resp
  }

  def modifyUser(host: String, userId: String, userRoleUpdateRequest: UserRoleUpdateRequest): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(userRoleUpdateRequest)
      resp          <- client.expect[User](req)

    } yield resp
  }

  def retrieveUser(host: String, userId: String): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

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
      resp          <- client.expect[User](req)

    } yield resp
  }

}

class HttpServiceUsersApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteUser(userId: String): Task[UserDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UserDeleteResponse] = jsonOf[UserDeleteResponse]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

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
      resp          <- client.expect[UserDeleteResponse](req)

    } yield resp
  }

  def listUsers(limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[UserListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UserListResponse] = jsonOf[UserListResponse]

    val path = "/organization/users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UserListResponse](req)

    } yield resp
  }

  def modifyUser(userId: String, userRoleUpdateRequest: UserRoleUpdateRequest): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(userRoleUpdateRequest)
      resp          <- client.expect[User](req)

    } yield resp
  }

  def retrieveUser(userId: String): Task[User] = {
    implicit val returnTypeDecoder: EntityDecoder[User] = jsonOf[User]

    val path = "/organization/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

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
      resp          <- client.expect[User](req)

    } yield resp
  }

}
