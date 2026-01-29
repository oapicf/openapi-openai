package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage._

case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage (
  /* The [file](/docs/api-reference/files) ID of the image. */
  fileId: Option[String])

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
  import DateTimeCodecs._

  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
}
