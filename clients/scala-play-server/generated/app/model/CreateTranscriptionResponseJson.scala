package model

import play.api.libs.json._

/**
  * Represents a transcription response returned by model, based on the provided input.
  * @param text The transcribed text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateTranscriptionResponseJson(
  text: String
)

object CreateTranscriptionResponseJson {
  implicit lazy val createTranscriptionResponseJsonJsonFormat: Format[CreateTranscriptionResponseJson] = Json.format[CreateTranscriptionResponseJson]
}

