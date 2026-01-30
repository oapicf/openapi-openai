package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantToolsCode
import org.openapitools.models.AssistantToolsFileSearchTypeOnly

/**
 * 
 * @param _type The type of tool being defined: `code_interpreter`
 */
case class CreateMessageRequestAttachmentsInnerToolsInner(_type: String
                )

object CreateMessageRequestAttachmentsInnerToolsInner {
    /**
     * Creates the codec for converting CreateMessageRequestAttachmentsInnerToolsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateMessageRequestAttachmentsInnerToolsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMessageRequestAttachmentsInnerToolsInner] = deriveEncoder
}
