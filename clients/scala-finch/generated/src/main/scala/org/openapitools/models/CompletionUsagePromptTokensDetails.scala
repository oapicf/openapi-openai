package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Breakdown of tokens used in the prompt.
 * @param audioUnderscoretokens Audio input tokens present in the prompt.
 * @param cachedUnderscoretokens Cached tokens present in the prompt.
 */
case class CompletionUsagePromptTokensDetails(audioUnderscoretokens: Option[Int],
                cachedUnderscoretokens: Option[Int]
                )

object CompletionUsagePromptTokensDetails {
    /**
     * Creates the codec for converting CompletionUsagePromptTokensDetails from and to JSON.
     */
    implicit val decoder: Decoder[CompletionUsagePromptTokensDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[CompletionUsagePromptTokensDetails] = deriveEncoder
}
