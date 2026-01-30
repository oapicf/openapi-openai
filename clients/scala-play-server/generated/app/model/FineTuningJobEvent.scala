package model

import play.api.libs.json._

/**
  * Fine-tuning job event object
  * @param `object` The object type, which is always \"fine_tuning.job.event\".
  * @param id The object identifier.
  * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
  * @param level The log level of the event.
  * @param message The message of the event.
  * @param `type` The type of event.
  * @param data The data associated with the event.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuningJobEvent(
  `object`: FineTuningJobEvent.Object.Value,
  id: String,
  createdAt: Int,
  level: FineTuningJobEvent.Level.Value,
  message: String,
  `type`: Option[FineTuningJobEvent.Type.Value],
  data: Option[JsObject]
)

object FineTuningJobEvent {
  implicit lazy val fineTuningJobEventJsonFormat: Format[FineTuningJobEvent] = Json.format[FineTuningJobEvent]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val FineTuningJobEvent = Value("fine_tuning.job.event")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Level extends Enumeration {
    val Info = Value("info")
    val Warn = Value("warn")
    val Error = Value("error")

    type Level = Value
    implicit lazy val LevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Message = Value("message")
    val Metrics = Value("metrics")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

