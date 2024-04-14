package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The role of the author of a message
 */
case class ChatCompletionRole()

object ChatCompletionRole {
    /**
     * Creates the codec for converting ChatCompletionRole from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRole] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRole] = deriveEncoder
}
