package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationResponseResultsInnerCategories
import org.openapitools.models.CreateModerationResponseResultsInnerCategoryScores

/**
 * 
 * @param flagged Whether any of the below categories are flagged.
 * @param categories 
 * @param categoryUnderscorescores 
 */
case class CreateModerationResponseResultsInner(flagged: Boolean,
                categories: CreateModerationResponseResultsInnerCategories,
                categoryUnderscorescores: CreateModerationResponseResultsInnerCategoryScores
                )

object CreateModerationResponseResultsInner {
    /**
     * Creates the codec for converting CreateModerationResponseResultsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationResponseResultsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationResponseResultsInner] = deriveEncoder
}
