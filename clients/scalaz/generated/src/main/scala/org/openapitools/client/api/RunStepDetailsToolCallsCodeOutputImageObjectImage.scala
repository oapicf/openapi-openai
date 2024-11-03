package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsCodeOutputImageObjectImage._

case class RunStepDetailsToolCallsCodeOutputImageObjectImage (
  /* The [file](/docs/api-reference/files) ID of the image. */
  fileId: String)

object RunStepDetailsToolCallsCodeOutputImageObjectImage {
  import DateTimeCodecs._

  implicit val RunStepDetailsToolCallsCodeOutputImageObjectImageCodecJson: CodecJson[RunStepDetailsToolCallsCodeOutputImageObjectImage] = CodecJson.derive[RunStepDetailsToolCallsCodeOutputImageObjectImage]
  implicit val RunStepDetailsToolCallsCodeOutputImageObjectImageDecoder: EntityDecoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = jsonOf[RunStepDetailsToolCallsCodeOutputImageObjectImage]
  implicit val RunStepDetailsToolCallsCodeOutputImageObjectImageEncoder: EntityEncoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = jsonEncoderOf[RunStepDetailsToolCallsCodeOutputImageObjectImage]
}
