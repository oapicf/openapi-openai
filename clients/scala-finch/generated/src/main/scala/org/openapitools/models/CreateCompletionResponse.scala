package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateCompletionResponseChoicesInner
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
case class CreateCompletionResponse(id: String,
                _object: String,
                created: Int,
                model: String,
                choices: Seq[CreateCompletionResponseChoicesInner],
                usage: Option[CreateCompletionResponseUsage]
                )

object CreateCompletionResponse {
    /**
     * Creates the codec for converting CreateCompletionResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionResponse] = deriveEncoder
}
