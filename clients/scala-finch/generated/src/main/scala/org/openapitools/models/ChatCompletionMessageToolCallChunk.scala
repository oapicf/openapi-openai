package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionMessageToolCallChunkFunction

/**
 * 
 * @param index 
 * @param id The ID of the tool call.
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionMessageToolCallChunk(index: Int,
                id: Option[String],
                _type: Option[String],
                function: Option[ChatCompletionMessageToolCallChunkFunction]
                )

object ChatCompletionMessageToolCallChunk {
    /**
     * Creates the codec for converting ChatCompletionMessageToolCallChunk from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionMessageToolCallChunk] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionMessageToolCallChunk] = deriveEncoder
}
