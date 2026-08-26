package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The tracking ID of the API key.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogApiKeyDeleted(
  id: Option[String]
)

object AuditLogApiKeyDeleted {
  implicit lazy val auditLogApiKeyDeletedJsonFormat: Format[AuditLogApiKeyDeleted] = Json.format[AuditLogApiKeyDeleted]
}

