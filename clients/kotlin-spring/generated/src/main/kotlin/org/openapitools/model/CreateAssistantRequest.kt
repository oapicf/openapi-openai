package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssistantObjectToolsInner
import org.openapitools.model.AssistantsApiResponseFormatOption
import org.openapitools.model.CreateAssistantRequestModel
import org.openapitools.model.CreateAssistantRequestToolResources
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param model 
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
 * @param toolResources 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @param responseFormat 
 */
data class CreateAssistantRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: CreateAssistantRequestModel,

    @get:Size(max=256)
    @Schema(example = "null", description = "The name of the assistant. The maximum length is 256 characters. ")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Size(max=512)
    @Schema(example = "null", description = "The description of the assistant. The maximum length is 512 characters. ")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Size(max=256000)
    @Schema(example = "null", description = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @field:Valid
    @get:Size(max=128)
    @Schema(example = "null", description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. ")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<AssistantObjectToolsInner>? = arrayListOf(),

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tool_resources") val toolResources: CreateAssistantRequestToolResources? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="2")
    @Schema(example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
    @get:JsonProperty("top_p") val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("response_format") val responseFormat: AssistantsApiResponseFormatOption? = null
) {

}

