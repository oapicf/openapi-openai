package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectCreateRequest.
  * @param name The friendly name of the project, this name appears in reports.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProjectCreateRequest(
  name: String
)

object ProjectCreateRequest {
  implicit lazy val projectCreateRequestJsonFormat: Format[ProjectCreateRequest] = Json.format[ProjectCreateRequest]
}

