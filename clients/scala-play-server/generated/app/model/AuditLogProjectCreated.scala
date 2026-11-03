package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The project ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogProjectCreated(
  id: Option[String],
  data: Option[AuditLogProjectCreatedData]
)

object AuditLogProjectCreated {
  implicit lazy val auditLogProjectCreatedJsonFormat: Format[AuditLogProjectCreated] = Json.format[AuditLogProjectCreated]
}

