package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The ranking options for the file search.
 * @param ranker The ranker used for the file search.
 * @param scoreUnderscorethreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
 */
case class RunStepDetailsToolCallsFileSearchRankingOptionsObject(ranker: String,
                scoreUnderscorethreshold: BigDecimal
                )

object RunStepDetailsToolCallsFileSearchRankingOptionsObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFileSearchRankingOptionsObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = deriveEncoder
}
