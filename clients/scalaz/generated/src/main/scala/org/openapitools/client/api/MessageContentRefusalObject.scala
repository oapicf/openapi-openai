package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentRefusalObject._

case class MessageContentRefusalObject (
  /* Always `refusal`. */
  `type`: `Type`,
refusal: String)

object MessageContentRefusalObject {
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

  implicit val MessageContentRefusalObjectCodecJson: CodecJson[MessageContentRefusalObject] = CodecJson.derive[MessageContentRefusalObject]
  implicit val MessageContentRefusalObjectDecoder: EntityDecoder[MessageContentRefusalObject] = jsonOf[MessageContentRefusalObject]
  implicit val MessageContentRefusalObjectEncoder: EntityEncoder[MessageContentRefusalObject] = jsonEncoderOf[MessageContentRefusalObject]
}
