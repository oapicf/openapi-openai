package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateEmbeddingRequestInput
import org.openapitools.models.CreateEmbeddingRequestModel

/**
 * 
 * @param model 
 * @param input 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
case class CreateEmbeddingRequest(model: CreateEmbeddingRequestModel,
                input: CreateEmbeddingRequestInput,
                user: Option[String]
                )

object CreateEmbeddingRequest {
    /**
     * Creates the codec for converting CreateEmbeddingRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingRequest] = deriveEncoder
}
