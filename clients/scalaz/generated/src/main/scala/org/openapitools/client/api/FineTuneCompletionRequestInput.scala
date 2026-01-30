package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneCompletionRequestInput._

case class FineTuneCompletionRequestInput (
  /* The input prompt for this training example. */
  prompt: Option[String],
/* The desired completion for this training example. */
  completion: Option[String])

object FineTuneCompletionRequestInput {
  import DateTimeCodecs._

  implicit val FineTuneCompletionRequestInputCodecJson: CodecJson[FineTuneCompletionRequestInput] = CodecJson.derive[FineTuneCompletionRequestInput]
  implicit val FineTuneCompletionRequestInputDecoder: EntityDecoder[FineTuneCompletionRequestInput] = jsonOf[FineTuneCompletionRequestInput]
  implicit val FineTuneCompletionRequestInputEncoder: EntityEncoder[FineTuneCompletionRequestInput] = jsonEncoderOf[FineTuneCompletionRequestInput]
}
