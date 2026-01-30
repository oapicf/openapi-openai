package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdminApiKey.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdminApiKey(
  `object`: Option[String],
  id: Option[String],
  name: Option[String],
  redactedValue: Option[String],
  value: Option[String],
  createdAt: Option[Long],
  owner: Option[AdminApiKeyOwner]
)

object AdminApiKey {
  implicit lazy val adminApiKeyJsonFormat: Format[AdminApiKey] = Json.format[AdminApiKey]
}

