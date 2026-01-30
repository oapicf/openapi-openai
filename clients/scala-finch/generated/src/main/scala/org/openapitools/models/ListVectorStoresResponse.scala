package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListVectorStoresResponse(_object: String,
                data: Seq[VectorStoreObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListVectorStoresResponse {
    /**
     * Creates the codec for converting ListVectorStoresResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListVectorStoresResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListVectorStoresResponse] = deriveEncoder
}
