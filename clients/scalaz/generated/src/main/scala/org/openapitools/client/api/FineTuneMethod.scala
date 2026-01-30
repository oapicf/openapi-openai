package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneMethod._

case class FineTuneMethod (
  /* The type of method. Is either `supervised` or `dpo`. */
  `type`: Option[`Type`],
supervised: Option[FineTuneSupervisedMethod],
dpo: Option[FineTuneDPOMethod])

object FineTuneMethod {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Supervised extends `Type`
  case object Dpo extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Supervised" => Some(Supervised)
      case "Dpo" => Some(Dpo)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Supervised => "Supervised"
      case Dpo => "Dpo"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val FineTuneMethodCodecJson: CodecJson[FineTuneMethod] = CodecJson.derive[FineTuneMethod]
  implicit val FineTuneMethodDecoder: EntityDecoder[FineTuneMethod] = jsonOf[FineTuneMethod]
  implicit val FineTuneMethodEncoder: EntityEncoder[FineTuneMethod] = jsonEncoderOf[FineTuneMethod]
}
