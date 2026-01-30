package model

import play.api.libs.json._

/**
  * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `response.cancel`.
  * @param responseId A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventResponseCancel(
  eventId: Option[String],
  `type`: RealtimeClientEventResponseCancel.Type.Value,
  responseId: Option[String]
)

object RealtimeClientEventResponseCancel {
  implicit lazy val realtimeClientEventResponseCancelJsonFormat: Format[RealtimeClientEventResponseCancel] = Json.format[RealtimeClientEventResponseCancel]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseCancel = Value("response.cancel")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

