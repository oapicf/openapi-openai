package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `assistant.file`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the assistant file was created.
 * @param assistantUnderscoreid The assistant ID that the file is attached to.
 */
case class AssistantFileObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                assistantUnderscoreid: String
                )

object AssistantFileObject {
    /**
     * Creates the codec for converting AssistantFileObject from and to JSON.
     */
    implicit val decoder: Decoder[AssistantFileObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantFileObject] = deriveEncoder
}
