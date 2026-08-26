@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("instructions")
    val instructions: kotlin.String,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

    @field:JsonProperty("tool_resources")
    val toolResources: AssistantObjectToolResources? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = 1,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = 1,

    @field:JsonProperty("response_format")
    val responseFormat: AssistantsApiResponseFormatOption? = null,

)
