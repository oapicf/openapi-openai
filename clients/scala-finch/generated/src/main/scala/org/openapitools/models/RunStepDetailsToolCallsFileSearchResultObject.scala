package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.RunStepDetailsToolCallsFileSearchResultObjectContentInner
import scala.collection.immutable.Seq

/**
 * A result instance of the file search.
 * @param fileUnderscoreid The ID of the file that result was found in.
 * @param fileUnderscorename The name of the file that result was found in.
 * @param score The score of the result. All values must be a floating point number between 0 and 1.
 * @param content The content of the result that was found. The content is only included if requested via the include query parameter.
 */
case class RunStepDetailsToolCallsFileSearchResultObject(fileUnderscoreid: String,
                fileUnderscorename: String,
                score: BigDecimal,
                content: Option[Seq[RunStepDetailsToolCallsFileSearchResultObjectContentInner]]
                )

object RunStepDetailsToolCallsFileSearchResultObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFileSearchResultObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFileSearchResultObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFileSearchResultObject] = deriveEncoder
}
