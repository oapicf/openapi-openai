package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * A list of the categories along with the input type(s) that the score applies to.
 * @param hate The applied input type(s) for the category 'hate'.
 * @param hateSlashthreatening The applied input type(s) for the category 'hate/threatening'.
 * @param harassment The applied input type(s) for the category 'harassment'.
 * @param harassmentSlashthreatening The applied input type(s) for the category 'harassment/threatening'.
 * @param illicit The applied input type(s) for the category 'illicit'.
 * @param illicitSlashviolent The applied input type(s) for the category 'illicit/violent'.
 * @param selfMinusharm The applied input type(s) for the category 'self-harm'.
 * @param selfMinusharmSlashintent The applied input type(s) for the category 'self-harm/intent'.
 * @param selfMinusharmSlashinstructions The applied input type(s) for the category 'self-harm/instructions'.
 * @param sexual The applied input type(s) for the category 'sexual'.
 * @param sexualSlashminors The applied input type(s) for the category 'sexual/minors'.
 * @param violence The applied input type(s) for the category 'violence'.
 * @param violenceSlashgraphic The applied input type(s) for the category 'violence/graphic'.
 */
case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(hate: Seq[String],
                hateSlashthreatening: Seq[String],
                harassment: Seq[String],
                harassmentSlashthreatening: Seq[String],
                illicit: Seq[String],
                illicitSlashviolent: Seq[String],
                selfMinusharm: Seq[String],
                selfMinusharmSlashintent: Seq[String],
                selfMinusharmSlashinstructions: Seq[String],
                sexual: Seq[String],
                sexualSlashminors: Seq[String],
                violence: Seq[String],
                violenceSlashgraphic: Seq[String]
                )

object CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
    /**
     * Creates the codec for converting CreateModerationResponseResultsInnerCategoryAppliedInputTypes from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = deriveEncoder
}
