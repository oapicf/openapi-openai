package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateEditResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateEditResponse(
  `object`: String,
  created: Int,
  choices: List[CreateEditResponseChoicesInner],
  usage: CreateCompletionResponseUsage
)

object CreateEditResponse {
  implicit lazy val createEditResponseJsonFormat: Format[CreateEditResponse] = Json.format[CreateEditResponse]
}

