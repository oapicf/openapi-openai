package model

import play.api.libs.json._

/**
  * The event type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogEventType(
)

object AuditLogEventType {
  implicit lazy val auditLogEventTypeJsonFormat: Format[AuditLogEventType] = Json.format[AuditLogEventType]
}

