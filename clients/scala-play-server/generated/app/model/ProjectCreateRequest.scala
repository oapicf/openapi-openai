package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectCreateRequest.
  * @param name The friendly name of the project, this name appears in reports.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectCreateRequest(
  name: String
)

object ProjectCreateRequest {
  implicit lazy val projectCreateRequestJsonFormat: Format[ProjectCreateRequest] = Json.format[ProjectCreateRequest]
}

