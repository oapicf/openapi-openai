package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for admin_api_keys_create_request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdminApiKeysCreateRequest(
  name: String
)

object AdminApiKeysCreateRequest {
  implicit lazy val adminApiKeysCreateRequestJsonFormat: Format[AdminApiKeysCreateRequest] = Json.format[AdminApiKeysCreateRequest]
}

