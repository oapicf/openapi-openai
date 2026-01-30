package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
 */
case class CreateFineTuningJobRequestModel()

object CreateFineTuningJobRequestModel {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestModel] = deriveEncoder
}
