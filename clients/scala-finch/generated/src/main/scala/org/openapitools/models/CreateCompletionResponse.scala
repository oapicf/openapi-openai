package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CompletionUsage
import org.openapitools.models.CreateCompletionResponseChoicesInner
import scala.collection.immutable.Seq

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 * @param id A unique identifier for the completion.
 * @param choices The list of completion choices the model generated for the input prompt.
 * @param created The Unix timestamp (in seconds) of when the completion was created.
 * @param model The model used for completion.
 * @param systemUnderscorefingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param _object The object type, which is always \"text_completion\"
 * @param usage 
 */
case class CreateCompletionResponse(id: String,
                choices: Seq[CreateCompletionResponseChoicesInner],
                created: Int,
                model: String,
                systemUnderscorefingerprint: Option[String],
                _object: String,
                usage: Option[CompletionUsage]
                )

object CreateCompletionResponse {
    /**
     * Creates the codec for converting CreateCompletionResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponse] = deriveEncoder
}
