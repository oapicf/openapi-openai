package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionTool
import org.openapitools.models.FineTuneChatRequestInputMessagesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param messages 
 * @param tools A list of tools the model may generate JSON inputs for.
 * @param parallelUnderscoretoolUnderscorecalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 */
case class FineTunePreferenceRequestInputInput(messages: Option[Seq[FineTuneChatRequestInputMessagesInner]],
                tools: Option[Seq[ChatCompletionTool]],
                parallelUnderscoretoolUnderscorecalls: Option[Boolean]
                )

object FineTunePreferenceRequestInputInput {
    /**
     * Creates the codec for converting FineTunePreferenceRequestInputInput from and to JSON.
     */
    implicit val decoder: Decoder[FineTunePreferenceRequestInputInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTunePreferenceRequestInputInput] = deriveEncoder
}
