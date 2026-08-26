package model

import play.api.libs.json._

/**
  * The event type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogEventType(
)

object AuditLogEventType {
  implicit lazy val auditLogEventTypeJsonFormat: Format[AuditLogEventType] = Json.format[AuditLogEventType]
}

