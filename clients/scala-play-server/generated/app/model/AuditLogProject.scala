package model

import play.api.libs.json._

/**
  * The project that the action was scoped to. Absent for actions not scoped to projects.
  * @param id The project ID.
  * @param name The project title.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogProject(
  id: Option[String],
  name: Option[String]
)

object AuditLogProject {
  implicit lazy val auditLogProjectJsonFormat: Format[AuditLogProject] = Json.format[AuditLogProject]
}

