package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObjectToolResources
import org.openapitools.server.api.model.AssistantObjectToolsInner
import org.openapitools.server.api.model.AssistantsApiResponseFormatOption
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;assistant&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the assistant was created. */
    val createdAt: kotlin.Int,
    /** The name of the assistant. The maximum length is 256 characters.  */
    val name: kotlin.String,
    /** The description of the assistant. The maximum length is 512 characters.  */
    val description: kotlin.String,
    /** ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  */
    val model: kotlin.String,
    /** The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    val instructions: kotlin.String,
    /** A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  */
    val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any,
    val toolResources: AssistantObjectToolResources? = null,
    /** What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),
    /** An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),
    val responseFormat: AssistantsApiResponseFormatOption? = null
)
