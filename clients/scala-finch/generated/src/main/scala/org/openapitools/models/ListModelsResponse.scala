package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Model
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 */
case class ListModelsResponse(_object: String,
                data: Seq[Model]
                )

object ListModelsResponse {
    /**
     * Creates the codec for converting ListModelsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListModelsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListModelsResponse] = deriveEncoder
}
