package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseFunctionCallArgumentsDone._

case class RealtimeServerEventResponseFunctionCallArgumentsDone (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.function_call_arguments.done`.  */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the function call item. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The ID of the function call. */
  callId: String,
/* The final arguments as a JSON string. */
  arguments: String)

object RealtimeServerEventResponseFunctionCallArgumentsDone {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseFunctionCallArgumentsDone extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseFunctionCallArgumentsDone" => Some(ResponseFunctionCallArgumentsDone)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseFunctionCallArgumentsDone => "ResponseFunctionCallArgumentsDone"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseFunctionCallArgumentsDoneCodecJson: CodecJson[RealtimeServerEventResponseFunctionCallArgumentsDone] = CodecJson.derive[RealtimeServerEventResponseFunctionCallArgumentsDone]
  implicit val RealtimeServerEventResponseFunctionCallArgumentsDoneDecoder: EntityDecoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = jsonOf[RealtimeServerEventResponseFunctionCallArgumentsDone]
  implicit val RealtimeServerEventResponseFunctionCallArgumentsDoneEncoder: EntityEncoder[RealtimeServerEventResponseFunctionCallArgumentsDone] = jsonEncoderOf[RealtimeServerEventResponseFunctionCallArgumentsDone]
}
