package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsCodeOutputImageObject._

case class RunStepDetailsToolCallsCodeOutputImageObject (
  /* Always `image`. */
  `type`: `Type`,
image: RunStepDetailsToolCallsCodeOutputImageObjectImage)

object RunStepDetailsToolCallsCodeOutputImageObject {
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

  implicit val RunStepDetailsToolCallsCodeOutputImageObjectCodecJson: CodecJson[RunStepDetailsToolCallsCodeOutputImageObject] = CodecJson.derive[RunStepDetailsToolCallsCodeOutputImageObject]
  implicit val RunStepDetailsToolCallsCodeOutputImageObjectDecoder: EntityDecoder[RunStepDetailsToolCallsCodeOutputImageObject] = jsonOf[RunStepDetailsToolCallsCodeOutputImageObject]
  implicit val RunStepDetailsToolCallsCodeOutputImageObjectEncoder: EntityEncoder[RunStepDetailsToolCallsCodeOutputImageObject] = jsonEncoderOf[RunStepDetailsToolCallsCodeOutputImageObject]
}
