package model

import play.api.libs.json._

/**
  * Occurs when a stream ends.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DoneEvent(
  event: DoneEvent.Event.Value,
  data: DoneEvent.Data.Value
)

object DoneEvent {
  implicit lazy val doneEventJsonFormat: Format[DoneEvent] = Json.format[DoneEvent]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val Done = Value("done")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Data extends Enumeration {
    val DONE = Value("[DONE]")

    type Data = Value
    implicit lazy val DataJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

