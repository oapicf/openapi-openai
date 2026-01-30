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

import org.openapitools.client.api.AuditLogEventType
import org.openapitools.client.api.ListAuditLogsEffectiveAtParameter
import org.openapitools.client.api.ListAuditLogsResponse

object AuditLogsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def listAuditLogs(host: String, effectiveAt: ListAuditLogsEffectiveAtParameter, projectIds: List[String] = List.empty[String] , eventTypes: List[AuditLogEventType] = List.empty[AuditLogEventType] , actorIds: List[String] = List.empty[String] , actorEmails: List[String] = List.empty[String] , resourceIds: List[String] = List.empty[String] , limit: Integer = 20, after: String, before: String)(implicit effectiveAtQuery: QueryParam[ListAuditLogsEffectiveAtParameter], projectIdsQuery: QueryParam[List[String]], eventTypesQuery: QueryParam[List[AuditLogEventType]], actorIdsQuery: QueryParam[List[String]], actorEmailsQuery: QueryParam[List[String]], resourceIdsQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListAuditLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListAuditLogsResponse] = jsonOf[ListAuditLogsResponse]

    val path = "/organization/audit_logs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("effectiveAt", Some(effective_atQuery.toParamString(effective_at))), ("projectIds", Some(project_ids[]Query.toParamString(project_ids[]))), ("eventTypes", Some(event_types[]Query.toParamString(event_types[]))), ("actorIds", Some(actor_ids[]Query.toParamString(actor_ids[]))), ("actorEmails", Some(actor_emails[]Query.toParamString(actor_emails[]))), ("resourceIds", Some(resource_ids[]Query.toParamString(resource_ids[]))), ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListAuditLogsResponse](req)

    } yield resp
  }

}

class HttpServiceAuditLogsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def listAuditLogs(effectiveAt: ListAuditLogsEffectiveAtParameter, projectIds: List[String] = List.empty[String] , eventTypes: List[AuditLogEventType] = List.empty[AuditLogEventType] , actorIds: List[String] = List.empty[String] , actorEmails: List[String] = List.empty[String] , resourceIds: List[String] = List.empty[String] , limit: Integer = 20, after: String, before: String)(implicit effectiveAtQuery: QueryParam[ListAuditLogsEffectiveAtParameter], projectIdsQuery: QueryParam[List[String]], eventTypesQuery: QueryParam[List[AuditLogEventType]], actorIdsQuery: QueryParam[List[String]], actorEmailsQuery: QueryParam[List[String]], resourceIdsQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ListAuditLogsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListAuditLogsResponse] = jsonOf[ListAuditLogsResponse]

    val path = "/organization/audit_logs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("effectiveAt", Some(effective_atQuery.toParamString(effective_at))), ("projectIds", Some(project_ids[]Query.toParamString(project_ids[]))), ("eventTypes", Some(event_types[]Query.toParamString(event_types[]))), ("actorIds", Some(actor_ids[]Query.toParamString(actor_ids[]))), ("actorEmails", Some(actor_emails[]Query.toParamString(actor_emails[]))), ("resourceIds", Some(resource_ids[]Query.toParamString(resource_ids[]))), ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListAuditLogsResponse](req)

    } yield resp
  }

}
