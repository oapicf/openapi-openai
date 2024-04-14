package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 */
case class CreateEmbeddingRequestInput()

object CreateEmbeddingRequestInput {
    /**
     * Creates the codec for converting CreateEmbeddingRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingRequestInput] = deriveEncoder
}
