package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker.
 * @param scoreUnderscorethreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
 */
case class FileSearchRankingOptions(ranker: Option[String],
                scoreUnderscorethreshold: BigDecimal
                )

object FileSearchRankingOptions {
    /**
     * Creates the codec for converting FileSearchRankingOptions from and to JSON.
     */
    implicit val decoder: Decoder[FileSearchRankingOptions] = deriveDecoder
    implicit val encoder: ObjectEncoder[FileSearchRankingOptions] = deriveEncoder
}
