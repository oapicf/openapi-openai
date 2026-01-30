package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartText

/**
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */
case class PredictionContentContent()

object PredictionContentContent {
    /**
     * Creates the codec for converting PredictionContentContent from and to JSON.
     */
    implicit val decoder: Decoder[PredictionContentContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[PredictionContentContent] = deriveEncoder
}
