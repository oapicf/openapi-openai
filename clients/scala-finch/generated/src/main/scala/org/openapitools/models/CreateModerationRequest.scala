package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationRequestInput
import org.openapitools.models.CreateModerationRequestModel

/**
 * 
 * @param input 
 * @param model 
 */
case class CreateModerationRequest(input: CreateModerationRequestInput,
                model: Option[CreateModerationRequestModel]
                )

object CreateModerationRequest {
    /**
     * Creates the codec for converting CreateModerationRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequest] = deriveEncoder
}
