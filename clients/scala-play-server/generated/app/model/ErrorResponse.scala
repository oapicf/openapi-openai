package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ErrorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ErrorResponse(
  error: Error
)

object ErrorResponse {
  implicit lazy val errorResponseJsonFormat: Format[ErrorResponse] = Json.format[ErrorResponse]
}

