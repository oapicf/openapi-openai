package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseTextDone._

case class RealtimeServerEventResponseTextDone (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.text.done`. */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the item. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The index of the content part in the item's content array. */
  contentIndex: Integer,
/* The final text content. */
  text: String)

object RealtimeServerEventResponseTextDone {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseTextDone extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseTextDone" => Some(ResponseTextDone)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseTextDone => "ResponseTextDone"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseTextDoneCodecJson: CodecJson[RealtimeServerEventResponseTextDone] = CodecJson.derive[RealtimeServerEventResponseTextDone]
  implicit val RealtimeServerEventResponseTextDoneDecoder: EntityDecoder[RealtimeServerEventResponseTextDone] = jsonOf[RealtimeServerEventResponseTextDone]
  implicit val RealtimeServerEventResponseTextDoneEncoder: EntityEncoder[RealtimeServerEventResponseTextDone] = jsonEncoderOf[RealtimeServerEventResponseTextDone]
}
