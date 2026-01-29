package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the thread was created.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
case class ThreadObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                metadata: Object
                )

object ThreadObject {
    /**
     * Creates the codec for converting ThreadObject from and to JSON.
     */
    implicit val decoder: Decoder[ThreadObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[ThreadObject] = deriveEncoder
}
