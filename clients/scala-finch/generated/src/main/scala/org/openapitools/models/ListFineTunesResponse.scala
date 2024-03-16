package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTune
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 */
case class ListFineTunesResponse(_object: String,
                data: Seq[FineTune]
                )

object ListFineTunesResponse {
    /**
     * Creates the codec for converting ListFineTunesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListFineTunesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListFineTunesResponse] = deriveEncoder
}
