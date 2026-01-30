package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealtimeConversationItem_content_inner.
  * @param `type` The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  * @param text The text content, used for `input_text` and `text` content types. 
  * @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
  * @param audio Base64-encoded audio bytes, used for `input_audio` content type. 
  * @param transcript The transcript of the audio, used for `input_audio` content type. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeConversationItemContentInner(
  `type`: Option[RealtimeConversationItemContentInner.Type.Value],
  text: Option[String],
  id: Option[String],
  audio: Option[String],
  transcript: Option[String]
)

object RealtimeConversationItemContentInner {
  implicit lazy val realtimeConversationItemContentInnerJsonFormat: Format[RealtimeConversationItemContentInner] = Json.format[RealtimeConversationItemContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudio = Value("input_audio")
    val InputText = Value("input_text")
    val ItemReference = Value("item_reference")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

