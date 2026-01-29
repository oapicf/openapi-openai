package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationResponseResultsInner
import scala.collection.immutable.Seq

/**
 * Represents if a given text input is potentially harmful.
 * @param id The unique identifier for the moderation request.
 * @param model The model used to generate the moderation results.
 * @param results A list of moderation objects.
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
