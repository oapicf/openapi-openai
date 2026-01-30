package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CompletionUsagePromptTokensDetails._

case class CompletionUsagePromptTokensDetails (
  /* Audio input tokens present in the prompt. */
  audioTokens: Option[Integer],
/* Cached tokens present in the prompt. */
  cachedTokens: Option[Integer])

object CompletionUsagePromptTokensDetails {
  import DateTimeCodecs._

  implicit val CompletionUsagePromptTokensDetailsCodecJson: CodecJson[CompletionUsagePromptTokensDetails] = CodecJson.derive[CompletionUsagePromptTokensDetails]
  implicit val CompletionUsagePromptTokensDetailsDecoder: EntityDecoder[CompletionUsagePromptTokensDetails] = jsonOf[CompletionUsagePromptTokensDetails]
  implicit val CompletionUsagePromptTokensDetailsEncoder: EntityEncoder[CompletionUsagePromptTokensDetails] = jsonEncoderOf[CompletionUsagePromptTokensDetails]
}
