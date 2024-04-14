package model

import play.api.libs.json._

/**
  * Fine-tuning job event object
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuningJobEvent(
  id: String,
  createdAt: Int,
  level: FineTuningJobEvent.Level.Value,
  message: String,
  `object`: FineTuningJobEvent.Object.Value
)

object FineTuningJobEvent {
  implicit lazy val fineTuningJobEventJsonFormat: Format[FineTuningJobEvent] = Json.format[FineTuningJobEvent]

  // noinspection TypeAnnotation
  object Level extends Enumeration {
    val Info = Value("info")
    val Warn = Value("warn")
    val Error = Value("error")

    type Level = Value
    implicit lazy val LevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val FineTuningJobEvent = Value("fine_tuning.job.event")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

