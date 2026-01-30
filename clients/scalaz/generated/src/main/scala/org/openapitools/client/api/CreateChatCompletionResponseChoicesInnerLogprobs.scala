package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionResponseChoicesInnerLogprobs._

case class CreateChatCompletionResponseChoicesInnerLogprobs (
  /* A list of message content tokens with log probability information. */
  content: List[ChatCompletionTokenLogprob],
/* A list of message refusal tokens with log probability information. */
  refusal: List[ChatCompletionTokenLogprob])

object CreateChatCompletionResponseChoicesInnerLogprobs {
  import DateTimeCodecs._

  implicit val CreateChatCompletionResponseChoicesInnerLogprobsCodecJson: CodecJson[CreateChatCompletionResponseChoicesInnerLogprobs] = CodecJson.derive[CreateChatCompletionResponseChoicesInnerLogprobs]
  implicit val CreateChatCompletionResponseChoicesInnerLogprobsDecoder: EntityDecoder[CreateChatCompletionResponseChoicesInnerLogprobs] = jsonOf[CreateChatCompletionResponseChoicesInnerLogprobs]
  implicit val CreateChatCompletionResponseChoicesInnerLogprobsEncoder: EntityEncoder[CreateChatCompletionResponseChoicesInnerLogprobs] = jsonEncoderOf[CreateChatCompletionResponseChoicesInnerLogprobs]
}
