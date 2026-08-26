@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ModifyAssistantRequest(
    @field:JsonProperty("model")
    val model: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("instructions")
    val instructions: kotlin.String? = null,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner>? = arrayListOf(),

    @field:JsonProperty("tool_resources")
    val toolResources: ModifyAssistantRequestToolResources? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = 1,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = 1,

    @field:JsonProperty("response_format")
    val responseFormat: AssistantsApiResponseFormatOption? = null,

)
