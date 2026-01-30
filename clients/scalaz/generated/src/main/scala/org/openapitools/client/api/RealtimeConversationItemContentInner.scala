package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeConversationItemContentInner._

case class RealtimeConversationItemContentInner (
  /* The content type (`input_text`, `input_audio`, `item_reference`, `text`).  */
  `type`: Option[`Type`],
/* The text content, used for `input_text` and `text` content types.  */
  text: Option[String],
/* ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  */
  id: Option[String],
/* Base64-encoded audio bytes, used for `input_audio` content type.  */
  audio: Option[String],
/* The transcript of the audio, used for `input_audio` content type.  */
  transcript: Option[String])

object RealtimeConversationItemContentInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudio extends `Type`
  case object InputText extends `Type`
  case object ItemReference extends `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudio" => Some(InputAudio)
      case "InputText" => Some(InputText)
      case "ItemReference" => Some(ItemReference)
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudio => "InputAudio"
      case InputText => "InputText"
      case ItemReference => "ItemReference"
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeConversationItemContentInnerCodecJson: CodecJson[RealtimeConversationItemContentInner] = CodecJson.derive[RealtimeConversationItemContentInner]
  implicit val RealtimeConversationItemContentInnerDecoder: EntityDecoder[RealtimeConversationItemContentInner] = jsonOf[RealtimeConversationItemContentInner]
  implicit val RealtimeConversationItemContentInnerEncoder: EntityEncoder[RealtimeConversationItemContentInner] = jsonEncoderOf[RealtimeConversationItemContentInner]
}
