package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for createTranscription_200_response.
  * @param text The transcribed text.
  * @param language The language of the input audio.
  * @param duration The duration of the input audio.
  * @param words Extracted words and their corresponding timestamps.
  * @param segments Segments of the transcribed text and their corresponding details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateTranscription200Response(
  text: String,
  language: String,
  duration: String,
  words: Option[List[TranscriptionWord]],
  segments: Option[List[TranscriptionSegment]]
)

object CreateTranscription200Response {
  implicit lazy val createTranscription200ResponseJsonFormat: Format[CreateTranscription200Response] = Json.format[CreateTranscription200Response]
}

