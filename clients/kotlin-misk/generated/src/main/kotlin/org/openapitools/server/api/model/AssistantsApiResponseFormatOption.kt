package org.openapitools.server.api.model

import org.openapitools.server.api.model.ResponseFormatJsonObject
import org.openapitools.server.api.model.ResponseFormatJsonSchema
import org.openapitools.server.api.model.ResponseFormatJsonSchemaJsonSchema
import org.openapitools.server.api.model.ResponseFormatText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantsApiResponseFormatOption(
    /** The type of response format being defined: &#x60;text&#x60; */
    val type: kotlin.String,
    val jsonSchema: ResponseFormatJsonSchemaJsonSchema
)
