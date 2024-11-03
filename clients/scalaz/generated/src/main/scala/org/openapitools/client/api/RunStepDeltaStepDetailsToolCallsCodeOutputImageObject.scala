package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeOutputImageObject._

case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject (
  /* The index of the output in the outputs array. */
  index: Integer,
/* Always `image`. */
  `type`: `Type`,
image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage])

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Image extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Image" => Some(Image)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Image => "Image"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject]
}
