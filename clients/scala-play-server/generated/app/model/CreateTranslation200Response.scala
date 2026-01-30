package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for createTranslation_200_response.
  * @param text The translated text.
  * @param language The language of the output translation (always `english`).
  * @param duration The duration of the input audio.
  * @param segments Segments of the translated text and their corresponding details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateTranslation200Response(
  text: String,
  language: String,
  duration: String,
  segments: Option[List[TranscriptionSegment]]
)

object CreateTranslation200Response {
  implicit lazy val createTranslation200ResponseJsonFormat: Format[CreateTranslation200Response] = Json.format[CreateTranslation200Response]
}

