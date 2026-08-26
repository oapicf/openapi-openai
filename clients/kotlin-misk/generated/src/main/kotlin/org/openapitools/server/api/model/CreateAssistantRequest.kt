package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObjectToolsInner
import org.openapitools.server.api.model.AssistantsApiResponseFormatOption
import org.openapitools.server.api.model.CreateAssistantRequestModel
import org.openapitools.server.api.model.CreateAssistantRequestToolResources
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssistantRequest(
    val model: CreateAssistantRequestModel,
    /** The name of the assistant. The maximum length is 256 characters.  */
    val name: kotlin.String? = null,
    /** The description of the assistant. The maximum length is 512 characters.  */
    val description: kotlin.String? = null,
    /** The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    val instructions: kotlin.String? = null,
    /** A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  */
    val tools: kotlin.collections.List<AssistantObjectToolsInner>? = arrayListOf(),
    val toolResources: CreateAssistantRequestToolResources? = null,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any? = null,
    /** What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),
    /** An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),
    val responseFormat: AssistantsApiResponseFormatOption? = null
)
