package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdminApiKey_owner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdminApiKeyOwner(
  `type`: Option[String],
  id: Option[String],
  name: Option[String],
  createdAt: Option[Long],
  role: Option[String]
)

object AdminApiKeyOwner {
  implicit lazy val adminApiKeyOwnerJsonFormat: Format[AdminApiKeyOwner] = Json.format[AdminApiKeyOwner]
}

