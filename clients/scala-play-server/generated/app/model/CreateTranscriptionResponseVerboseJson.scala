package model

import play.api.libs.json._

/**
  * Represents a verbose json transcription response returned by model, based on the provided input.
  * @param language The language of the input audio.
  * @param duration The duration of the input audio.
  * @param text The transcribed text.
  * @param words Extracted words and their corresponding timestamps.
  * @param segments Segments of the transcribed text and their corresponding details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateTranscriptionResponseVerboseJson(
  language: String,
  duration: String,
  text: String,
  words: Option[List[TranscriptionWord]],
  segments: Option[List[TranscriptionSegment]]
)

object CreateTranscriptionResponseVerboseJson {
  implicit lazy val createTranscriptionResponseVerboseJsonJsonFormat: Format[CreateTranscriptionResponseVerboseJson] = Json.format[CreateTranscriptionResponseVerboseJson]
}

