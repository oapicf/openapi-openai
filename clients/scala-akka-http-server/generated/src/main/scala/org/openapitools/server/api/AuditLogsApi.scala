package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AuditLogEventType
import org.openapitools.server.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.server.model.ListAuditLogsResponse


class AuditLogsApi(
    auditLogsService: AuditLogsApiService,
    auditLogsMarshaller: AuditLogsApiMarshaller
) {

  
  import auditLogsMarshaller._

  lazy val route: Route =
    path("organization" / "audit_logs") { 
      get { 
        parameters("effective_at".as[String].?, "project_ids[]".as[String].?, "event_types[]".as[String].?, "actor_ids[]".as[String].?, "actor_emails[]".as[String].?, "resource_ids[]".as[String].?, "limit".as[Int].?(20), "after".as[String].?, "before".as[String].?) { (effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket, limit, after, before) => 
            auditLogsService.listAuditLogs(effectiveAt = effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket = projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket = eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket = actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket = actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket = resourceIdsLeft_Square_BracketRight_Square_Bracket, limit = limit, after = after, before = before)
        }
      }
    }
}


trait AuditLogsApiService {

  def listAuditLogs200(responseListAuditLogsResponse: ListAuditLogsResponse)(implicit toEntityMarshallerListAuditLogsResponse: ToEntityMarshaller[ListAuditLogsResponse]): Route =
    complete((200, responseListAuditLogsResponse))
  /**
   * Code: 200, Message: Audit logs listed successfully., DataType: ListAuditLogsResponse
   */
  def listAuditLogs(effectiveAt: Option[String], projectIdsLeft_Square_BracketRight_Square_Bracket: Option[String], eventTypesLeft_Square_BracketRight_Square_Bracket: Option[String], actorIdsLeft_Square_BracketRight_Square_Bracket: Option[String], actorEmailsLeft_Square_BracketRight_Square_Bracket: Option[String], resourceIdsLeft_Square_BracketRight_Square_Bracket: Option[String], limit: Int, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerListAuditLogsResponse: ToEntityMarshaller[ListAuditLogsResponse]): Route

}

trait AuditLogsApiMarshaller {


  implicit def toEntityMarshallerListAuditLogsResponse: ToEntityMarshaller[ListAuditLogsResponse]

}

