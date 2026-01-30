package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseFunctionCallArgumentsDelta._

case class RealtimeServerEventResponseFunctionCallArgumentsDelta (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.function_call_arguments.delta`.  */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the function call item. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The ID of the function call. */
  callId: String,
/* The arguments delta as a JSON string. */
  delta: String)

object RealtimeServerEventResponseFunctionCallArgumentsDelta {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseFunctionCallArgumentsDelta extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseFunctionCallArgumentsDelta" => Some(ResponseFunctionCallArgumentsDelta)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseFunctionCallArgumentsDelta => "ResponseFunctionCallArgumentsDelta"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseFunctionCallArgumentsDeltaCodecJson: CodecJson[RealtimeServerEventResponseFunctionCallArgumentsDelta] = CodecJson.derive[RealtimeServerEventResponseFunctionCallArgumentsDelta]
  implicit val RealtimeServerEventResponseFunctionCallArgumentsDeltaDecoder: EntityDecoder[RealtimeServerEventResponseFunctionCallArgumentsDelta] = jsonOf[RealtimeServerEventResponseFunctionCallArgumentsDelta]
  implicit val RealtimeServerEventResponseFunctionCallArgumentsDeltaEncoder: EntityEncoder[RealtimeServerEventResponseFunctionCallArgumentsDelta] = jsonEncoderOf[RealtimeServerEventResponseFunctionCallArgumentsDelta]
}
