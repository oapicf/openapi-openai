package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PredictionContentContent

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 * @param _type The type of the predicted content you want to provide. This type is currently always `content`. 
 * @param content 
 */
case class PredictionContent(_type: String,
                content: PredictionContentContent
                )

object PredictionContent {
    /**
     * Creates the codec for converting PredictionContent from and to JSON.
     */
    implicit val decoder: Decoder[PredictionContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[PredictionContent] = deriveEncoder
}
