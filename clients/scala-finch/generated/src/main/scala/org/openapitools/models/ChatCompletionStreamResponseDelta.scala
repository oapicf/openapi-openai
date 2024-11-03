package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionMessageToolCallChunk
import org.openapitools.models.ChatCompletionStreamResponseDeltaFunctionCall
import scala.collection.immutable.Seq

/**
 * A chat completion delta generated by streamed model responses.
 * @param content The contents of the chunk message.
 * @param functionUnderscorecall 
 * @param toolUnderscorecalls 
 * @param role The role of the author of this message.
 */
case class ChatCompletionStreamResponseDelta(content: Option[String],
                functionUnderscorecall: Option[ChatCompletionStreamResponseDeltaFunctionCall],
                toolUnderscorecalls: Option[Seq[ChatCompletionMessageToolCallChunk]],
                role: Option[String]
                )

object ChatCompletionStreamResponseDelta {
    /**
     * Creates the codec for converting ChatCompletionStreamResponseDelta from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionStreamResponseDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionStreamResponseDelta] = deriveEncoder
}
