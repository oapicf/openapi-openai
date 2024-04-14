package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantObjectToolsInner
import org.openapitools.models.CreateAssistantRequestModel
import scala.collection.immutable.Seq

/**
 * 
 * @param model 
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
case class CreateAssistantRequest(model: CreateAssistantRequestModel,
                name: Option[String],
                description: Option[String],
                instructions: Option[String],
                tools: Option[Seq[AssistantObjectToolsInner]],
                fileUnderscoreids: Option[Seq[String]],
                metadata: Option[Object]
                )

object CreateAssistantRequest {
    /**
     * Creates the codec for converting CreateAssistantRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequest] = deriveEncoder
}
