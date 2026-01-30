package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CompletionUsageCompletionTokensDetails
import org.openapitools.models.CompletionUsagePromptTokensDetails

/**
 * Usage statistics for the completion request.
 * @param completionUnderscoretokens Number of tokens in the generated completion.
 * @param promptUnderscoretokens Number of tokens in the prompt.
 * @param totalUnderscoretokens Total number of tokens used in the request (prompt + completion).
 * @param completionUnderscoretokensUnderscoredetails 
 * @param promptUnderscoretokensUnderscoredetails 
 */
case class CompletionUsage(completionUnderscoretokens: Int,
                promptUnderscoretokens: Int,
                totalUnderscoretokens: Int,
                completionUnderscoretokensUnderscoredetails: Option[CompletionUsageCompletionTokensDetails],
                promptUnderscoretokensUnderscoredetails: Option[CompletionUsagePromptTokensDetails]
                )

object CompletionUsage {
    /**
     * Creates the codec for converting CompletionUsage from and to JSON.
     */
    implicit val decoder: Decoder[CompletionUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CompletionUsage] = deriveEncoder
}
