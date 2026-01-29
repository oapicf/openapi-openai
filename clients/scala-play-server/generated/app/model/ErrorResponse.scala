package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ErrorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ErrorResponse(
  error: Error
)

object ErrorResponse {
  implicit lazy val errorResponseJsonFormat: Format[ErrorResponse] = Json.format[ErrorResponse]
}

