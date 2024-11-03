package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SubmitToolOutputsRunRequestToolOutputsInner._

case class SubmitToolOutputsRunRequestToolOutputsInner (
  /* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. */
  toolCallId: Option[String],
/* The output of the tool call to be submitted to continue the run. */
  output: Option[String])

object SubmitToolOutputsRunRequestToolOutputsInner {
  import DateTimeCodecs._

  implicit val SubmitToolOutputsRunRequestToolOutputsInnerCodecJson: CodecJson[SubmitToolOutputsRunRequestToolOutputsInner] = CodecJson.derive[SubmitToolOutputsRunRequestToolOutputsInner]
  implicit val SubmitToolOutputsRunRequestToolOutputsInnerDecoder: EntityDecoder[SubmitToolOutputsRunRequestToolOutputsInner] = jsonOf[SubmitToolOutputsRunRequestToolOutputsInner]
  implicit val SubmitToolOutputsRunRequestToolOutputsInnerEncoder: EntityEncoder[SubmitToolOutputsRunRequestToolOutputsInner] = jsonEncoderOf[SubmitToolOutputsRunRequestToolOutputsInner]
}
