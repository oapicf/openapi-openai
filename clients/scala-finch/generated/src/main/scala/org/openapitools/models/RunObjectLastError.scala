package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The last error associated with this run. Will be `null` if there are no errors.
 * @param code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
 * @param message A human-readable description of the error.
 */
case class RunObjectLastError(code: String,
                message: String
                )

object RunObjectLastError {
    /**
     * Creates the codec for converting RunObjectLastError from and to JSON.
     */
    implicit val decoder: Decoder[RunObjectLastError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunObjectLastError] = deriveEncoder
}
