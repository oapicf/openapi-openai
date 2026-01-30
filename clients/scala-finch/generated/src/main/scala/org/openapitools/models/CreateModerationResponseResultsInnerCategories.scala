package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A list of the categories, and whether they are flagged or not.
 * @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
 * @param hateSlashthreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
 * @param harassment Content that expresses, incites, or promotes harassing language towards any target.
 * @param harassmentSlashthreatening Harassment content that also includes violence or serious harm towards any target.
 * @param illicit Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
 * @param illicitSlashviolent Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
 * @param selfMinusharm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
 * @param selfMinusharmSlashintent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
 * @param selfMinusharmSlashinstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
 * @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
 * @param sexualSlashminors Sexual content that includes an individual who is under 18 years old.
 * @param violence Content that depicts death, violence, or physical injury.
 * @param violenceSlashgraphic Content that depicts death, violence, or physical injury in graphic detail.
 */
case class CreateModerationResponseResultsInnerCategories(hate: Boolean,
                hateSlashthreatening: Boolean,
                harassment: Boolean,
                harassmentSlashthreatening: Boolean,
                illicit: Boolean,
                illicitSlashviolent: Boolean,
                selfMinusharm: Boolean,
                selfMinusharmSlashintent: Boolean,
                selfMinusharmSlashinstructions: Boolean,
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
