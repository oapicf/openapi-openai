package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
 */
case class CreateAssistantFileRequest(fileUnderscoreid: String
                )

object CreateAssistantFileRequest {
    /**
     * Creates the codec for converting CreateAssistantFileRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantFileRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantFileRequest] = deriveEncoder
}
