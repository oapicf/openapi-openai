package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 */
case class BatchRequestOutputError(code: Option[String],
                message: Option[String]
                )

object BatchRequestOutputError {
    /**
     * Creates the codec for converting BatchRequestOutputError from and to JSON.
     */
    implicit val decoder: Decoder[BatchRequestOutputError] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchRequestOutputError] = deriveEncoder
}
