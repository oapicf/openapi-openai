package model

import play.api.libs.json._

/**
  * Represents if a given text input is potentially harmful.
  * @param id The unique identifier for the moderation request.
  * @param model The model used to generate the moderation results.
  * @param results A list of moderation objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationResponse(
  id: String,
  model: String,
  results: List[CreateModerationResponseResultsInner]
)

object CreateModerationResponse {
  implicit lazy val createModerationResponseJsonFormat: Format[CreateModerationResponse] = Json.format[CreateModerationResponse]
}

