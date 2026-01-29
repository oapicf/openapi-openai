package model

import play.api.libs.json._

/**
  * Occurs when a [message](/docs/api-reference/messages/object) is completed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageStreamEventOneOf3(
  event: MessageStreamEventOneOf3.Event.Value,
  data: MessageObject
)

object MessageStreamEventOneOf3 {
  implicit lazy val messageStreamEventOneOf3JsonFormat: Format[MessageStreamEventOneOf3] = Json.format[MessageStreamEventOneOf3]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageCompleted = Value("thread.message.completed")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

