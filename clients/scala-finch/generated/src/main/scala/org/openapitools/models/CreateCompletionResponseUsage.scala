package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param promptUnderscoretokens 
 * @param completionUnderscoretokens 
 * @param totalUnderscoretokens 
 */
case class CreateCompletionResponseUsage(promptUnderscoretokens: Int,
                completionUnderscoretokens: Int,
                totalUnderscoretokens: Int
                )

object CreateCompletionResponseUsage {
    /**
     * Creates the codec for converting CreateCompletionResponseUsage from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponseUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponseUsage] = deriveEncoder
}
