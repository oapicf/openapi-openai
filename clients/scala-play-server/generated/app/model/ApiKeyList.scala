package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApiKeyList.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

