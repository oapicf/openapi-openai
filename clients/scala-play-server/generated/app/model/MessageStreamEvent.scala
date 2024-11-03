package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageStreamEvent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageStreamEvent(
  event: MessageStreamEvent.Event.Value,
  data: MessageObject
)

object MessageStreamEvent {
  implicit lazy val messageStreamEventJsonFormat: Format[MessageStreamEvent] = Json.format[MessageStreamEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageIncomplete = Value("thread.message.incomplete")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

