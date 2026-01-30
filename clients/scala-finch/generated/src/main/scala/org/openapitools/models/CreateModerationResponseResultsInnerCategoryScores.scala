package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * A list of the categories along with their scores as predicted by model.
 * @param hate The score for the category 'hate'.
 * @param hateSlashthreatening The score for the category 'hate/threatening'.
 * @param harassment The score for the category 'harassment'.
 * @param harassmentSlashthreatening The score for the category 'harassment/threatening'.
 * @param illicit The score for the category 'illicit'.
 * @param illicitSlashviolent The score for the category 'illicit/violent'.
 * @param selfMinusharm The score for the category 'self-harm'.
 * @param selfMinusharmSlashintent The score for the category 'self-harm/intent'.
 * @param selfMinusharmSlashinstructions The score for the category 'self-harm/instructions'.
 * @param sexual The score for the category 'sexual'.
 * @param sexualSlashminors The score for the category 'sexual/minors'.
 * @param violence The score for the category 'violence'.
 * @param violenceSlashgraphic The score for the category 'violence/graphic'.
 */
case class CreateModerationResponseResultsInnerCategoryScores(hate: BigDecimal,
                hateSlashthreatening: BigDecimal,
                harassment: BigDecimal,
                harassmentSlashthreatening: BigDecimal,
                illicit: BigDecimal,
                illicitSlashviolent: BigDecimal,
                selfMinusharm: BigDecimal,
                selfMinusharmSlashintent: BigDecimal,
                selfMinusharmSlashinstructions: BigDecimal,
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
