package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionStreamOptions._

case class ChatCompletionStreamOptions (
  /* If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value.  */
  includeUsage: Option[Boolean])

object ChatCompletionStreamOptions {
  import DateTimeCodecs._

  implicit val ChatCompletionStreamOptionsCodecJson: CodecJson[ChatCompletionStreamOptions] = CodecJson.derive[ChatCompletionStreamOptions]
  implicit val ChatCompletionStreamOptionsDecoder: EntityDecoder[ChatCompletionStreamOptions] = jsonOf[ChatCompletionStreamOptions]
  implicit val ChatCompletionStreamOptionsEncoder: EntityEncoder[ChatCompletionStreamOptions] = jsonEncoderOf[ChatCompletionStreamOptions]
}
