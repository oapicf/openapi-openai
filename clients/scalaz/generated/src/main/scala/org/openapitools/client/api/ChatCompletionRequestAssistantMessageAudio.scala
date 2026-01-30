package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestAssistantMessageAudio._

case class ChatCompletionRequestAssistantMessageAudio (
  /* Unique identifier for a previous audio response from the model.  */
  id: String)

object ChatCompletionRequestAssistantMessageAudio {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestAssistantMessageAudioCodecJson: CodecJson[ChatCompletionRequestAssistantMessageAudio] = CodecJson.derive[ChatCompletionRequestAssistantMessageAudio]
  implicit val ChatCompletionRequestAssistantMessageAudioDecoder: EntityDecoder[ChatCompletionRequestAssistantMessageAudio] = jsonOf[ChatCompletionRequestAssistantMessageAudio]
  implicit val ChatCompletionRequestAssistantMessageAudioEncoder: EntityEncoder[ChatCompletionRequestAssistantMessageAudio] = jsonEncoderOf[ChatCompletionRequestAssistantMessageAudio]
}
