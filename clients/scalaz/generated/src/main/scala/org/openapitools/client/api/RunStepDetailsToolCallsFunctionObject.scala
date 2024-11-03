package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFunctionObject._

case class RunStepDetailsToolCallsFunctionObject (
  /* The ID of the tool call object. */
  id: String,
/* The type of tool call. This is always going to be `function` for this type of tool call. */
  `type`: `Type`,
function: RunStepDetailsToolCallsFunctionObjectFunction)

object RunStepDetailsToolCallsFunctionObject {
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

  implicit val RunStepDetailsToolCallsFunctionObjectCodecJson: CodecJson[RunStepDetailsToolCallsFunctionObject] = CodecJson.derive[RunStepDetailsToolCallsFunctionObject]
  implicit val RunStepDetailsToolCallsFunctionObjectDecoder: EntityDecoder[RunStepDetailsToolCallsFunctionObject] = jsonOf[RunStepDetailsToolCallsFunctionObject]
  implicit val RunStepDetailsToolCallsFunctionObjectEncoder: EntityEncoder[RunStepDetailsToolCallsFunctionObject] = jsonEncoderOf[RunStepDetailsToolCallsFunctionObject]
}
