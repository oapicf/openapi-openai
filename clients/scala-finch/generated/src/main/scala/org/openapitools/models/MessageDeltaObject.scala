package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaObjectDelta

/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 * @param id The identifier of the message, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread.message.delta`.
 * @param delta 
 */
case class MessageDeltaObject(id: String,
                _object: String,
                delta: MessageDeltaObjectDelta
                )

object MessageDeltaObject {
    /**
     * Creates the codec for converting MessageDeltaObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaObject] = deriveEncoder
}
