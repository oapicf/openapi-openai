package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageRequestContentTextObject._

case class MessageRequestContentTextObject (
  /* Always `text`. */
  `type`: `Type`,
/* Text content to be sent to the model */
  text: String)

object MessageRequestContentTextObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageRequestContentTextObjectCodecJson: CodecJson[MessageRequestContentTextObject] = CodecJson.derive[MessageRequestContentTextObject]
  implicit val MessageRequestContentTextObjectDecoder: EntityDecoder[MessageRequestContentTextObject] = jsonOf[MessageRequestContentTextObject]
  implicit val MessageRequestContentTextObjectEncoder: EntityEncoder[MessageRequestContentTextObject] = jsonEncoderOf[MessageRequestContentTextObject]
}
