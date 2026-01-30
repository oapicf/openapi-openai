package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdminApiKey_owner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

