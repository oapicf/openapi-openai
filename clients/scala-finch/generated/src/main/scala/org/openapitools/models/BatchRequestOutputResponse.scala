package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param statusUnderscorecode The HTTP status code of the response
 * @param requestUnderscoreid An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
 * @param body The JSON body of the response
 */
case class BatchRequestOutputResponse(statusUnderscorecode: Option[Int],
                requestUnderscoreid: Option[String],
                body: Option[Object]
                )

object BatchRequestOutputResponse {
    /**
     * Creates the codec for converting BatchRequestOutputResponse from and to JSON.
     */
    implicit val decoder: Decoder[BatchRequestOutputResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchRequestOutputResponse] = deriveEncoder
}
