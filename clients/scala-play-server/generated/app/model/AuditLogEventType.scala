package model

import play.api.libs.json._

/**
  * The event type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogEventType(
)

object AuditLogEventType {
  implicit lazy val auditLogEventTypeJsonFormat: Format[AuditLogEventType] = Json.format[AuditLogEventType]
}

