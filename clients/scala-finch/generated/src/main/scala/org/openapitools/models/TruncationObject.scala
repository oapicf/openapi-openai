package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 * @param _type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
 * @param lastUnderscoremessages The number of most recent messages from the thread when constructing the context for the run.
 */
case class TruncationObject(_type: String,
                lastUnderscoremessages: Option[Int]
                )

object TruncationObject {
    /**
     * Creates the codec for converting TruncationObject from and to JSON.
     */
    implicit val decoder: Decoder[TruncationObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[TruncationObject] = deriveEncoder
}
