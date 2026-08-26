package model

import play.api.libs.json._

/**
  * The user who performed the audit logged action.
  * @param id The user id.
  * @param email The user email.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogActorUser(
  id: Option[String],
  email: Option[String]
)

object AuditLogActorUser {
  implicit lazy val auditLogActorUserJsonFormat: Format[AuditLogActorUser] = Json.format[AuditLogActorUser]
}

