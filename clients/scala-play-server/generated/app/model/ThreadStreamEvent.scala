package model

import play.api.libs.json._

/**
  * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
  * @param enabled Whether to enable input audio transcription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ThreadStreamEvent(
  enabled: Option[Boolean],
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

