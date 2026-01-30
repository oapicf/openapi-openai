package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantObjectToolsInner
import org.openapitools.models.AssistantsApiResponseFormatOption
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateAssistantRequestModel
import org.openapitools.models.CreateAssistantRequestToolResources
import scala.collection.immutable.Seq

/**
 * 
 * @param model 
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
 * @param toolUnderscoreresources 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @param responseUnderscoreformat 
 */
case class CreateAssistantRequest(model: CreateAssistantRequestModel,
                name: Option[String],
                description: Option[String],
                instructions: Option[String],
                tools: Option[Seq[AssistantObjectToolsInner]],
                toolUnderscoreresources: Option[CreateAssistantRequestToolResources],
                metadata: Option[Object],
                temperature: Option[BigDecimal],
                topUnderscorep: Option[BigDecimal],
                responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
                )

object CreateAssistantRequest {
    /**
     * Creates the codec for converting CreateAssistantRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequest] = deriveEncoder
}
