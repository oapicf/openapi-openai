package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The per-line training example of a fine-tuning input file for completions models
 * @param prompt The input prompt for this training example.
 * @param completion The desired completion for this training example.
 */
case class FineTuneCompletionRequestInput(prompt: Option[String],
                completion: Option[String]
                )

object FineTuneCompletionRequestInput {
    /**
     * Creates the codec for converting FineTuneCompletionRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[FineTuneCompletionRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuneCompletionRequestInput] = deriveEncoder
}
