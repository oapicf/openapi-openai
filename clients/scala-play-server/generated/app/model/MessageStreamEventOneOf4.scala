package model

import play.api.libs.json._

/**
  * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageStreamEventOneOf4(
  event: MessageStreamEventOneOf4.Event.Value,
  data: MessageObject
)

object MessageStreamEventOneOf4 {
  implicit lazy val messageStreamEventOneOf4JsonFormat: Format[MessageStreamEventOneOf4] = Json.format[MessageStreamEventOneOf4]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageIncomplete = Value("thread.message.incomplete")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

