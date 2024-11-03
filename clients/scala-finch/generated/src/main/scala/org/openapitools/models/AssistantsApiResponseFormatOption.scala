package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantsApiResponseFormat

/**
 * Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 * @param _type Must be one of `text` or `json_object`.
 */
case class AssistantsApiResponseFormatOption(_type: Option[String]
                )

object AssistantsApiResponseFormatOption {
    /**
     * Creates the codec for converting AssistantsApiResponseFormatOption from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsApiResponseFormatOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsApiResponseFormatOption] = deriveEncoder
}
