package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

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
case class CreateModerationResponseResultsInnerCategories(hate: Boolean,
                hateSlashthreatening: Boolean,
                selfMinusharm: Boolean,
                sexual: Boolean,
                sexualSlashminors: Boolean,
                violence: Boolean,
                violenceSlashgraphic: Boolean
                )

object CreateModerationResponseResultsInnerCategories {
    /**
     * Creates the codec for converting CreateModerationResponseResultsInnerCategories from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationResponseResultsInnerCategories] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationResponseResultsInnerCategories] = deriveEncoder
}
