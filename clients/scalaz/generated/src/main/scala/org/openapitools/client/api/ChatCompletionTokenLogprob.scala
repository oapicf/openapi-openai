package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionTokenLogprob._

case class ChatCompletionTokenLogprob (
  /* The token. */
  token: String,
/* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */
  logprob: BigDecimal,
/* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */
  bytes: List[Integer],
/* List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. */
  topLogprobs: List[ChatCompletionTokenLogprobTopLogprobsInner])

object ChatCompletionTokenLogprob {
  import DateTimeCodecs._

  implicit val ChatCompletionTokenLogprobCodecJson: CodecJson[ChatCompletionTokenLogprob] = CodecJson.derive[ChatCompletionTokenLogprob]
  implicit val ChatCompletionTokenLogprobDecoder: EntityDecoder[ChatCompletionTokenLogprob] = jsonOf[ChatCompletionTokenLogprob]
  implicit val ChatCompletionTokenLogprobEncoder: EntityEncoder[ChatCompletionTokenLogprob] = jsonEncoderOf[ChatCompletionTokenLogprob]
}
