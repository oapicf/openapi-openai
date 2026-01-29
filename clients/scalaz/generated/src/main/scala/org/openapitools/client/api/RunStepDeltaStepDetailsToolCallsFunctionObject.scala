package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsFunctionObject._

case class RunStepDeltaStepDetailsToolCallsFunctionObject (
  /* The index of the tool call in the tool calls array. */
  index: Integer,
/* The ID of the tool call object. */
  id: Option[String],
/* The type of tool call. This is always going to be `function` for this type of tool call. */
  `type`: `Type`,
function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction])

object RunStepDeltaStepDetailsToolCallsFunctionObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsFunctionObject] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsFunctionObject]
  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = jsonOf[RunStepDeltaStepDetailsToolCallsFunctionObject]
  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsFunctionObject]
}
