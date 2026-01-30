package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogUserDeleted(
  id: Option[String]
)

object AuditLogUserDeleted {
  implicit lazy val auditLogUserDeletedJsonFormat: Format[AuditLogUserDeleted] = Json.format[AuditLogUserDeleted]
}

