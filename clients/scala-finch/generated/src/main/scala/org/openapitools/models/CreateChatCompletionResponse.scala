package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CompletionUsage
import org.openapitools.models.CreateChatCompletionResponseChoicesInner
import scala.collection.immutable.Seq

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * @param id A unique identifier for the chat completion.
 * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @param created The Unix timestamp (in seconds) of when the chat completion was created.
 * @param model The model used for the chat completion.
 * @param serviceUnderscoretier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
 * @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param _object The object type, which is always `chat.completion`.
 * @param usage 
 */
case class CreateChatCompletionResponse(id: String,
                choices: Seq[CreateChatCompletionResponseChoicesInner],
                created: Int,
                model: String,
                serviceUnderscoretier: Option[String],
                systemUnderscorefingerprint: Option[String],
                _object: String,
                usage: Option[CompletionUsage]
                )

object CreateChatCompletionResponse {
    /**
     * Creates the codec for converting CreateChatCompletionResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionResponse] = deriveEncoder
}
