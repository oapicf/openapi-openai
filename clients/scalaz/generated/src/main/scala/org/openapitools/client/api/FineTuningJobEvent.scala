package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobEvent._

case class FineTuningJobEvent (
  id: String,
createdAt: Integer,
level: Level,
message: String,
`object`: `Object`)

object FineTuningJobEvent {
  import DateTimeCodecs._
  sealed trait Level
  case object Info extends Level
  case object Warn extends Level
  case object Error extends Level

  object Level {
    def toLevel(s: String): Option[Level] = s match {
      case "Info" => Some(Info)
      case "Warn" => Some(Warn)
      case "Error" => Some(Error)
      case _ => None
    }

    def fromLevel(x: Level): String = x match {
      case Info => "Info"
      case Warn => "Warn"
      case Error => "Error"
    }
  }

  implicit val LevelEnumEncoder: EncodeJson[Level] =
    EncodeJson[Level](is => StringEncodeJson(Level.fromLevel(is)))

  implicit val LevelEnumDecoder: DecodeJson[Level] =
    DecodeJson.optionDecoder[Level](n => n.string.flatMap(jStr => Level.toLevel(jStr)), "Level failed to de-serialize")
  sealed trait `Object`
  case object FineTuningJobEvent extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "FineTuningJobEvent" => Some(FineTuningJobEvent)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case FineTuningJobEvent => "FineTuningJobEvent"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val FineTuningJobEventCodecJson: CodecJson[FineTuningJobEvent] = CodecJson.derive[FineTuningJobEvent]
  implicit val FineTuningJobEventDecoder: EntityDecoder[FineTuningJobEvent] = jsonOf[FineTuningJobEvent]
  implicit val FineTuningJobEventEncoder: EntityEncoder[FineTuningJobEvent] = jsonEncoderOf[FineTuningJobEvent]
}
