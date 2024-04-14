package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * On an incomplete message, details about why the message is incomplete.
 * @param reason The reason the message is incomplete.
 */
case class MessageObjectIncompleteDetails(reason: String
                )

object MessageObjectIncompleteDetails {
    /**
     * Creates the codec for converting MessageObjectIncompleteDetails from and to JSON.
     */
    implicit val decoder: Decoder[MessageObjectIncompleteDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageObjectIncompleteDetails] = deriveEncoder
}
