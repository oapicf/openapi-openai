package model

import play.api.libs.json._

/**
  * The payload used to create the project.
  * @param name The project name.
  * @param title The title of the project as seen on the dashboard.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogProjectCreatedData(
  name: Option[String],
  title: Option[String]
)

object AuditLogProjectCreatedData {
  implicit lazy val auditLogProjectCreatedDataJsonFormat: Format[AuditLogProjectCreatedData] = Json.format[AuditLogProjectCreatedData]
}

