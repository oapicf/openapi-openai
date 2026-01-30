package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute The maximum requests per minute.
 * @param maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute The maximum tokens per minute.
 * @param maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute The maximum images per minute. Only relevant for certain models.
 * @param maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute The maximum audio megabytes per minute. Only relevant for certain models.
 * @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday The maximum requests per day. Only relevant for certain models.
 * @param batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens The maximum batch input tokens per day. Only relevant for certain models.
 */
case class ProjectRateLimitUpdateRequest(maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday: Option[Int],
                batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens: Option[Int]
                )

object ProjectRateLimitUpdateRequest {
    /**
     * Creates the codec for converting ProjectRateLimitUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProjectRateLimitUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectRateLimitUpdateRequest] = deriveEncoder
}
