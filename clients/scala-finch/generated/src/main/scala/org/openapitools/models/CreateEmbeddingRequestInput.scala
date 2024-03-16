package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
 */
case class CreateEmbeddingRequestInput()

object CreateEmbeddingRequestInput {
    /**
     * Creates the codec for converting CreateEmbeddingRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[CreateEmbeddingRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEmbeddingRequestInput] = deriveEncoder
}
