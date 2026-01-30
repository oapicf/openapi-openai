package model

import play.api.libs.json._

/**
  * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `session.created`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventSessionCreated(
  eventId: String,
  `type`: RealtimeServerEventSessionCreated.Type.Value,
  session: RealtimeSession
)

object RealtimeServerEventSessionCreated {
  implicit lazy val realtimeServerEventSessionCreatedJsonFormat: Format[RealtimeServerEventSessionCreated] = Json.format[RealtimeServerEventSessionCreated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val SessionCreated = Value("session.created")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

