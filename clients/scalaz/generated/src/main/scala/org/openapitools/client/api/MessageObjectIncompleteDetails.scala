package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageObjectIncompleteDetails._

case class MessageObjectIncompleteDetails (
  /* The reason the message is incomplete. */
  reason: Reason)

object MessageObjectIncompleteDetails {
  import DateTimeCodecs._
  sealed trait Reason
  case object ContentFilter extends Reason
  case object MaxTokens extends Reason
  case object RunCancelled extends Reason
  case object RunExpired extends Reason
  case object RunFailed extends Reason

  object Reason {
    def toReason(s: String): Option[Reason] = s match {
      case "ContentFilter" => Some(ContentFilter)
      case "MaxTokens" => Some(MaxTokens)
      case "RunCancelled" => Some(RunCancelled)
      case "RunExpired" => Some(RunExpired)
      case "RunFailed" => Some(RunFailed)
      case _ => None
    }

    def fromReason(x: Reason): String = x match {
      case ContentFilter => "ContentFilter"
      case MaxTokens => "MaxTokens"
      case RunCancelled => "RunCancelled"
      case RunExpired => "RunExpired"
      case RunFailed => "RunFailed"
    }
  }

  implicit val ReasonEnumEncoder: EncodeJson[Reason] =
    EncodeJson[Reason](is => StringEncodeJson(Reason.fromReason(is)))

  implicit val ReasonEnumDecoder: DecodeJson[Reason] =
    DecodeJson.optionDecoder[Reason](n => n.string.flatMap(jStr => Reason.toReason(jStr)), "Reason failed to de-serialize")

  implicit val MessageObjectIncompleteDetailsCodecJson: CodecJson[MessageObjectIncompleteDetails] = CodecJson.derive[MessageObjectIncompleteDetails]
  implicit val MessageObjectIncompleteDetailsDecoder: EntityDecoder[MessageObjectIncompleteDetails] = jsonOf[MessageObjectIncompleteDetails]
  implicit val MessageObjectIncompleteDetailsEncoder: EntityEncoder[MessageObjectIncompleteDetails] = jsonEncoderOf[MessageObjectIncompleteDetails]
}
