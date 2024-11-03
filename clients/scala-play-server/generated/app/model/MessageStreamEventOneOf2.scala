package model

import play.api.libs.json._

/**
  * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageStreamEventOneOf2(
  event: MessageStreamEventOneOf2.Event.Value,
  data: MessageDeltaObject
)

object MessageStreamEventOneOf2 {
  implicit lazy val messageStreamEventOneOf2JsonFormat: Format[MessageStreamEventOneOf2] = Json.format[MessageStreamEventOneOf2]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageDelta = Value("thread.message.delta")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

