package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for admin_api_keys_delete_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdminApiKeysDelete200Response(
  id: Option[String],
  `object`: Option[String],
  deleted: Option[Boolean]
)

object AdminApiKeysDelete200Response {
  implicit lazy val adminApiKeysDelete200ResponseJsonFormat: Format[AdminApiKeysDelete200Response] = Json.format[AdminApiKeysDelete200Response]
}

