package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseContentPartAddedPart._

case class RealtimeServerEventResponseContentPartAddedPart (
  /* The content type (\"text\", \"audio\"). */
  `type`: Option[`Type`],
/* The text content (if type is \"text\"). */
  text: Option[String],
/* Base64-encoded audio data (if type is \"audio\"). */
  audio: Option[String],
/* The transcript of the audio (if type is \"audio\"). */
  transcript: Option[String])

object RealtimeServerEventResponseContentPartAddedPart {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Audio extends `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Audio" => Some(Audio)
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Audio => "Audio"
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseContentPartAddedPartCodecJson: CodecJson[RealtimeServerEventResponseContentPartAddedPart] = CodecJson.derive[RealtimeServerEventResponseContentPartAddedPart]
  implicit val RealtimeServerEventResponseContentPartAddedPartDecoder: EntityDecoder[RealtimeServerEventResponseContentPartAddedPart] = jsonOf[RealtimeServerEventResponseContentPartAddedPart]
  implicit val RealtimeServerEventResponseContentPartAddedPartEncoder: EntityEncoder[RealtimeServerEventResponseContentPartAddedPart] = jsonEncoderOf[RealtimeServerEventResponseContentPartAddedPart]
}
