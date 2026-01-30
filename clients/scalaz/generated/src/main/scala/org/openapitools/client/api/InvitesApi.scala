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

import org.openapitools.client.api.Invite
import org.openapitools.client.api.InviteDeleteResponse
import org.openapitools.client.api.InviteListResponse
import org.openapitools.client.api.InviteRequest

object InvitesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteInvite(host: String, inviteId: String): Task[InviteDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[InviteDeleteResponse] = jsonOf[InviteDeleteResponse]

    val path = "/organization/invites/{invite_id}".replaceAll("\\{" + "invite_id" + "\\}",escape(inviteId.toString))

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
      resp          <- client.expect[InviteDeleteResponse](req)

    } yield resp
  }

  def inviteUser(host: String, inviteRequest: InviteRequest): Task[Invite] = {
    implicit val returnTypeDecoder: EntityDecoder[Invite] = jsonOf[Invite]

    val path = "/organization/invites"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(inviteRequest)
      resp          <- client.expect[Invite](req)

    } yield resp
  }

  def listInvites(host: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[InviteListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[InviteListResponse] = jsonOf[InviteListResponse]

    val path = "/organization/invites"

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
      resp          <- client.expect[InviteListResponse](req)

    } yield resp
  }

  def retrieveInvite(host: String, inviteId: String): Task[Invite] = {
    implicit val returnTypeDecoder: EntityDecoder[Invite] = jsonOf[Invite]

    val path = "/organization/invites/{invite_id}".replaceAll("\\{" + "invite_id" + "\\}",escape(inviteId.toString))

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
      resp          <- client.expect[Invite](req)

    } yield resp
  }

}

class HttpServiceInvitesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteInvite(inviteId: String): Task[InviteDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[InviteDeleteResponse] = jsonOf[InviteDeleteResponse]

    val path = "/organization/invites/{invite_id}".replaceAll("\\{" + "invite_id" + "\\}",escape(inviteId.toString))

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
      resp          <- client.expect[InviteDeleteResponse](req)

    } yield resp
  }

  def inviteUser(inviteRequest: InviteRequest): Task[Invite] = {
    implicit val returnTypeDecoder: EntityDecoder[Invite] = jsonOf[Invite]

    val path = "/organization/invites"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(inviteRequest)
      resp          <- client.expect[Invite](req)

    } yield resp
  }

  def listInvites(limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[InviteListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[InviteListResponse] = jsonOf[InviteListResponse]

    val path = "/organization/invites"

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
      resp          <- client.expect[InviteListResponse](req)

    } yield resp
  }

  def retrieveInvite(inviteId: String): Task[Invite] = {
    implicit val returnTypeDecoder: EntityDecoder[Invite] = jsonOf[Invite]

    val path = "/organization/invites/{invite_id}".replaceAll("\\{" + "invite_id" + "\\}",escape(inviteId.toString))

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
      resp          <- client.expect[Invite](req)

    } yield resp
  }

}
