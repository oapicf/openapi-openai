package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreFileObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListVectorStoreFilesResponse(_object: String,
                data: Seq[VectorStoreFileObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListVectorStoreFilesResponse {
    /**
     * Creates the codec for converting ListVectorStoreFilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListVectorStoreFilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListVectorStoreFilesResponse] = deriveEncoder
}
