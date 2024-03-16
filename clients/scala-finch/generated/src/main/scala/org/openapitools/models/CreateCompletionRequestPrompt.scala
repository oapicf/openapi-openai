package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */
case class CreateCompletionRequestPrompt()

object CreateCompletionRequestPrompt {
    /**
     * Creates the codec for converting CreateCompletionRequestPrompt from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionRequestPrompt] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionRequestPrompt] = deriveEncoder
}
