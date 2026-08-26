package model

import play.api.libs.json._

/**
  * Returned when a session is updated with a `session.update` event, unless  there is an error. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `session.updated`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeServerEventSessionUpdated(
  eventId: String,
  `type`: RealtimeServerEventSessionUpdated.Type.Value,
  session: RealtimeSession
)

object RealtimeServerEventSessionUpdated {
  implicit lazy val realtimeServerEventSessionUpdatedJsonFormat: Format[RealtimeServerEventSessionUpdated] = Json.format[RealtimeServerEventSessionUpdated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val SessionUpdated = Value("session.updated")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

