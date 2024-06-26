package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionMessageToolCall
import org.openapitools.models.ChatCompletionRequestAssistantMessageFunctionCall
import scala.collection.immutable.Seq

/**
 * A chat completion message generated by the model.
 * @param content The contents of the message.
 * @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
 * @param role The role of the author of this message.
 * @param functionUnderscorecall 
 */
case class ChatCompletionResponseMessage(content: String,
                toolUnderscorecalls: Option[Seq[ChatCompletionMessageToolCall]],
                role: String,
                functionUnderscorecall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
                )

object ChatCompletionResponseMessage {
    /**
     * Creates the codec for converting ChatCompletionResponseMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionResponseMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionResponseMessage] = deriveEncoder
}
