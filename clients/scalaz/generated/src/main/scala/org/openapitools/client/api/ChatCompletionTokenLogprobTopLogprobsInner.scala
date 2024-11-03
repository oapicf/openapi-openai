package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionTokenLogprobTopLogprobsInner._

case class ChatCompletionTokenLogprobTopLogprobsInner (
  /* The token. */
  token: String,
/* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */
  logprob: BigDecimal,
/* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */
  bytes: List[Integer])

object ChatCompletionTokenLogprobTopLogprobsInner {
  import DateTimeCodecs._

  implicit val ChatCompletionTokenLogprobTopLogprobsInnerCodecJson: CodecJson[ChatCompletionTokenLogprobTopLogprobsInner] = CodecJson.derive[ChatCompletionTokenLogprobTopLogprobsInner]
  implicit val ChatCompletionTokenLogprobTopLogprobsInnerDecoder: EntityDecoder[ChatCompletionTokenLogprobTopLogprobsInner] = jsonOf[ChatCompletionTokenLogprobTopLogprobsInner]
  implicit val ChatCompletionTokenLogprobTopLogprobsInnerEncoder: EntityEncoder[ChatCompletionTokenLogprobTopLogprobsInner] = jsonEncoderOf[ChatCompletionTokenLogprobTopLogprobsInner]
}
