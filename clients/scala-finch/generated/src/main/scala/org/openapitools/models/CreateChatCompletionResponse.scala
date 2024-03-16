package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateChatCompletionResponseChoicesInner
import org.openapitools.models.CreateCompletionResponseUsage
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param _object 
 * @param created 
 * @param model 
 * @param choices 
 * @param usage 
 */
case class CreateChatCompletionResponse(id: String,
                _object: String,
                created: Int,
                model: String,
                choices: Seq[CreateChatCompletionResponseChoicesInner],
                usage: Option[CreateCompletionResponseUsage]
                )

object CreateChatCompletionResponse {
    /**
     * Creates the codec for converting CreateChatCompletionResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionResponse] = deriveEncoder
}
