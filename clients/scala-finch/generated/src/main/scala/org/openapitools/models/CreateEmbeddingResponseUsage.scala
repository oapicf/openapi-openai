package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The usage information for the request.
 * @param promptUnderscoretokens The number of tokens used by the prompt.
 * @param totalUnderscoretokens The total number of tokens used by the request.
 */
case class CreateEmbeddingResponseUsage(promptUnderscoretokens: Int,
                totalUnderscoretokens: Int
                )

object CreateEmbeddingResponseUsage {
    /**
     * Creates the codec for converting CreateEmbeddingResponseUsage from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingResponseUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingResponseUsage] = deriveEncoder
}
