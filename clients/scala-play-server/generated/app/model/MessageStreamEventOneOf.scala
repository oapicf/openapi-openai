package model

import play.api.libs.json._

/**
  * Occurs when a [message](/docs/api-reference/messages/object) is created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageStreamEventOneOf(
  event: MessageStreamEventOneOf.Event.Value,
  data: MessageObject
)

object MessageStreamEventOneOf {
  implicit lazy val messageStreamEventOneOfJsonFormat: Format[MessageStreamEventOneOf] = Json.format[MessageStreamEventOneOf]

  // noinspection TypeAnnotation
  object Event extends Enumeration {
    val ThreadMessageCreated = Value("thread.message.created")

    type Event = Value
    implicit lazy val EventJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

