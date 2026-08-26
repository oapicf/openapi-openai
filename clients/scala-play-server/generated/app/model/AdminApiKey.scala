package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdminApiKey.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

