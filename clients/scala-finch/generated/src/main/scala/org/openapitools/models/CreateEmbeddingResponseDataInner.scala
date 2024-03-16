package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param index 
 * @param _object 
 * @param embedding 
 */
case class CreateEmbeddingResponseDataInner(index: Int,
                _object: String,
                embedding: Seq[BigDecimal]
                )

object CreateEmbeddingResponseDataInner {
    /**
     * Creates the codec for converting CreateEmbeddingResponseDataInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingResponseDataInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingResponseDataInner] = deriveEncoder
}
