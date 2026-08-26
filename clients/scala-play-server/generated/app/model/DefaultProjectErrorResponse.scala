package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DefaultProjectErrorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DefaultProjectErrorResponse(
  code: Int,
  message: String
)

object DefaultProjectErrorResponse {
  implicit lazy val defaultProjectErrorResponseJsonFormat: Format[DefaultProjectErrorResponse] = Json.format[DefaultProjectErrorResponse]
}

