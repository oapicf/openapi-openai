package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentRefusalObject._

case class MessageDeltaContentRefusalObject (
  /* The index of the refusal part in the message. */
  index: Integer,
/* Always `refusal`. */
  `type`: `Type`,
refusal: Option[String])

object MessageDeltaContentRefusalObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Refusal extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Refusal" => Some(Refusal)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Refusal => "Refusal"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageDeltaContentRefusalObjectCodecJson: CodecJson[MessageDeltaContentRefusalObject] = CodecJson.derive[MessageDeltaContentRefusalObject]
  implicit val MessageDeltaContentRefusalObjectDecoder: EntityDecoder[MessageDeltaContentRefusalObject] = jsonOf[MessageDeltaContentRefusalObject]
  implicit val MessageDeltaContentRefusalObjectEncoder: EntityEncoder[MessageDeltaContentRefusalObject] = jsonEncoderOf[MessageDeltaContentRefusalObject]
}
