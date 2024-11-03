package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Error(
  code: String,
  message: String,
  param: String,
  `type`: String
)

object Error {
  implicit lazy val errorJsonFormat: Format[Error] = Json.format[Error]
}

