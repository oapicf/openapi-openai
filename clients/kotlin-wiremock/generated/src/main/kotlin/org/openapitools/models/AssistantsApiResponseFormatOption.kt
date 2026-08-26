@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantsApiResponseFormatOption(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("json_schema")
    val jsonSchema: ResponseFormatJsonSchemaJsonSchema,

)
