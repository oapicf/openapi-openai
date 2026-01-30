package model

import play.api.libs.json._

/**
  * Returned when a new content part is added to an assistant message item during response generation. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.content_part.added`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item to which the content part was added.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseContentPartAdded(
  eventId: String,
  `type`: RealtimeServerEventResponseContentPartAdded.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  part: RealtimeServerEventResponseContentPartAddedPart
)

object RealtimeServerEventResponseContentPartAdded {
  implicit lazy val realtimeServerEventResponseContentPartAddedJsonFormat: Format[RealtimeServerEventResponseContentPartAdded] = Json.format[RealtimeServerEventResponseContentPartAdded]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseContentPartAdded = Value("response.content_part.added")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

