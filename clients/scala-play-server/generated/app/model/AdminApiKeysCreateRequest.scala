package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for admin_api_keys_create_request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdminApiKeysCreateRequest(
  name: String
)

object AdminApiKeysCreateRequest {
  implicit lazy val adminApiKeysCreateRequestJsonFormat: Format[AdminApiKeysCreateRequest] = Json.format[AdminApiKeysCreateRequest]
}

