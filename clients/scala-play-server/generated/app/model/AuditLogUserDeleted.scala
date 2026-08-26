package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogUserDeleted(
  id: Option[String]
)

object AuditLogUserDeleted {
  implicit lazy val auditLogUserDeletedJsonFormat: Format[AuditLogUserDeleted] = Json.format[AuditLogUserDeleted]
}

