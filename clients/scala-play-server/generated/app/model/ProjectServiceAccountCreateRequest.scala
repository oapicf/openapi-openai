package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectServiceAccountCreateRequest.
  * @param name The name of the service account being created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectServiceAccountCreateRequest(
  name: String
)

object ProjectServiceAccountCreateRequest {
  implicit lazy val projectServiceAccountCreateRequestJsonFormat: Format[ProjectServiceAccountCreateRequest] = Json.format[ProjectServiceAccountCreateRequest]
}

