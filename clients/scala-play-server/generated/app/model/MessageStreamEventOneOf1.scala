package model

import play.api.libs.json._

/**
  * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageStreamEventOneOf1(
  event: MessageStreamEventOneOf1.Event.Value,
  data: MessageObject
)

object MessageStreamEventOneOf1 {
  implicit lazy val messageStreamEventOneOf1JsonFormat: Format[MessageStreamEventOneOf1] = Json.format[MessageStreamEventOneOf1]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageInProgress = Value("thread.message.in_progress")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

