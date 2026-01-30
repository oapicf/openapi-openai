package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApiKeyList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ApiKeyList(
  `object`: Option[String],
  data: Option[List[AdminApiKey]],
  hasMore: Option[Boolean],
  firstId: Option[String],
  lastId: Option[String]
)

object ApiKeyList {
  implicit lazy val apiKeyListJsonFormat: Format[ApiKeyList] = Json.format[ApiKeyList]
}

