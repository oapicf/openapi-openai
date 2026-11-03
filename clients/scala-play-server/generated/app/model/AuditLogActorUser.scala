package model

import play.api.libs.json._

/**
  * The user who performed the audit logged action.
  * @param id The user id.
  * @param email The user email.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogActorUser(
  id: Option[String],
  email: Option[String]
)

object AuditLogActorUser {
  implicit lazy val auditLogActorUserJsonFormat: Format[AuditLogActorUser] = Json.format[AuditLogActorUser]
}

