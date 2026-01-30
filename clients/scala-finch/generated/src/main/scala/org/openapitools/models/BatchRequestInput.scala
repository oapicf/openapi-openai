package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The per-line object of the batch input file
 * @param customUnderscoreid A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
 * @param method The HTTP method to be used for the request. Currently only `POST` is supported.
 * @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
 */
case class BatchRequestInput(customUnderscoreid: Option[String],
                method: Option[String],
                url: Option[String]
                )

object BatchRequestInput {
    /**
     * Creates the codec for converting BatchRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[BatchRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchRequestInput] = deriveEncoder
}
