package model

import play.api.libs.json._

/**
  * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `session.update`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeClientEventSessionUpdate(
  eventId: Option[String],
  `type`: RealtimeClientEventSessionUpdate.Type.Value,
  session: RealtimeSessionCreateRequest
)

object RealtimeClientEventSessionUpdate {
  implicit lazy val realtimeClientEventSessionUpdateJsonFormat: Format[RealtimeClientEventSessionUpdate] = Json.format[RealtimeClientEventSessionUpdate]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val SessionUpdate = Value("session.update")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

