package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartText

/**
 * The contents of the developer message.
 */
case class ChatCompletionRequestDeveloperMessageContent()

object ChatCompletionRequestDeveloperMessageContent {
    /**
     * Creates the codec for converting ChatCompletionRequestDeveloperMessageContent from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestDeveloperMessageContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestDeveloperMessageContent] = deriveEncoder
}
