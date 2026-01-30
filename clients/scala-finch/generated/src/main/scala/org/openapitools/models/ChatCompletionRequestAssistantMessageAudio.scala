package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 * @param id Unique identifier for a previous audio response from the model. 
 */
case class ChatCompletionRequestAssistantMessageAudio(id: String
                )

object ChatCompletionRequestAssistantMessageAudio {
    /**
     * Creates the codec for converting ChatCompletionRequestAssistantMessageAudio from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestAssistantMessageAudio] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestAssistantMessageAudio] = deriveEncoder
}
