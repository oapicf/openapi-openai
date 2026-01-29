package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */
case class CreateFineTuningJobRequestHyperparametersBatchSize()

object CreateFineTuningJobRequestHyperparametersBatchSize {
    /**
     * Creates the codec for converting CreateFineTuningJobRequestHyperparametersBatchSize from and to JSON.
     */
    implicit val decoder: Decoder[CreateFineTuningJobRequestHyperparametersBatchSize] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateFineTuningJobRequestHyperparametersBatchSize] = deriveEncoder
}
