package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTunePreferenceRequestInput._

case class FineTunePreferenceRequestInput (
  input: Option[FineTunePreferenceRequestInputInput],
/* The preferred completion message for the output. */
  preferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]],
/* The non-preferred completion message for the output. */
  nonPreferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]])

object FineTunePreferenceRequestInput {
  import DateTimeCodecs._

  implicit val FineTunePreferenceRequestInputCodecJson: CodecJson[FineTunePreferenceRequestInput] = CodecJson.derive[FineTunePreferenceRequestInput]
  implicit val FineTunePreferenceRequestInputDecoder: EntityDecoder[FineTunePreferenceRequestInput] = jsonOf[FineTunePreferenceRequestInput]
  implicit val FineTunePreferenceRequestInputEncoder: EntityEncoder[FineTunePreferenceRequestInput] = jsonEncoderOf[FineTunePreferenceRequestInput]
}
