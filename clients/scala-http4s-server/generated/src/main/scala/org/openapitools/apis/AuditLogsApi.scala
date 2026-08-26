package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AuditLogEventType
import org.openapitools.models.ListAuditLogsEffectiveAtParameter
import org.openapitools.models.ListAuditLogsResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class AuditLogsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: AuditLogsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object listAuditLogs {
    import AuditLogsApiDelegate.listAuditLogsResponses

    object effective_atQueryParam extends OptionalQueryParamDecoderMatcher[ListAuditLogsEffectiveAtParameter]("effective_at")
    object project_ids[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("project_ids[]")
    object event_types[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[AuditLogEventType]("event_types[]")
    object actor_ids[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("actor_ids[]")
    object actor_emails[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("actor_emails[]")
    object resource_ids[]QueryParam extends OptionalQuerySeqParamDecoderMatcher[String]("resource_ids[]")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "audit_logs" :? effective_atQueryParam(effective_at) +& project_ids[]QueryParam(project_ids[]) +& event_types[]QueryParam(event_types[]) +& actor_ids[]QueryParam(actor_ids[]) +& actor_emails[]QueryParam(actor_emails[]) +& resource_ids[]QueryParam(resource_ids[]) +& limitQueryParam(limit) +& afterQueryParam(after) +& beforeQueryParam(before)) as auth =>
        delegate.listAuditLogs.handle_ApiKeyAuth(auth, req, effective_at, project_ids[], event_types[], actor_ids[], actor_emails[], resource_ids[], limit, after, before, responses)

    }

    val responses: listAuditLogsResponses[F] = new listAuditLogsResponses[F] {
      def resp200(value: ListAuditLogsResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    listAuditLogs.routeApiKeyAuth
}

object AuditLogsApiDelegate {
  trait listAuditLogsResponses[F[_]] {
    def resp200(value: ListAuditLogsResponse): F[Response[F]]
  }

}

trait AuditLogsApiDelegate[F[_], ApiKeyAuth] {

  trait listAuditLogs {
    import AuditLogsApiDelegate.listAuditLogsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      effectiveAt: Option[ListAuditLogsEffectiveAtParameter],
      projectIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      eventTypesLeft_Square_BracketRight_Square_Bracket: Option[List[AuditLogEventType]],
      actorIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      actorEmailsLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      resourceIdsLeft_Square_BracketRight_Square_Bracket: Option[List[String]],
      limit: Option[Int],
      after: Option[String],
      before: Option[String],
      responses: listAuditLogsResponses[F]
    ): F[Response[F]]

  }
  def listAuditLogs: listAuditLogs

}