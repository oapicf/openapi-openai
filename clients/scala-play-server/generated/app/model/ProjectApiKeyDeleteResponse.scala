package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectApiKeyDeleteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectApiKeyDeleteResponse(
  `object`: ProjectApiKeyDeleteResponse.Object.Value,
  id: String,
  deleted: Boolean
)

object ProjectApiKeyDeleteResponse {
  implicit lazy val projectApiKeyDeleteResponseJsonFormat: Format[ProjectApiKeyDeleteResponse] = Json.format[ProjectApiKeyDeleteResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectApiKeyDeleted = Value("organization.project.api_key.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

