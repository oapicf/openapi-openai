package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsFileSearchRankingOptionsObject
import org.openapitools.models.RunStepDetailsToolCallsFileSearchResultObject
import scala.collection.immutable.Seq

/**
 * For now, this is always going to be an empty object.
 * @param rankingUnderscoreoptions 
 * @param results The results of the file search.
 */
case class RunStepDetailsToolCallsFileSearchObjectFileSearch(rankingUnderscoreoptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
                results: Option[Seq[RunStepDetailsToolCallsFileSearchResultObject]]
                )

object RunStepDetailsToolCallsFileSearchObjectFileSearch {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFileSearchObjectFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = deriveEncoder
}
