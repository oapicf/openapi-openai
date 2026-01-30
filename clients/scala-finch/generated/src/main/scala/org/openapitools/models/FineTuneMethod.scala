package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneDPOMethod
import org.openapitools.models.FineTuneSupervisedMethod

/**
 * The method used for fine-tuning.
 * @param _type The type of method. Is either `supervised` or `dpo`.
 * @param supervised 
 * @param dpo 
 */
case class FineTuneMethod(_type: Option[String],
                supervised: Option[FineTuneSupervisedMethod],
                dpo: Option[FineTuneDPOMethod]
                )

object FineTuneMethod {
    /**
     * Creates the codec for converting FineTuneMethod from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneMethod] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneMethod] = deriveEncoder
}
