package model

import play.api.libs.json._

/**
  * Represents if a given text input is potentially harmful.
  * @param id The unique identifier for the moderation request.
  * @param model The model used to generate the moderation results.
  * @param results A list of moderation objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateModerationResponse(
  id: String,
  model: String,
  results: List[CreateModerationResponseResultsInner]
)

object CreateModerationResponse {
  implicit lazy val createModerationResponseJsonFormat: Format[CreateModerationResponse] = Json.format[CreateModerationResponse]
}

