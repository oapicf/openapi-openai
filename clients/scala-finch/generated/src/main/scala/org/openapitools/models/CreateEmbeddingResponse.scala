package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateEmbeddingResponseDataInner
import org.openapitools.models.CreateEmbeddingResponseUsage
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param model 
 * @param data 
 * @param usage 
 */
case class CreateEmbeddingResponse(_object: String,
                model: String,
                data: Seq[CreateEmbeddingResponseDataInner],
                usage: CreateEmbeddingResponseUsage
                )

object CreateEmbeddingResponse {
    /**
     * Creates the codec for converting CreateEmbeddingResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingResponse] = deriveEncoder
}
