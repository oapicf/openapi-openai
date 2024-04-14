package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TranscriptionWord.
  * @param word The text content of the word.
  * @param start Start time of the word in seconds.
  * @param end End time of the word in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TranscriptionWord(
  word: String,
  start: Float,
  end: Float
)

object TranscriptionWord {
  implicit lazy val transcriptionWordJsonFormat: Format[TranscriptionWord] = Json.format[TranscriptionWord]
}

