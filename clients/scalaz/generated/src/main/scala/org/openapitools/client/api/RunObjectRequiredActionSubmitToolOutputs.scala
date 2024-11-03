package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunObjectRequiredActionSubmitToolOutputs._

case class RunObjectRequiredActionSubmitToolOutputs (
  /* A list of the relevant tool calls. */
  toolCalls: List[RunToolCallObject])

object RunObjectRequiredActionSubmitToolOutputs {
  import DateTimeCodecs._

  implicit val RunObjectRequiredActionSubmitToolOutputsCodecJson: CodecJson[RunObjectRequiredActionSubmitToolOutputs] = CodecJson.derive[RunObjectRequiredActionSubmitToolOutputs]
  implicit val RunObjectRequiredActionSubmitToolOutputsDecoder: EntityDecoder[RunObjectRequiredActionSubmitToolOutputs] = jsonOf[RunObjectRequiredActionSubmitToolOutputs]
  implicit val RunObjectRequiredActionSubmitToolOutputsEncoder: EntityEncoder[RunObjectRequiredActionSubmitToolOutputs] = jsonEncoderOf[RunObjectRequiredActionSubmitToolOutputs]
}
