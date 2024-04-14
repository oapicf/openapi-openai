package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunObjectIncompleteDetails._

case class RunObjectIncompleteDetails (
  /* The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. */
  reason: Option[Reason])

object RunObjectIncompleteDetails {
  import DateTimeCodecs._
  sealed trait Reason
  case object MaxCompletionTokens extends Reason
  case object MaxPromptTokens extends Reason

  object Reason {
    def toReason(s: String): Option[Reason] = s match {
      case "MaxCompletionTokens" => Some(MaxCompletionTokens)
      case "MaxPromptTokens" => Some(MaxPromptTokens)
      case _ => None
    }

    def fromReason(x: Reason): String = x match {
      case MaxCompletionTokens => "MaxCompletionTokens"
      case MaxPromptTokens => "MaxPromptTokens"
    }
  }

  implicit val ReasonEnumEncoder: EncodeJson[Reason] =
    EncodeJson[Reason](is => StringEncodeJson(Reason.fromReason(is)))

  implicit val ReasonEnumDecoder: DecodeJson[Reason] =
    DecodeJson.optionDecoder[Reason](n => n.string.flatMap(jStr => Reason.toReason(jStr)), "Reason failed to de-serialize")

  implicit val RunObjectIncompleteDetailsCodecJson: CodecJson[RunObjectIncompleteDetails] = CodecJson.derive[RunObjectIncompleteDetails]
  implicit val RunObjectIncompleteDetailsDecoder: EntityDecoder[RunObjectIncompleteDetails] = jsonOf[RunObjectIncompleteDetails]
  implicit val RunObjectIncompleteDetailsEncoder: EntityEncoder[RunObjectIncompleteDetails] = jsonEncoderOf[RunObjectIncompleteDetails]
}
