package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchRequestOutputError
import org.openapitools.models.BatchRequestOutputResponse

/**
 * The per-line object of the batch output and error files
 * @param id 
 * @param customUnderscoreid A developer-provided per-request id that will be used to match outputs to inputs.
 * @param response 
 * @param error 
 */
case class BatchRequestOutput(id: Option[String],
                customUnderscoreid: Option[String],
                response: Option[BatchRequestOutputResponse],
                error: Option[BatchRequestOutputError]
                )

object BatchRequestOutput {
    /**
     * Creates the codec for converting BatchRequestOutput from and to JSON.
     */
    implicit val decoder: Decoder[BatchRequestOutput] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchRequestOutput] = deriveEncoder
}
