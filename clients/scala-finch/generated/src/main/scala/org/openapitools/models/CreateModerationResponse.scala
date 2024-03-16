package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationResponseResultsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param model 
 * @param results 
 */
case class CreateModerationResponse(id: String,
                model: String,
                results: Seq[CreateModerationResponseResultsInner]
                )

object CreateModerationResponse {
    /**
     * Creates the codec for converting CreateModerationResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationResponse] = deriveEncoder
}
