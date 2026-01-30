package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionFunctions
import org.openapitools.models.ChatCompletionTool
import org.openapitools.models.FineTuneChatRequestInputMessagesInner
import scala.collection.immutable.Seq

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 * @param messages 
 * @param tools A list of tools the model may generate JSON inputs for.
 * @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @param functions A list of functions the model may generate JSON inputs for.
 */
case class FineTuneChatRequestInput(messages: Option[Seq[FineTuneChatRequestInputMessagesInner]],
                tools: Option[Seq[ChatCompletionTool]],
                parallelUnderscoretoolUnderscorecalls: Option[Boolean],
                functions: Option[Seq[ChatCompletionFunctions]]
                )

object FineTuneChatRequestInput {
    /**
     * Creates the codec for converting FineTuneChatRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneChatRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneChatRequestInput] = deriveEncoder
}
