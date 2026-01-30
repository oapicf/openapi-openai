package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestAssistantMessageContentPart

/**
 * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 */
case class ChatCompletionRequestAssistantMessageContent()

object ChatCompletionRequestAssistantMessageContent {
    /**
     * Creates the codec for converting ChatCompletionRequestAssistantMessageContent from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestAssistantMessageContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestAssistantMessageContent] = deriveEncoder
}
