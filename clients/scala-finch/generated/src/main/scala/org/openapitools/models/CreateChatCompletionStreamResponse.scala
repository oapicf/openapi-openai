package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateChatCompletionStreamResponseChoicesInner
import org.openapitools.models.CreateChatCompletionStreamResponseUsage
import scala.collection.immutable.Seq

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 * @param id A unique identifier for the chat completion. Each chunk has the same ID.
 * @param choices A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
 * @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
 * @param model The model to generate the completion.
 * @param serviceUnderscoretier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
 * @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param _object The object type, which is always `chat.completion.chunk`.
 * @param usage 
 */
case class CreateChatCompletionStreamResponse(id: String,
                choices: Seq[CreateChatCompletionStreamResponseChoicesInner],
                created: Int,
                model: String,
                serviceUnderscoretier: Option[String],
                systemUnderscorefingerprint: Option[String],
                _object: String,
                usage: Option[CreateChatCompletionStreamResponseUsage]
                )

object CreateChatCompletionStreamResponse {
    /**
     * Creates the codec for converting CreateChatCompletionStreamResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionStreamResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionStreamResponse] = deriveEncoder
}
