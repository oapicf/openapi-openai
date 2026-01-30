package model

import play.api.libs.json._

/**
  * The project that the action was scoped to. Absent for actions not scoped to projects.
  * @param id The project ID.
  * @param name The project title.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogProject(
  id: Option[String],
  name: Option[String]
)

object AuditLogProject {
  implicit lazy val auditLogProjectJsonFormat: Format[AuditLogProject] = Json.format[AuditLogProject]
}

