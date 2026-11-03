package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for admin_api_keys_create_request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdminApiKeysCreateRequest(
  name: String
)

object AdminApiKeysCreateRequest {
  implicit lazy val adminApiKeysCreateRequestJsonFormat: Format[AdminApiKeysCreateRequest] = Json.format[AdminApiKeysCreateRequest]
}

