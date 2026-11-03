package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateTranslationResponseVerboseJson.
  * @param language The language of the output translation (always `english`).
  * @param duration The duration of the input audio.
  * @param text The translated text.
  * @param segments Segments of the translated text and their corresponding details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateTranslationResponseVerboseJson(
  language: String,
  duration: String,
  text: String,
  segments: Option[List[TranscriptionSegment]]
)

object CreateTranslationResponseVerboseJson {
  implicit lazy val createTranslationResponseVerboseJsonJsonFormat: Format[CreateTranslationResponseVerboseJson] = Json.format[CreateTranslationResponseVerboseJson]
}

