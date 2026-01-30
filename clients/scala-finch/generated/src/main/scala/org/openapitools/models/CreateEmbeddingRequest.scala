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
 * @param input 
 * @param model 
 * @param encodingUnderscoreformat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
 * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
 */
case class CreateEmbeddingRequest(input: CreateEmbeddingRequestInput,
                model: CreateEmbeddingRequestModel,
                encodingUnderscoreformat: Option[String],
                dimensions: Option[Int],
                user: Option[String]
                )

object CreateEmbeddingRequest {
    /**
     * Creates the codec for converting CreateEmbeddingRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingRequest] = deriveEncoder
}
