package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdminApiKey.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

