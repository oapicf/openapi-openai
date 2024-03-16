package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateChatCompletionStreamResponseChoicesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param _object 
 * @param created 
 * @param model 
 * @param choices 
 */
case class CreateChatCompletionStreamResponse(id: String,
                _object: String,
                created: Int,
                model: String,
                choices: Seq[CreateChatCompletionStreamResponseChoicesInner]
                )

object CreateChatCompletionStreamResponse {
    /**
     * Creates the codec for converting CreateChatCompletionStreamResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionStreamResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionStreamResponse] = deriveEncoder
}
