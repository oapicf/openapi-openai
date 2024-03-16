package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param hate 
 * @param hateSlashthreatening 
 * @param selfMinusharm 
 * @param sexual 
 * @param sexualSlashminors 
 * @param violence 
 * @param violenceSlashgraphic 
 */
case class CreateModerationResponseResultsInnerCategoryScores(hate: BigDecimal,
                hateSlashthreatening: BigDecimal,
                selfMinusharm: BigDecimal,
                sexual: BigDecimal,
                sexualSlashminors: BigDecimal,
                violence: BigDecimal,
                violenceSlashgraphic: BigDecimal
                )

object CreateModerationResponseResultsInnerCategoryScores {
    /**
     * Creates the codec for converting CreateModerationResponseResultsInnerCategoryScores from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationResponseResultsInnerCategoryScores] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationResponseResultsInnerCategoryScores] = deriveEncoder
}
