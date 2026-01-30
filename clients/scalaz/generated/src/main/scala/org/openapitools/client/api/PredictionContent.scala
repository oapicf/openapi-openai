package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PredictionContent._

case class PredictionContent (
  /* The type of the predicted content you want to provide. This type is currently always `content`.  */
  `type`: `Type`,
content: PredictionContentContent)

object PredictionContent {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Content extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Content" => Some(Content)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Content => "Content"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val PredictionContentCodecJson: CodecJson[PredictionContent] = CodecJson.derive[PredictionContent]
  implicit val PredictionContentDecoder: EntityDecoder[PredictionContent] = jsonOf[PredictionContent]
  implicit val PredictionContentEncoder: EntityEncoder[PredictionContent] = jsonEncoderOf[PredictionContent]
}
