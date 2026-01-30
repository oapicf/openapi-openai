package model

import play.api.libs.json._

/**
  * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.created`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseCreated(
  eventId: String,
  `type`: RealtimeServerEventResponseCreated.Type.Value,
  response: RealtimeResponse
)

object RealtimeServerEventResponseCreated {
  implicit lazy val realtimeServerEventResponseCreatedJsonFormat: Format[RealtimeServerEventResponseCreated] = Json.format[RealtimeServerEventResponseCreated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseCreated = Value("response.created")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

