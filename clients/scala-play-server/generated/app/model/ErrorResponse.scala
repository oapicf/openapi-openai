package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ErrorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ErrorResponse(
  error: Error
)

object ErrorResponse {
  implicit lazy val errorResponseJsonFormat: Format[ErrorResponse] = Json.format[ErrorResponse]
}

