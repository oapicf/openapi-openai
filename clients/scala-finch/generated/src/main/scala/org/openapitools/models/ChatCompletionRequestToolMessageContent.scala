package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartText

/**
 * The contents of the tool message.
 */
case class ChatCompletionRequestToolMessageContent()

object ChatCompletionRequestToolMessageContent {
    /**
     * Creates the codec for converting ChatCompletionRequestToolMessageContent from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestToolMessageContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestToolMessageContent] = deriveEncoder
}
