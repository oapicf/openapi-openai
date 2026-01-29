package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponseChoicesInnerLogprobs._

case class CreateCompletionResponseChoicesInnerLogprobs (
  textOffset: Option[List[Integer]],
tokenLogprobs: Option[List[BigDecimal]],
tokens: Option[List[String]],
topLogprobs: Option[List[Map[String, BigDecimal]]])

object CreateCompletionResponseChoicesInnerLogprobs {
  import DateTimeCodecs._

  implicit val CreateCompletionResponseChoicesInnerLogprobsCodecJson: CodecJson[CreateCompletionResponseChoicesInnerLogprobs] = CodecJson.derive[CreateCompletionResponseChoicesInnerLogprobs]
  implicit val CreateCompletionResponseChoicesInnerLogprobsDecoder: EntityDecoder[CreateCompletionResponseChoicesInnerLogprobs] = jsonOf[CreateCompletionResponseChoicesInnerLogprobs]
  implicit val CreateCompletionResponseChoicesInnerLogprobsEncoder: EntityEncoder[CreateCompletionResponseChoicesInnerLogprobs] = jsonEncoderOf[CreateCompletionResponseChoicesInnerLogprobs]
}
