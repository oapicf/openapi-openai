package model

import play.api.libs.json._

/**
  * Represents an individual project.
  * @param id The identifier, which can be referenced in API endpoints
  * @param `object` The object type, which is always `organization.project`
  * @param name The name of the project. This appears in reporting.
  * @param createdAt The Unix timestamp (in seconds) of when the project was created.
  * @param archivedAt The Unix timestamp (in seconds) of when the project was archived or `null`.
  * @param status `active` or `archived`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Project(
  id: String,
  `object`: Project.Object.Value,
  name: String,
  createdAt: Int,
  archivedAt: Option[Int],
  status: Project.Status.Value
)

object Project {
  implicit lazy val projectJsonFormat: Format[Project] = Json.format[Project]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProject = Value("organization.project")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Active = Value("active")
    val Archived = Value("archived")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

