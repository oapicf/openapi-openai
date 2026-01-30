package model

import play.api.libs.json._

/**
  * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `response.create`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventResponseCreate(
  eventId: Option[String],
  `type`: RealtimeClientEventResponseCreate.Type.Value,
  response: Option[RealtimeResponseCreateParams]
)

object RealtimeClientEventResponseCreate {
  implicit lazy val realtimeClientEventResponseCreateJsonFormat: Format[RealtimeClientEventResponseCreate] = Json.format[RealtimeClientEventResponseCreate]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseCreate = Value("response.create")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

