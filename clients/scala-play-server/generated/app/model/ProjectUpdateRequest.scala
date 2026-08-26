package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUpdateRequest.
  * @param name The updated name of the project, this name appears in reports.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectUpdateRequest(
  name: String
)

object ProjectUpdateRequest {
  implicit lazy val projectUpdateRequestJsonFormat: Format[ProjectUpdateRequest] = Json.format[ProjectUpdateRequest]
}

