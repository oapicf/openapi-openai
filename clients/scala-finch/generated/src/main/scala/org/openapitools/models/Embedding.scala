package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * Represents an embedding vector returned by embedding endpoint. 
 * @param index The index of the embedding in the list of embeddings.
 * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
 * @param _object The object type, which is always \"embedding\".
 */
case class Embedding(index: Int,
                embedding: Seq[BigDecimal],
                _object: String
                )

object Embedding {
    /**
     * Creates the codec for converting Embedding from and to JSON.
     */
    implicit val decoder: Decoder[Embedding] = deriveDecoder
    implicit val encoder: ObjectEncoder[Embedding] = deriveEncoder
}
