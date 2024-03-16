package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ImagesResponseDataInner
import scala.collection.immutable.Seq

/**
 * 
 * @param created 
 * @param data 
 */
case class ImagesResponse(created: Int,
                data: Seq[ImagesResponseDataInner]
                )

object ImagesResponse {
    /**
     * Creates the codec for converting ImagesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ImagesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImagesResponse] = deriveEncoder
}
