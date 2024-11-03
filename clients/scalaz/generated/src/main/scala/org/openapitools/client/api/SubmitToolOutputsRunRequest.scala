package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SubmitToolOutputsRunRequest._

case class SubmitToolOutputsRunRequest (
  /* A list of tools for which the outputs are being submitted. */
  toolOutputs: List[SubmitToolOutputsRunRequestToolOutputsInner],
/* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
  stream: Option[Boolean])

object SubmitToolOutputsRunRequest {
  import DateTimeCodecs._

  implicit val SubmitToolOutputsRunRequestCodecJson: CodecJson[SubmitToolOutputsRunRequest] = CodecJson.derive[SubmitToolOutputsRunRequest]
  implicit val SubmitToolOutputsRunRequestDecoder: EntityDecoder[SubmitToolOutputsRunRequest] = jsonOf[SubmitToolOutputsRunRequest]
  implicit val SubmitToolOutputsRunRequestEncoder: EntityEncoder[SubmitToolOutputsRunRequest] = jsonEncoderOf[SubmitToolOutputsRunRequest]
}
