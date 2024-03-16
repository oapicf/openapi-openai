package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param url 
 * @param b64Underscorejson 
 */
case class ImagesResponseDataInner(url: Option[String],
                b64Underscorejson: Option[String]
                )

object ImagesResponseDataInner {
    /**
     * Creates the codec for converting ImagesResponseDataInner from and to JSON.
     */
    implicit val decoder: Decoder[ImagesResponseDataInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ImagesResponseDataInner] = deriveEncoder
}
