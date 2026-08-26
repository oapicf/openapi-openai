package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The rate limit ID
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogRateLimitDeleted(
  id: Option[String]
)

object AuditLogRateLimitDeleted {
  implicit lazy val auditLogRateLimitDeletedJsonFormat: Format[AuditLogRateLimitDeleted] = Json.format[AuditLogRateLimitDeleted]
}

