package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponseChoicesInnerLogprobs._

case class CreateCompletionResponseChoicesInnerLogprobs (
  tokens: Option[List[String]],
tokenLogprobs: Option[List[BigDecimal]],
topLogprobs: Option[List[Any]],
textOffset: Option[List[Integer]])

object CreateCompletionResponseChoicesInnerLogprobs {
  import DateTimeCodecs._

  implicit val CreateCompletionResponseChoicesInnerLogprobsCodecJson: CodecJson[CreateCompletionResponseChoicesInnerLogprobs] = CodecJson.derive[CreateCompletionResponseChoicesInnerLogprobs]
  implicit val CreateCompletionResponseChoicesInnerLogprobsDecoder: EntityDecoder[CreateCompletionResponseChoicesInnerLogprobs] = jsonOf[CreateCompletionResponseChoicesInnerLogprobs]
  implicit val CreateCompletionResponseChoicesInnerLogprobsEncoder: EntityEncoder[CreateCompletionResponseChoicesInnerLogprobs] = jsonEncoderOf[CreateCompletionResponseChoicesInnerLogprobs]
}
