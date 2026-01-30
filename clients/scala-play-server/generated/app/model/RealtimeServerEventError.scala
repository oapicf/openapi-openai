package model

import play.api.libs.json._

/**
  * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `error`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventError(
  eventId: String,
  `type`: RealtimeServerEventError.Type.Value,
  error: RealtimeServerEventErrorError
)

object RealtimeServerEventError {
  implicit lazy val realtimeServerEventErrorJsonFormat: Format[RealtimeServerEventError] = Json.format[RealtimeServerEventError]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Error = Value("error")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

