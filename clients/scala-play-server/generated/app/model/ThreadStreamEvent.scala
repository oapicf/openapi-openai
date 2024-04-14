package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThreadStreamEvent.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ThreadStreamEvent(
  event: ThreadStreamEvent.Event.Value,
  data: ThreadObject
)

object ThreadStreamEvent {
  implicit lazy val threadStreamEventJsonFormat: Format[ThreadStreamEvent] = Json.format[ThreadStreamEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadCreated = Value("thread.created")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

