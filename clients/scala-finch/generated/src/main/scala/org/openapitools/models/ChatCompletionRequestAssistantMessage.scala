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
 * 
 * @param content The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 * @param role The role of the messages author, in this case `assistant`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @param toolUnderscorecalls The tool calls generated by the model, such as function calls.
 * @param functionUnderscorecall 
 */
case class ChatCompletionRequestAssistantMessage(content: Option[String],
                role: String,
                name: Option[String],
                toolUnderscorecalls: Option[Seq[ChatCompletionMessageToolCall]],
                functionUnderscorecall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
                )

object ChatCompletionRequestAssistantMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestAssistantMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestAssistantMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestAssistantMessage] = deriveEncoder
}
