package model

import play.api.libs.json._

/**
  * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.done`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseDone(
  eventId: String,
  `type`: RealtimeServerEventResponseDone.Type.Value,
  response: RealtimeResponse
)

object RealtimeServerEventResponseDone {
  implicit lazy val realtimeServerEventResponseDoneJsonFormat: Format[RealtimeServerEventResponseDone] = Json.format[RealtimeServerEventResponseDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseDone = Value("response.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

