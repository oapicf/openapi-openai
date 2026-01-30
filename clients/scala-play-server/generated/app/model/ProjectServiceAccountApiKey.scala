package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectServiceAccountApiKey.
  * @param `object` The object type, which is always `organization.project.service_account.api_key`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectServiceAccountApiKey(
  `object`: ProjectServiceAccountApiKey.Object.Value,
  value: String,
  name: String,
  createdAt: Int,
  id: String
)

object ProjectServiceAccountApiKey {
  implicit lazy val projectServiceAccountApiKeyJsonFormat: Format[ProjectServiceAccountApiKey] = Json.format[ProjectServiceAccountApiKey]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectServiceAccountApiKey = Value("organization.project.service_account.api_key")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

