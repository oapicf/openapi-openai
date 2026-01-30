package model

import play.api.libs.json._

/**
  * The session in which the audit logged action was performed.
  * @param ipAddress The IP address from which the action was performed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogActorSession(
  user: Option[AuditLogActorUser],
  ipAddress: Option[String]
)

object AuditLogActorSession {
  implicit lazy val auditLogActorSessionJsonFormat: Format[AuditLogActorSession] = Json.format[AuditLogActorSession]
}

