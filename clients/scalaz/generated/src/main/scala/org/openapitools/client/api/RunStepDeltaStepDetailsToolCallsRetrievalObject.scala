package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsRetrievalObject._

case class RunStepDeltaStepDetailsToolCallsRetrievalObject (
  /* The index of the tool call in the tool calls array. */
  index: Integer,
/* The ID of the tool call object. */
  id: Option[String],
/* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
  `type`: `Type`,
/* For now, this is always going to be an empty object. */
  retrieval: Option[Any])

object RunStepDeltaStepDetailsToolCallsRetrievalObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Retrieval extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Retrieval" => Some(Retrieval)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Retrieval => "Retrieval"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsRetrievalObjectCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsRetrievalObject] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsRetrievalObject]
  implicit val RunStepDeltaStepDetailsToolCallsRetrievalObjectDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsRetrievalObject] = jsonOf[RunStepDeltaStepDetailsToolCallsRetrievalObject]
  implicit val RunStepDeltaStepDetailsToolCallsRetrievalObjectEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsRetrievalObject] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsRetrievalObject]
}
