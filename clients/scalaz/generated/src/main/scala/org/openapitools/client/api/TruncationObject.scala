package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TruncationObject._

case class TruncationObject (
  /* The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. */
  `type`: `Type`,
/* The number of most recent messages from the thread when constructing the context for the run. */
  lastMessages: Option[Integer])

object TruncationObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Auto extends `Type`
  case object LastMessages extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Auto" => Some(Auto)
      case "LastMessages" => Some(LastMessages)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Auto => "Auto"
      case LastMessages => "LastMessages"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val TruncationObjectCodecJson: CodecJson[TruncationObject] = CodecJson.derive[TruncationObject]
  implicit val TruncationObjectDecoder: EntityDecoder[TruncationObject] = jsonOf[TruncationObject]
  implicit val TruncationObjectEncoder: EntityEncoder[TruncationObject] = jsonEncoderOf[TruncationObject]
}
