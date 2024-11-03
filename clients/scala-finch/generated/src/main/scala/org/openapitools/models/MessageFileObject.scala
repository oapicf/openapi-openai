package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A list of files attached to a `message`.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread.message.file`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the message file was created.
 * @param messageUnderscoreid The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
 */
case class MessageFileObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                messageUnderscoreid: String
                )

object MessageFileObject {
    /**
     * Creates the codec for converting MessageFileObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageFileObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageFileObject] = deriveEncoder
}
