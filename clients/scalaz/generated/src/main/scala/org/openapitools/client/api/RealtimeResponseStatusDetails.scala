package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseStatusDetails._

case class RealtimeResponseStatusDetails (
  /* The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  */
  `type`: Option[`Type`],
/* The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  */
  reason: Option[Reason],
error: Option[RealtimeResponseStatusDetailsError])

object RealtimeResponseStatusDetails {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Completed extends `Type`
  case object Cancelled extends `Type`
  case object Failed extends `Type`
  case object Incomplete extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Completed" => Some(Completed)
      case "Cancelled" => Some(Cancelled)
      case "Failed" => Some(Failed)
      case "Incomplete" => Some(Incomplete)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Completed => "Completed"
      case Cancelled => "Cancelled"
      case Failed => "Failed"
      case Incomplete => "Incomplete"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")
  sealed trait Reason
  case object TurnDetected extends Reason
  case object ClientCancelled extends Reason
  case object MaxOutputTokens extends Reason
  case object ContentFilter extends Reason

  object Reason {
    def toReason(s: String): Option[Reason] = s match {
      case "TurnDetected" => Some(TurnDetected)
      case "ClientCancelled" => Some(ClientCancelled)
      case "MaxOutputTokens" => Some(MaxOutputTokens)
      case "ContentFilter" => Some(ContentFilter)
      case _ => None
    }

    def fromReason(x: Reason): String = x match {
      case TurnDetected => "TurnDetected"
      case ClientCancelled => "ClientCancelled"
      case MaxOutputTokens => "MaxOutputTokens"
      case ContentFilter => "ContentFilter"
    }
  }

  implicit val ReasonEnumEncoder: EncodeJson[Reason] =
    EncodeJson[Reason](is => StringEncodeJson(Reason.fromReason(is)))

  implicit val ReasonEnumDecoder: DecodeJson[Reason] =
    DecodeJson.optionDecoder[Reason](n => n.string.flatMap(jStr => Reason.toReason(jStr)), "Reason failed to de-serialize")

  implicit val RealtimeResponseStatusDetailsCodecJson: CodecJson[RealtimeResponseStatusDetails] = CodecJson.derive[RealtimeResponseStatusDetails]
  implicit val RealtimeResponseStatusDetailsDecoder: EntityDecoder[RealtimeResponseStatusDetails] = jsonOf[RealtimeResponseStatusDetails]
  implicit val RealtimeResponseStatusDetailsEncoder: EntityEncoder[RealtimeResponseStatusDetails] = jsonEncoderOf[RealtimeResponseStatusDetails]
}
