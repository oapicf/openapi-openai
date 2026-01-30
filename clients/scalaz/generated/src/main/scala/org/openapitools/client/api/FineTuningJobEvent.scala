package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobEvent._

case class FineTuningJobEvent (
  /* The object type, which is always \"fine_tuning.job.event\". */
  `object`: `Object`,
/* The object identifier. */
  id: String,
/* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
  createdAt: Integer,
/* The log level of the event. */
  level: Level,
/* The message of the event. */
  message: String,
/* The type of event. */
  `type`: Option[`Type`],
/* The data associated with the event. */
  data: Option[Any])

object FineTuningJobEvent {
  import DateTimeCodecs._
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
  sealed trait `Type`
  case object Message extends `Type`
  case object Metrics extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Message" => Some(Message)
      case "Metrics" => Some(Metrics)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Message => "Message"
      case Metrics => "Metrics"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val FineTuningJobEventCodecJson: CodecJson[FineTuningJobEvent] = CodecJson.derive[FineTuningJobEvent]
  implicit val FineTuningJobEventDecoder: EntityDecoder[FineTuningJobEvent] = jsonOf[FineTuningJobEvent]
  implicit val FineTuningJobEventEncoder: EntityEncoder[FineTuningJobEvent] = jsonEncoderOf[FineTuningJobEvent]
}
