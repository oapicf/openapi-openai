package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
 */
case class CreateFineTuneRequestModel()

object CreateFineTuneRequestModel {
    /**
     * Creates the codec for converting CreateFineTuneRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuneRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuneRequestModel] = deriveEncoder
}
