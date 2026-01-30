package model

import play.api.libs.json._

/**
  * The content part that was added.
  * @param `type` The content type (\"text\", \"audio\").
  * @param text The text content (if type is \"text\").
  * @param audio Base64-encoded audio data (if type is \"audio\").
  * @param transcript The transcript of the audio (if type is \"audio\").
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseContentPartAddedPart(
  `type`: Option[RealtimeServerEventResponseContentPartAddedPart.Type.Value],
  text: Option[String],
  audio: Option[String],
  transcript: Option[String]
)

object RealtimeServerEventResponseContentPartAddedPart {
  implicit lazy val realtimeServerEventResponseContentPartAddedPartJsonFormat: Format[RealtimeServerEventResponseContentPartAddedPart] = Json.format[RealtimeServerEventResponseContentPartAddedPart]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Audio = Value("audio")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

