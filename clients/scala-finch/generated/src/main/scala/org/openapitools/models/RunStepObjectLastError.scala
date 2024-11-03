package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The last error associated with this run step. Will be `null` if there are no errors.
 * @param code One of `server_error` or `rate_limit_exceeded`.
 * @param message A human-readable description of the error.
 */
case class RunStepObjectLastError(code: String,
                message: String
                )

object RunStepObjectLastError {
    /**
     * Creates the codec for converting RunStepObjectLastError from and to JSON.
     */
    implicit val decoder: Decoder[RunStepObjectLastError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepObjectLastError] = deriveEncoder
}
