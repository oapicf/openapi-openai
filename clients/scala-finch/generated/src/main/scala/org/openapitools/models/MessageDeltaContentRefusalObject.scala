package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The refusal content that is part of a message.
 * @param index The index of the refusal part in the message.
 * @param _type Always `refusal`.
 * @param refusal 
 */
case class MessageDeltaContentRefusalObject(index: Int,
                _type: String,
                refusal: Option[String]
                )

object MessageDeltaContentRefusalObject {
    /**
     * Creates the codec for converting MessageDeltaContentRefusalObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentRefusalObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentRefusalObject] = deriveEncoder
}
