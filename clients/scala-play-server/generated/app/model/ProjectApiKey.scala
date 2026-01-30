package model

import play.api.libs.json._

/**
  * Represents an individual API key in a project.
  * @param `object` The object type, which is always `organization.project.api_key`
  * @param redactedValue The redacted value of the API key
  * @param name The name of the API key
  * @param createdAt The Unix timestamp (in seconds) of when the API key was created
  * @param id The identifier, which can be referenced in API endpoints
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectApiKey(
  `object`: ProjectApiKey.Object.Value,
  redactedValue: String,
  name: String,
  createdAt: Int,
  id: String,
  owner: ProjectApiKeyOwner
)

object ProjectApiKey {
  implicit lazy val projectApiKeyJsonFormat: Format[ProjectApiKey] = Json.format[ProjectApiKey]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectApiKey = Value("organization.project.api_key")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

