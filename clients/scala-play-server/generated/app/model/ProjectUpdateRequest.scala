package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUpdateRequest.
  * @param name The updated name of the project, this name appears in reports.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectUpdateRequest(
  name: String
)

object ProjectUpdateRequest {
  implicit lazy val projectUpdateRequestJsonFormat: Format[ProjectUpdateRequest] = Json.format[ProjectUpdateRequest]
}

