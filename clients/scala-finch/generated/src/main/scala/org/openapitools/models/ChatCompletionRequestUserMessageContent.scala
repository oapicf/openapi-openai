package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestUserMessageContentPart

/**
 * The contents of the user message. 
 */
case class ChatCompletionRequestUserMessageContent()

object ChatCompletionRequestUserMessageContent {
    /**
     * Creates the codec for converting ChatCompletionRequestUserMessageContent from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestUserMessageContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestUserMessageContent] = deriveEncoder
}
