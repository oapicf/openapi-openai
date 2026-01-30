package model

import play.api.libs.json._

/**
  * Represents a transcription response returned by model, based on the provided input.
  * @param text The transcribed text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateTranscriptionResponseJson(
  text: String
)

object CreateTranscriptionResponseJson {
  implicit lazy val createTranscriptionResponseJsonJsonFormat: Format[CreateTranscriptionResponseJson] = Json.format[CreateTranscriptionResponseJson]
}

