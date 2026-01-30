package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ResponseFormatJsonObject
import org.openapitools.models.ResponseFormatJsonSchema
import org.openapitools.models.ResponseFormatJsonSchemaJsonSchema
import org.openapitools.models.ResponseFormatText

/**
 * An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 * @param _type The type of response format being defined: `text`
 * @param jsonUnderscoreschema 
 */
case class CreateChatCompletionRequestResponseFormat(_type: String,
                jsonUnderscoreschema: ResponseFormatJsonSchemaJsonSchema
                )

object CreateChatCompletionRequestResponseFormat {
    /**
     * Creates the codec for converting CreateChatCompletionRequestResponseFormat from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestResponseFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestResponseFormat] = deriveEncoder
}
