package model

import play.api.libs.json._

/**
  * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ThreadStreamEventOneOf(
  event: ThreadStreamEventOneOf.Event.Value,
  data: ThreadObject
)

object ThreadStreamEventOneOf {
  implicit lazy val threadStreamEventOneOfJsonFormat: Format[ThreadStreamEventOneOf] = Json.format[ThreadStreamEventOneOf]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadCreated = Value("thread.created")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

