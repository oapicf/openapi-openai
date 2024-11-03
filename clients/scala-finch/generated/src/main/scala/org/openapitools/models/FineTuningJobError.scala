package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 * @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
 */
case class FineTuningJobError(code: String,
                message: String,
                param: String
                )

object FineTuningJobError {
    /**
     * Creates the codec for converting FineTuningJobError from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJobError] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJobError] = deriveEncoder
}
