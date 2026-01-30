package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents a project rate limit config.
 * @param _object The object type, which is always `project.rate_limit`
 * @param id The identifier, which can be referenced in API endpoints.
 * @param model The model this rate limit applies to.
 * @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute The maximum requests per minute.
 * @param maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute The maximum tokens per minute.
 * @param maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute The maximum images per minute. Only present for relevant models.
 * @param maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute The maximum audio megabytes per minute. Only present for relevant models.
 * @param maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday The maximum requests per day. Only present for relevant models.
 * @param batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens The maximum batch input tokens per day. Only present for relevant models.
 */
case class ProjectRateLimit(_object: String,
                id: String,
                model: String,
                maxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute: Int,
                maxUnderscoretokensUnderscoreperUnderscore1Underscoreminute: Int,
                maxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute: Option[Int],
                maxUnderscorerequestsUnderscoreperUnderscore1Underscoreday: Option[Int],
                batchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens: Option[Int]
                )

object ProjectRateLimit {
    /**
     * Creates the codec for converting ProjectRateLimit from and to JSON.
     */
    implicit val decoder: Decoder[ProjectRateLimit] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectRateLimit] = deriveEncoder
}
